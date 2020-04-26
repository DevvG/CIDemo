package com.altiostar.demo;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


public class HelloAppIntegrationTest {

	@Test
	@Category(Integration.class)
	public void sayHelloPass() throws URISyntaxException {
		RestTemplate restTemplate = new RestTemplate();
	    final String baseUrl = "http://192.168.1.9:31234/hello?name=dev";
	    URI uri = new URI(baseUrl);
	 
	    ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
	    assertTrue(result.getBody().equalsIgnoreCase("Dev, say Hello Kubernetes World"));
	}

}
