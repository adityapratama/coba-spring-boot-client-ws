package com.aditya.pra;
import org.springframework.web.client.RestTemplate;

import com.aditya.pra.domain.Message;

public class Application {
	public static void main(String[] args) {
		final String url="http://localhost:8080/message";
		
		RestTemplate restTemplate = new RestTemplate();
		Message message = restTemplate.getForObject(url, Message.class);
		
		System.out.println(message.getId());
		System.out.println(message.getContent());
	}
}
