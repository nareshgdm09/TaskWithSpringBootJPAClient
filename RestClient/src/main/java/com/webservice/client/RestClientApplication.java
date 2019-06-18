package com.webservice.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestClientApplication implements CommandLineRunner {
	@Autowired
	PlayersRestClient playersRestClient;

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World from Application Runner");
		playersRestClient.getPlayersByPost();

	}
}
