package com.muktamar.practice;

import com.muktamar.practice.utils.MyBanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);

		//To use Customized Banner
//		SpringApplication app = new SpringApplication(PracticeApplication.class);
//		app.setBanner(new MyBanner());
//		app.run(args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner1(ApplicationContext context){
//		return args -> {
//			System.out.println("Let's see what going on in here :");
////			String[] beans = context.getBeanDefinitionNames();
////			Arrays.sort(beans);
////			for (String bean : beans){
////				System.out.println(bean);
////			}
//		};
//	}
}
