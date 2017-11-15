package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.demo.filter.TimeFilter;

@Configuration
@EnableWebMvc
public class WebConfig {

	@Bean
	public FilterRegistrationBean registerFilters() {
		FilterRegistrationBean frb = new FilterRegistrationBean();
		frb.setFilter(new TimeFilter());
		frb.addUrlPatterns("/welcome");
		return frb;
	}

}
