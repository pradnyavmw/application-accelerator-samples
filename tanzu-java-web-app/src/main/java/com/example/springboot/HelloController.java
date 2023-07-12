package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

///Users/dpradnya/workspace/ALM/mydemos/application-accelerator-samples/tanzu-java-web-app/src/main/java/com/example/springboot/HelloController.java

@RestController
public class HelloController {
	// @Value("${TARGET:MyWorld}")
	// String target;

	@RequestMapping("/")
	public String index() {
		// return "Greetings from Spring Boot- edit1git t + Tanzu!";
		// return "Greetings from Spring Boot- VMWARE!";
		return "Greetings from Spring Boot-  Vmware!";
		// return "Greetings from " + target;
	}
	// @RequestMapping("/hello")
	// public String hello(){
	// return "Hello000000-" + target + "!";
	// }
}
