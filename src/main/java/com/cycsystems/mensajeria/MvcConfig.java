package com.cycsystems.mensajeria;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/error_403").setViewName("error_403");
	}
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/api/**")
			.allowedOrigins("http://localhost:4200")
				.allowedOrigins("https://cycsystemsgt.com")
			.allowCredentials(true)
			.allowedMethods("GET, PUT, POST, DELETE, OPTIONS")
			.allowedHeaders("Host,Accept,Origin,X-Frame-Options,X-Requested-With,Authorization,content-type,x-auth-token");
	}
}
