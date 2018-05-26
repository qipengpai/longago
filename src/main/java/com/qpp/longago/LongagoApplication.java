package com.qpp.longago;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.qpp.longago.basics.dao")
@EnableScheduling
@EnableSwagger2
public class LongagoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LongagoApplication.class, args);
	}
}
