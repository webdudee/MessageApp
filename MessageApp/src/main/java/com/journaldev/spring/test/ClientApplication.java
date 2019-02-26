package com.journaldev.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.journaldev.spring.configuration.Configurator;
import com.journaldev.spring.costumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configurator.class);
		MyApplication app = context.getBean(MyApplication.class);
		MyApplication app2 = context.getBean(MyApplication.class);
		app.processMessage("sdf", "df");
		app2.processMessage("sdfA", "VVVBdf");
		context.close();
	}

}
