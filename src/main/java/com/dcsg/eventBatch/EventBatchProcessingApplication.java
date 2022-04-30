package com.dcsg.eventBatch;

import java.util.Arrays;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@EnableBatchProcessing
public class EventBatchProcessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventBatchProcessingApplication.class, args);
	}
	@Bean
	public HttpEntity<String> getEntity() {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		return new HttpEntity<String>(headers);
	}
}
