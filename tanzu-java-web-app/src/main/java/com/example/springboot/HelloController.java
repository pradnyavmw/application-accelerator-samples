package com.example.springboot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

///Users/dpradnya/workspace/ALM/mydemos/application-accelerator-samples/tanzu-java-web-app/src/main/java/com/example/springboot/HelloController.java

@RestController
public class HelloController {
	@Value("${TARGET:MyWorld}")
	String target;


Read more: https://javarevisited.blogspot.com/2012/08/how-to-get-environment-variables-in.html#ixzz87Ome5g8F
	@RequestMapping("/")
	public String index() {
  		String message = System.getenv("TARGET");
		if(message==null)
		{	
			message="WORLD";
		}
		System.out.println("TARGET : "  + message);


		// return "Greetings from Spring Boot- edit1git t + Tanzu!";
		// return "Greetings from Spring Boot- VMWARE!";
		//return "Greetings from Spring Boot-  Vmware!";
		return "Greetings from Spring Boot- " + message;
		// return "Greetings from " + target;
	}
	// @RequestMapping("/hello")
	// public String hello(){
	// return "Hello000000-" + target + "!";
	// }
}
