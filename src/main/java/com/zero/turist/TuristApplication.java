package com.zero.turist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class TuristApplication {

	public static void main(String[] args) {
//		Long k=5L;
//		System.out.printf("a"+k+"b");
		SpringApplication.run(TuristApplication.class, args);
	}

}
