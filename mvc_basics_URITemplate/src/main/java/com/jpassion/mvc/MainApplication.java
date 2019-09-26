package com.jpassion.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MainApplication {

	@Bean
	WebMvcConfigurerAdapter mvcViewConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addRedirectViewController("/", "/index.html");
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}
}
