package com.com.outhtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;


/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableOAuth2Sso
public class App {

  public static void main(String[] args) {
      SpringApplication.run(App.class, args);
  }
	
}
