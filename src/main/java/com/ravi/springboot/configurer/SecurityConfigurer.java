package com.ravi.springboot.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by ravi on 12/1/2017.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled =true ,prePostEnabled = true)
public class SecurityConfigurer  extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web ) throws  Exception {

        web.
                ignoring().
                    antMatchers(HttpMethod.OPTIONS , "/**")
                    .antMatchers("/app/**/*.{js,html}")
                    .antMatchers("/external_components/**")
                    .antMatchers("/contents/**");
    }
}
