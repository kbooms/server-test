package com.kevinbooms.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController // without this annotation the greet() method will not call when the server URL is pulled up
public class ServerApplication {

	public final String H1 = "<h1>";
	public final String _H1 = "</h1>";
	public final String P = "<p>";
	public final String _P = "</p>";
	public final String B = "<b>";
	public final String _B = "</b>";
	public final String U = "<u>";
	public final String _U = "</u>";

	public static void main(String[] args) {
		System.out.println("Spinning up another server...");
		SpringApplication.run(ServerApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		String greeting = H1 + "Hello Folks" + _H1 +
				P + "Welcome to the server" + _P +
				P + "I don't know what it does yet. But do enjoy your stay!" + _P +
				P + B + U + "API Documentation" + _U + _B + _P;
		return greeting;
	}
}
