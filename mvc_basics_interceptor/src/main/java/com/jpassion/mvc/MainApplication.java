package com.jpassion.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.jpassion.mvc.interceptors.ElapsedTimeInterceptor;
import com.jpassion.mvc.interceptors.LoggingInterceptor;

@Configuration
@ComponentScan("com.jpassion")
@EnableAutoConfiguration
public class MainApplication {

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Bean
	WebMvcConfigurerAdapter mvcViewConfigurer() {
		return new WebMvcConfigurerAdapter() {

			// Configure interceptors
			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoggingInterceptor());
				registry.addInterceptor(new ElapsedTimeInterceptor());
				// You can also add path patterns through which interceptors get applied
				registry.addInterceptor(new ElapsedTimeInterceptor()).addPathPatterns(
						"/helloworld/*");

			}

			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addRedirectViewController("/", "/helloworld");
			}
		};
	}
}
