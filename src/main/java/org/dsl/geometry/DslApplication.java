package org.dsl.geometry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DslApplication {

  public static void main(String[] args) {
    System.setProperty("java.awt.headless", "true");
    SpringApplication.run(DslApplication.class, args);
  }
}
