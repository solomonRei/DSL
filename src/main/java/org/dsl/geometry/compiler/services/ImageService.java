package org.dsl.geometry.compiler.services;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class ImageService {

    @Value("${image.storage.path}")
    private String storagePath;

    public String saveImage(BufferedImage image, String fileName) throws IOException {
        File directory = new File(storagePath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
        File outputFile = new File(directory, fileName);
        ImageIO.write(image, "PNG", outputFile);
        return outputFile.getAbsolutePath();
    }
}

