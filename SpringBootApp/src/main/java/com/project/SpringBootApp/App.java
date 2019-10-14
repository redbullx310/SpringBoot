package com.project.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class App extends SpringBootServletInitializer {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
    }
    
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    	return builder.sources(App.class);
    }
}
