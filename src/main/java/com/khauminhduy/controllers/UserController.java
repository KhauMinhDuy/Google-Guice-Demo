package com.khauminhduy.controllers;

import com.google.inject.Inject;
import com.khauminhduy.services.MessageService;

public class UserController {
	
	private MessageService messageService;

	@Inject
	public UserController(MessageService messageService) {
		this.messageService = messageService;
	}

	public void send() {
		messageService.sendMessage("Dependency injection with Google Guice example");
	}

}
