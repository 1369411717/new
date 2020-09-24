package com.example.myspringboot.config;


import com.example.myspringboot.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public MyInterceptor getMyInterceptor(){
        return new MyInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/test");
    }

   /* @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {//注册静态资源url
        registry.addResourceHandler("/**").addResourceLocations("classpath:static/");
    }*/
}
