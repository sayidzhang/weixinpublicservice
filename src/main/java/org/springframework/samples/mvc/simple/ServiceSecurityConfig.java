package org.springframework.samples.mvc.simple;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class ServiceSecurityConfig extends WebSecurityConfigurerAdapter {
	  @Override
	  protected void configure(HttpSecurity http) throws Exception {
		  System.out.println("disable csrf...");

			http
			.antMatcher("/api/**")                              
			.authorizeRequests()
				.anyRequest().hasRole("ADMIN")
				.and()
			.httpBasic();
	  }
	}



