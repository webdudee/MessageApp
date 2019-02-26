package com.journaldev.spring.di.services;

public class EmailServise implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("MEss" + rec + "rec" + msg);
		return true;
	}
	public boolean sendMessage2(String msg, String rec) {
		System.out.println("MEss" + rec + "rec" + msg);
		return true;
	}

}
