package com.kmochocki.showcase.simplecrud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SimpleCrudApplication {

  public static void main(String[] args) {
    SpringApplication.run(SimpleCrudApplication.class, args);
  }

}
