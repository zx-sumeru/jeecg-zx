package org.jeecgframework.config;

import lombok.extern.slf4j.Slf4j;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.web.system.service.impl.EhcacheService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sbdz
 * @date 2018/12/28 10:21
 */
@Slf4j
@Configuration
public class SpringMvcConfig {

    @Bean
    public ApplicationContextUtil configApplicationContextUtil() {
        log.trace("注册bean ApplicationContextUtil");
        return new ApplicationContextUtil();
    }

    @Bean
    public EhcacheService configEhcacheService() {
        log.trace("注册bean EhcacheService");
        return new EhcacheService();
    }
}
