package com.gnoatto.fernando.erp_destacamento_63;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(originPatterns = ("*"))
@SpringBootApplication
@ComponentScan(basePackages = "com.gnoatto.fernando")
public class ErpDestacamento63Application {

	public static void main(String[] args) {
		SpringApplication.run(ErpDestacamento63Application.class, args);

	}

}
