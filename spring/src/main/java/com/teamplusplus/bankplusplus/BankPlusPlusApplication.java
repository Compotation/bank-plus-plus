package com.teamplusplus.bankplusplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class BankPlusPlusApplication {
  public static void main(String[] args) {
    SpringApplication.run(BankPlusPlusApplication.class, args);
  }
/*
  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:8000", "https://bankstorageacc.z20.web.core.windows.net").allowCredentials(true);
      }
    };
  }
*/
}
