package com.cont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/outh2")
public class controller {

	@Autowired
	private OAuth2RestTemplate oAuth2RestTemplate;
	
	public ResponseEntity<String> m1(){
		System.out.println("fire...");
		return oAuth2RestTemplate.getForEntity("https://graph.microsoft.com/v1.0/me/mailfolders/inbox/messages", String.class);
	}
	
}
