package org.jeecgframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = {"org.jeecgframework","com.jeecg"},exclude = DataSourceAutoConfiguration.class)
public class JeecgZxApplication {

    public static void main(String[] args) {
        SpringApplication.run(JeecgZxApplication.class, args);
    }

}

