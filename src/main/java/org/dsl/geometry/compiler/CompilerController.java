package org.dsl.geometry.compiler;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class CompilerController {

  private final CompilerService compilerService;

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @PostMapping("/compile")
  public String compileDsl(@RequestParam String dslCode, Model model) {
    String imagePath = compilerService.compile(dslCode);
    model.addAttribute("imagePath", imagePath);
    return "result";
  }
}
