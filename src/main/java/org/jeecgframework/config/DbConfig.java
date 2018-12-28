package org.jeecgframework.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.SessionFactory;
import org.jeecgframework.core.aop.HiberAspect;
import org.jeecgframework.core.common.dao.impl.CommonDao;
import org.jeecgframework.core.common.dao.jdbc.JdbcDao;
import org.jeecgframework.core.extend.datasource.DataSourceType;
import org.jeecgframework.core.extend.datasource.DynamicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

import javax.ejb.TransactionManagement;
import javax.sql.DataSource;
import javax.transaction.TransactionManager;
import java.util.*;

/**
 * @author sbdz
 * @date 2018/12/27 13:37
 */
@Slf4j
@Configuration
//@ImportResource(locations = {"spring-mvc-hibernate.xml"})
public class DbConfig {

    @Bean(name = "dataSource_jeecg")
    public DataSource configDruidDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://192.168.99.100:3306/jeecg?useUnicode=true&characterEncoding=UTF-8");
        dataSource.setMaxActive(10);
        dataSource.setMinIdle(1);
        dataSource.setValidationQuery("SELECT 1");
        log.error("注册了DataSource dataSource_jeecg DruidDataSource");
        return dataSource;
        /*
		init-method="init" destroy-method="close">
		<property name="url" value="${jdbc.url.jeecg}" />
		<property name="username" value="${jdbc.username.jeecg}" />
		<property name="password" value="${jdbc.password.jeecg}" />
		<!-- 初始化连接大小 -->
		<property name="initialSize" value="0" />
		<!-- 连接池最大使用连接数量 -->
		<property name="maxActive" value="50" />
		<!-- 连接池最小空闲 -->
		<property name="minIdle" value="5" />

		<!-- 获取连接最大等待时间 -->
		<property name="maxWait" value="60000" />

		<!-- 配置间隔多久才进行一次检测，检测需要关闭的空闲连接，单位是毫秒 -->
		<property name="timeBetweenEvictionRunsMillis" value="60000" />
		<!-- 配置一个连接在池中最小生存的时间，单位是毫秒 -->
		<property name="minEvictableIdleTimeMillis" value="300000" />

		<property name="validationQuery" value="${validationQuery.sql}" />
		<property name="testOnBorrow" value="false" />
		<property name="testOnReturn" value="false" />
		<property name="testWhileIdle" value="true" />

		<!-- 开启Druid的监控统计功能 -->
		<property name="filters" value="stat" />

		<!-- 打开removeAbandoned功能 -->
		<property name="removeAbandoned" value="true" />
		<!-- 1800秒，也就是30分钟 -->
		<property name="removeAbandonedTimeout" value="3600" />
		<!-- 关闭abanded连接时输出错误日志 -->
		<property name="logAbandoned" value="true" />
		<!-- Oracle连接是获取字段注释 -->
		<property name="connectProperties">
			<props>
				<prop key="remarksReporting">true</prop>
			</props>
		</property>
        * */
    }


