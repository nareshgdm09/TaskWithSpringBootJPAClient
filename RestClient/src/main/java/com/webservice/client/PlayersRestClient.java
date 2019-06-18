package com.webservice.client;

import java.util.Arrays;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PlayersRestClient{
	static final String URL_CREATE_EMPLOYEE = "http://localhost:8080/api/players";

	public void getPlayersByPost() {

		Player newEmployee = new Player();

		RestTemplate restTemplate = new RestTemplate();

		MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter
				.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
		restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);

		ResponseEntity<Player[]> result = restTemplate.postForEntity(URL_CREATE_EMPLOYEE, newEmployee, Player[].class);
		for(Player player:result.getBody()) {
			System.out.println(player);
		}

	}
}