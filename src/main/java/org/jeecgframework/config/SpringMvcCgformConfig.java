package org.jeecgframework.config;

import freemarker.cache.TemplateLoader;
import freemarker.template.TemplateDirectiveModel;
import lombok.extern.slf4j.Slf4j;
import org.jeecgframework.core.common.hibernate.dialect.H2Dialect;
import org.jeecgframework.web.cgform.engine.TempletContext;
import org.jeecgframework.web.cgform.service.impl.generate.TempletContextWord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sun.nio.cs.StandardCharsets;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sbdz
 * @date 2018/12/28 11:31
 */
@Slf4j
@Configuration
public class SpringMvcCgformConfig {


    @Bean(name = "freemarker")
    public freemarker.template.Configuration freemarkerConfiguration(
            @Autowired @Qualifier("templetLoader") TemplateLoader templetLoader) {
        freemarker.template.Configuration configuration = new freemarker.template.Configuration();
        configuration.setTemplateLoader(templetLoader);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setNumberFormat("0");
        configuration.setClassicCompatible(true);
        log.error("注册bean freemarker.template.Configuration");
        return configuration;
    }

    //@Bean(name = "templetContext")
    public TempletContext configTempletContext(TemplateDirectiveModel dictDataTag,TemplateDirectiveModel mutiLangTag) {
        TempletContext templetContext = new TempletContext();
        Map<String, TemplateDirectiveModel> tags = new HashMap<>();
        tags.put("DictData", dictDataTag);
        tags.put("mutiLang", mutiLangTag);
        templetContext.setTags(tags);
        log.error("注册了bean TempletContext");
        return templetContext;
    }

    @Bean(name = "freemarkerWord")
    public freemarker.template.Configuration configfreemarkerWord(TemplateLoader templetLoaderWord) {
        freemarker.template.Configuration configuration = new freemarker.template.Configuration();
        configuration.setTemplateLoader(templetLoaderWord);
        configuration.setDefaultEncoding("UTF-8");
        configuration.setNumberFormat("0");
        configuration.setClassicCompatible(true);
        log.error("注册了bean freemarker.template.Configuration freemarkerWord");
        return configuration;
    }

    //@Bean(name = "templetContextWord")
    //public TempletContextWord configTempletContextWord(TemplateDirectiveModel dictDataTag,TemplateDirectiveModel mutiLangTag) {
    //
    //}





/*

	<!-- Template Context 自定义word代码生成器 -->
	<bean id="templetContextWord" class="org.jeecgframework.web.cgform.service.impl.generate.TempletContextWord">
		<property name="tags">
			<map>
				<entry key="DictData" value-ref="dictDataTag" />
				<entry key="mutiLang" value-ref="mutiLangTag" />
			</map>
		</property>
	</bean>

	<!-- 拦截器 -->
	<mvc:interceptors>
		<!-- 表单配置更新后增加版本号 -->
		<mvc:interceptor>
			<mvc:mapping path="/**" />
			<bean
				class="org.jeecgframework.web.cgform.interceptors.CgFormVersionInterceptor">
				<property name="includeUrls">
					<list>
						<value>cgformButtonController.do?save</value>
						<value>cgformButtonController.do?del</value>
						<value>cgformButtonSqlController.do?save</value>
						<value>cgformButtonSqlController.do?del</value>
						<value>cgformFtlController.do?save</value>
						<value>cgformFtlController.do?del</value>
						<value>cgformFtlController.do?active</value>
						<value>cgformFtlController.do?cancleActive</value>
						<value>cgformEnhanceJsController.do?save</value>
						<value>cgformEnhanceJsController.do?del</value>
						<value>cgFormHeadController.do?save</value>
					</list>
				</property>
			</bean>
		</mvc:interceptor>
	</mvc:interceptors>
*
* */
}
