package com.khauminhduy.bindings;

import com.google.inject.AbstractModule;
import com.khauminhduy.services.MessageService;
import com.khauminhduy.services.impl.EmailService;

public class FirstModule extends AbstractModule {
	
	@Override
	protected void configure() {
		bind(MessageService.class).to(EmailService.class);
	}

}
