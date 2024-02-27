package org.dsl.geometry.compiler.controllers;

import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.dsl.geometry.compiler.CompilerService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompilerController {

  private final CompilerService compilerService;

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
}
