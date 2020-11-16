package com.example.ConsumingExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ConsumingExampleApplication {
	private static final Logger log = LoggerFactory.getLogger(ConsumingExampleApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ConsumingExampleApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Quote quote = restTemplate.getForObject(
					"https://api.nytimes.com/svc/topstories/v2/home.json?api-key=5Juyps8ID6qTGAC1bcsuk00GB6RfOzer", Quote.class);
			log.info(quote.toString());


		};
	}
	}

