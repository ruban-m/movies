package dev.ruban.movies;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/api/**");
    // .allowedOrigins("https://domain2.com")
    // .allowedMethods("PUT", "DELETE")
    // .allowedHeaders("header1", "header2", "header3")
    // .exposedHeaders("header1", "header2")
    // .allowCredentials(true).maxAge(3600);

    // Add more mappings...
  }
}
