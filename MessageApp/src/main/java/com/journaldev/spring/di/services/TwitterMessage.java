package com.journaldev.spring.di.services;

public class TwitterMessage implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("MEss" + rec + "rec" + msg);
		return true;
	}

}
