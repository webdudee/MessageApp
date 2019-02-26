package com.journaldev.spring.costumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.journaldev.spring.di.services.MessageService;

@Component
public class MyApplication {

	private MessageService messageServise;
	
@Autowired
	public void setMessageServise(MessageService messageServise) {
		this.messageServise = messageServise;
	}
	
@Autowired
public void setEmailServise(MessageService messageServise) {
	this.messageServise = messageServise;
}
	
	public boolean processMessage (String msg, String rec) {
		return this.messageServise.sendMessage(msg, rec);
	}

	public boolean processMessage2 (String msg, String rec) {
		return this.messageServise.sendMessage(msg, rec);
	}
	
}
