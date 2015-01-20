package cuc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这个类可以发布到tomcat7(不支持tomcat 8)中
 * 同时支持REST 以及 JSP 页面 
 * 
 * @author chen
 *
 */

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class AppServletInitializer extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(applicationClass, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<AppServletInitializer> applicationClass = AppServletInitializer.class;
}


@RestController
class GreetingController {

	@RequestMapping("/hello/")
    String hello() {
        return "Hello !";
    }
	
    @RequestMapping("/hello/{name}")
    String hello(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
} 