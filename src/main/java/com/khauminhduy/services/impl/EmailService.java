package com.khauminhduy.services.impl;

import com.khauminhduy.services.MessageService;

public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println("Email message: " + message);
	}

}
