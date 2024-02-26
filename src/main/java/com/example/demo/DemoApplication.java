package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public Map<String,String> home(){
		/*
		Properties response=new Properties();
		response.put("Saludo","Hola Mundo desde azure");
		response.putAll(System.getProperties());
		*/
		Map<String,String> response=new HashMap<>(System.getenv());
		response.put("Saludo","Hola Mundo desde azure");
		return response;
	}

}
