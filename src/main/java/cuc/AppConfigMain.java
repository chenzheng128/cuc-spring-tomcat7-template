package cuc;

import hello.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cuc.sture.domain.Student;
import cuc.sture.repository.StudentRepository;

@Configuration
@ComponentScan(basePackages = "cuc")
@EnableAutoConfiguration
public class AppConfigMain {
	
	public static void main(String[] args) {
		/* dynamic load 
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    */
		
		ConfigurableApplicationContext ctx = SpringApplication.run(AppConfigMain.class);
		 
	    StudentRepository repo = ctx.getBean(StudentRepository.class);
//	    myService.doStuff();
	    repo.save(new Student("20010101-dao", "chen-dao"));
//	    repo.save(new Student("20010102", "chen"));
	}
	
	/*
	@RestController
	class GreetingController {
	    
	    @RequestMapping("/rest/hello/{name}")
	    String hello(@PathVariable String name) {
	        return "Hello, " + name + "!";
	    }
	}*/
}
