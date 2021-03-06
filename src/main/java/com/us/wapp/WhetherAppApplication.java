package com.us.wapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.us.wapp.config.JwtFilter;

@SpringBootApplication
public class WhetherAppApplication {

	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/data/*");

		return registrationBean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WhetherAppApplication.class, args);
	}

}

