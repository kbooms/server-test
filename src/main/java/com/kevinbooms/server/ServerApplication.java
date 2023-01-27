package com.kevinbooms.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // without this annotation the greet() method will not call when the server URL is pulled up
public class ServerApplication {

	public static void main(String[] args) {
		System.out.println("Spinning up another server...");
		SpringApplication.run(ServerApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		return "<h1>" + "Hello Folks!" + "</h1>";
	} // holy crap I can write HTML tags and it will render
}