/*
	<bean id="dataSource"
		class="org.jeecgframework.core.extend.datasource.DynamicDataSource" >
		<property name="targetDataSources">
			<map key-type="org.jeecgframework.core.extend.datasource.DataSourceType">
				<entry key="dataSource_jeecg" value-ref="dataSource_jeecg" />
				<!-- <entry key="mapdataSource" value-ref="mapdataSource" /> -->
			</map>
		</property>
		<property name="defaultTargetDataSource" ref="dataSource_jeecg" />
	</bean>
* */
    @Primary
    @Bean(name = "dataSource")
    public DataSource configDynamicDataSource(@Autowired @Qualifier("dataSource_jeecg")DataSource dataSource) {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> map = new HashMap<>();
        map.put(DataSourceType.dataSource_jeecg, dataSource);
        dynamicDataSource.setTargetDataSources(map);
        dynamicDataSource.setDefaultTargetDataSource(dataSource);
        log.error("注册了DataSource dataSource DynamicDataSource");
        return dynamicDataSource;
    }


    /*
    * 		<property name="entityInterceptor" ref="hiberAspect" />
		<property name="hibernateProperties">
			<props>
				<!--<prop key="hibernate.hbm2ddl.auto">${hibernate.hbm2ddl.auto}</prop> -->
				<prop key="hibernate.dialect">${hibernate.dialect}</prop>
				<prop key="hibernate.hbm2ddl.auto">${hibernate.hbm2ddl.auto}</prop>
				<prop key="hibernate.show_sql">false</prop>
				<prop key="hibernate.format_sql">false</prop>
				<prop key="hibernate.temp.use_jdbc_metadata_defaults">false</prop>
			</props>
		</property>
    * */
    @Bean(name = "sessionFactory")
    public LocalSessionFactoryBean configLocalSessionFactoryBean(
            @Autowired @Qualifier("dataSource") DataSource dataSource,
            @Autowired HiberAspect hiberAspect
    ) {
        LocalSessionFactoryBean localSessionFactoryBean = new LocalSessionFactoryBean();
        localSessionFactoryBean.setDataSource(dataSource);
        localSessionFactoryBean.setEntityInterceptor(hiberAspect);
        //HibernateProperties properties = new HibernateProperties();
        //properties.setDdlAuto("none");
        Properties properties1 = new Properties();
        properties1.setProperty("hibernate.hbm2ddl.auto", "none");
        properties1.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
        properties1.setProperty("hibernate.temp.use_jdbc_metadata_defaults", "false");
        localSessionFactoryBean.setHibernateProperties(properties1);

        List<String> list = new ArrayList<>();
        list.add("org.jeecgframework.web.system.pojo.*");
        list.add("org.jeecgframework.web.test.entity.*");
        list.add("org.jeecgframework.web.autoform.*");
        list.add("org.jeecgframework.web.cgform.entity.*");
        list.add("org.jeecgframework.web.cgreport.entity.*");
        list.add("org.jeecgframework.web.cgdynamgraph.entity.*");
        list.add("org.jeecgframework.web.graphreport.entity.*");
        list.add("org.jeecgframework.web.system.sms.*");
        list.add("org.jeecgframework.web.black.*");
        list.add("org.jeecgframework.web.superquery.*");
        list.add("com.jeecg.*");
        String[] packagesToScan = new String[list.size()];
        String[] strings = list.toArray(packagesToScan);
        localSessionFactoryBean.setPackagesToScan(strings);
        log.error("注册了bean sessionFactory");
        return localSessionFactoryBean;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(@Autowired @Qualifier("dataSource") DataSource dataSource) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }

    @Bean
    public NamedParameterJdbcTemplate namedParameterJdbcTemplate(@Autowired @Qualifier("dataSource") DataSource dataSource) {
        NamedParameterJdbcTemplate namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
        return namedParameterJdbcTemplate;
    }


    /*
    * 	<!-- 配置事物管理器，在*ServiceImpl里写@Transactional就可以启用事物管理 -->
	<bean name="transactionManager"
		class="org.springframework.orm.hibernate5.HibernateTransactionManager">
		<property name="sessionFactory" ref="sessionFactory"></property>
	</bean>
	<!--<tx:annotation-driven transaction-manager="transactionManager" />-->

	<!-- JSR303 Validator定义 -->
	<bean id="validator"
		class="org.springframework.validation.beanvalidation.LocalValidatorFactoryBean" />*/

    @Bean(name = "transactionManager")
    public PlatformTransactionManager transactionManager(@Autowired SessionFactory sessionFactory) {
        HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
        hibernateTransactionManager.setSessionFactory(sessionFactory);
        return hibernateTransactionManager;
    }

    @Bean
    public Object localValidatorFactoryBean() {
        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        return localValidatorFactoryBean;
    }

    @Bean
    public CommonDao configCommonDao(@Autowired SessionFactory sessionFactory) {
        log.info("注册bean CommonDao");
        CommonDao commonDao = new CommonDao();
        commonDao.setSessionFactory(sessionFactory);
        return commonDao;
    }

    //@Bean(name = "jdbcDao")
    //public JdbcDao jdbcDao(@Autowired @Qualifier("dataSource") DataSource dataSource) {
    //    JdbcDao jdbcDao = new JdbcDao();
    //    jdbcDao.insertDataSource(dataSource);
    //    log.error("注册bean JdbcDao");
    //    return jdbcDao;
    //}

}
