package org.dsl.geometry.compiler;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.dsl.geometry.CustomListener;
import org.dsl.geometry.grammar.GeometryLexer;
import org.dsl.geometry.grammar.GeometryParser;
import org.dsl.geometry.processing.GeometrySketchHeadless;
import org.dsl.geometry.processing.elements.Drawable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        List<Drawable> figures = new ArrayList<>(listener.getFigures().values());

        GeometrySketchHeadless sketch = new GeometrySketchHeadless(figures);

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

    public Map<String, Object> processTranscription(String transcription) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:5000"))
                .header("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(transcription))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Map<String, Object> result = new HashMap<>();
            result.put("response", response.body());
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
