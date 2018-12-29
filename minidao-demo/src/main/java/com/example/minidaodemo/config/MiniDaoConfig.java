package com.example.minidaodemo.config;

import lombok.extern.slf4j.Slf4j;
import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.aspect.MinidaoInterceptor;
import org.jeecgframework.minidao.factory.MiniDaoBeanScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sbdz
 * @date 2018/12/27 17:32
 */
@Slf4j
@Configuration
public class MiniDaoConfig {

    /*
    *
    * 	<!-- MiniDao动态代理类 -->
	<bean id="miniDaoHandler" class="org.jeecgframework.minidao.factory.MiniDaoBeanScannerConfigurer">
		<!-- 是使用什么字母做关键字Map的关键字 默认值origin 即和sql保持一致,lower小写(推荐),upper 大写 -->
		<property name="keyType" value="lower"></property>
		<!-- 格式化sql -->
		<property name="formatSql" value="false"></property>
		<!-- 输出sql -->
		<property name="showSql" value="false"></property>
		<!-- 数据库类型  mysql/postgresql/oracle/sqlserver -->
		<property name="dbType" value="mysql"></property>
		<!-- dao地址,配置符合spring方式 -->
		<property name="basePackage" value="org.jeecgframework.web,com.jeecg"></property>
		<!-- 使用的注解,默认是Minidao,推荐 Repository-->
		<property name="annotation" value="org.springframework.stereotype.Repository"></property>
	</bean>
    * */

    @Bean
    public MiniDaoBeanScannerConfigurer configMiniDao() {
        MiniDaoBeanScannerConfigurer miniDaoBeanScannerConfigurer = new MiniDaoBeanScannerConfigurer();
        miniDaoBeanScannerConfigurer.setKeyType("lower");
        miniDaoBeanScannerConfigurer.setFormatSql(false);
        miniDaoBeanScannerConfigurer.setShowSql(false);
        miniDaoBeanScannerConfigurer.setDbType("mysql");
        miniDaoBeanScannerConfigurer.setBasePackage("com.example.minidaodemo");
        miniDaoBeanScannerConfigurer.setAnnotation(MiniDao.class);
        miniDaoBeanScannerConfigurer.setEmptyInterceptor(new MinidaoInterceptor());
        log.error("注册bean MiniDaoBeanScannerConfigurer");
        return miniDaoBeanScannerConfigurer;
    }




}
