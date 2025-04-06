package com.proj.shopmaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class SalesmavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SalesmavenApplication.class, args);
	}

}
