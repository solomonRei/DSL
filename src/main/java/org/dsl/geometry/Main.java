package org.dsl.geometry;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.dsl.geometry.grammar.GeometryLexer;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.GeometrySketch;

public class Main {

  public static void main(String[] args) {
    String input = "Point A(100, 100);\n" + "Point B(200, 200);\n" + "Line L(A, B);";
    ANTLRInputStream inputStream = new ANTLRInputStream(input);

    GeometryLexer lexer = new GeometryLexer(inputStream);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    GeometryParser parser = new GeometryParser(tokens);

    GeometryParser.ProgramContext tree = parser.program();

    CustomListener listener = new CustomListener();
    ParseTreeWalker.DEFAULT.walk(listener, tree);

    GeometrySketch sketch = new GeometrySketch();
    sketch.setFigures(listener.getFigures());
    sketch.runSketch();
  }
}
