package com.tml.config;

import com.tml.filters.MyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebIntercepts extends WebMvcConfigurerAdapter {

    @Autowired
    MyFilter myFilter;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myFilter).addPathPatterns("/**")
                .excludePathPatterns("/login.json");
        super.addInterceptors(registry);
    }
}
