package com.samsung.sds.demo.security;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebSecurity
@ConditionalOnProperty(value="validation.enabled",
        havingValue = "false",
        matchIfMissing = false)
public class WebSecurityDisabled extends WebSecurityConfigurerAdapter implements WebMvcConfigurer {
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/api/v1/**");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TokenExtractionInterceptor()).addPathPatterns("/api/v1/**");
    }
}
