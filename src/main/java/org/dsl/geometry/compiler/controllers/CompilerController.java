package org.dsl.geometry.compiler.controllers;

import lombok.RequiredArgsConstructor;
import org.dsl.geometry.compiler.services.CFGService;
import org.dsl.geometry.compiler.services.CompilerService;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
public class CompilerController {

    private final CompilerService compilerService;

    private final ObjectProvider<CFGService> cfgServiceProvider;

    @PostMapping(
            value = "/compile",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Map<String, String> compileDsl(@RequestBody Map<String, String> request) {
        String dslCode = request.get("dslCode");
        String imagePath = compilerService.compile(dslCode);
        Map<String, String> response = new HashMap<>();
        response.put("imagePath", imagePath);
        return response;
    }

    @PostMapping(value = "/cfg")
    public Map<String, String> compileCFG(@RequestBody Map<String, String> request) {
        String dslCode = request.get("dslCode");
        int lineCount = 1;

        if (dslCode != null && !dslCode.isEmpty()) {
            lineCount = dslCode.split("\n", -1).length;
        }

        CFGService cfgService = cfgServiceProvider.getObject();
        cfgService.setInputAndLineCount(dslCode, lineCount);
        cfgService.convertCFGtoCNF();
        String r = cfgService.getResponse().toString();
        Map<String, String> response = new HashMap<>();
        response.put("cfg", r);
        return response;
    }
}
