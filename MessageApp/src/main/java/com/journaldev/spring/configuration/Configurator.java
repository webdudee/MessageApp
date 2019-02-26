package com.journaldev.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.journaldev.spring.di.services.EmailServise;
import com.journaldev.spring.di.services.MessageService;

@Configuration
@ComponentScan(value= {"com.journaldev.spring.costumer"})
public class Configurator {

	@Bean
	public EmailServise getMessageServise () {
		return new EmailServise();
	}
}
