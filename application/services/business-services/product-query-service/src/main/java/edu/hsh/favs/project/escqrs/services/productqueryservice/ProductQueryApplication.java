package edu.hsh.favs.project.escqrs.services.productqueryservice;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class ProductQueryApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(ProductQueryApplication.class)
        .web(WebApplicationType.REACTIVE)
        .run(args);
  }

  @Configuration
  @EnableBinding(Source.class)
  static class StreamConfig {}
}
