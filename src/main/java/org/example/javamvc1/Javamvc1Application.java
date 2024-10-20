package org.example.javamvc1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //서블릿 자동등록
public class Javamvc1Application {

	public static void main(String[] args) {
		SpringApplication.run(Javamvc1Application.class, args);
	}

}
