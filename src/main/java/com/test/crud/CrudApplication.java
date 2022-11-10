package com.test.crud;

import com.test.crud.config.JpaConfig;
import com.test.crud.config.MyBatisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Import;

@Import(JpaConfig.class)
@SpringBootApplication(scanBasePackages = "com.test.crud", exclude = DataSourceAutoConfiguration.class)
public class CrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
