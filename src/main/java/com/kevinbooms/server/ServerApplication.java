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
	public final String A = "<a href=";
	public final String _A = "</a>";
	public final String GITHUB_LINK = "\"https://github.com/kbooms\">";
	public static void main(String[] args) {
		System.out.println("Spinning up another server...");
		SpringApplication.run(ServerApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		String greeting = H1 + "Hello Folks" + _H1 +
				P + "Welcome to the server" + _P +
				P + "Just a Docker dry-run for now. But do enjoy your stay!" + _P +
				P + B + U + "LET'S GO!" + _U + _B + _P +
				A + GITHUB_LINK + "Check it out" + _A;
		return greeting;
	}
}
