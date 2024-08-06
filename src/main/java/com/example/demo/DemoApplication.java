package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args)  {
		/*ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		repo UserRepository = context.getBean(repo.class);
	modal mode= new modal();
	mode.setFullname("Viraj");
   modal mode1= UserRepository.save(mode);
   System.out.println(mode1);*/
		SpringApplication.run(DemoApplication.class, args);
			
	      	
	}

}
