package org.dsl.geometry.compiler;

import java.io.IOException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.dsl.geometry.CustomListener;
import org.dsl.geometry.grammar.GeometryLexer;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.GeometrySketchHeadless;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class CompilerService {

  private final ImageService imageService;

  public String compile(String input) {
    CharStream stream = CharStreams.fromString(input);

    GeometryLexer lexer = new GeometryLexer(stream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    GeometryParser parser = new GeometryParser(tokens);

    GeometryParser.ProgramContext tree = parser.program();

    log.info("Parsing input");

    CustomListener listener = new CustomListener();
    ParseTreeWalker.DEFAULT.walk(listener, tree);

    log.info("Creating sketch");

    GeometrySketchHeadless sketch = new GeometrySketchHeadless(listener.getFigures());

    log.info("Creating image");

    sketch.outputFigures();

    try {
      String imagePath = imageService.saveImage(sketch.outputFigures(), "output.png");
      log.info("Image saved at {}", imagePath);
      return "output.png";
    } catch (IOException e) {
      log.error("Error while saving image", e);
      return "error.png";
    }
  }
}
