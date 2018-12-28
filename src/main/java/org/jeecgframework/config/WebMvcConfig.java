package org.jeecgframework.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.support.OpenSessionInViewInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sbdz
 * @date 2018/12/28 14:53
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addWebRequestInterceptor(new OpenSessionInViewInterceptor());
    }
}
