//package org.springframework.samples.mvc.simple;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.annotation.Order;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
// @Configuration
// @ComponentScan
// @EnableWebSecurity
// public class SecurityConfig {
//
//	@Order(1)
//    @Configuration
//    public static class SoapApiConfigurationAdapter extends WebSecurityConfigurerAdapter {
//        protected void configure(HttpSecurity http) throws Exception {
//            http
//                .antMatcher("/soap/**")
//                .csrf().disable()
//                .httpBasic();
//        }
//    }
//
//	@Order(2)
//    @Configuration
//    public static class WebApiConfigurationAdapter extends WebSecurityConfigurerAdapter {
//
//        protected void configure(HttpSecurity http) throws Exception {
//            http        
//                .formLogin()
//                    .loginProcessingUrl("/authentication")
//                    .usernameParameter("j_username")
//                    .passwordParameter("j_password").permitAll()
//                    .and()
//                .csrf().disable();
//
//        }
//     }
//}