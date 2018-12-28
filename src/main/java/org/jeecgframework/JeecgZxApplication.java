package org.jeecgframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"org.jeecgframework", "com.jeecg"},
        exclude = {/*HibernateJpaAutoConfiguration.class,*/DataSourceAutoConfiguration.class})
public class JeecgZxApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeecgZxApplication.class, args);
    }

}

