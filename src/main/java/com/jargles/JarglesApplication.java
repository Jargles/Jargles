package com.jargles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

@SpringBootApplication
public class JarglesApplication extends SpringBootServletInitializer{
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JarglesApplication.class);
    }
	
	@Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }

	public static void main(String[] args) {
		SpringApplication.run(JarglesApplication.class, args);
	}

}
