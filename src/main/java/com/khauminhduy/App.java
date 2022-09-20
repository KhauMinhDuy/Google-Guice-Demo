package com.khauminhduy;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.khauminhduy.bindings.FirstModule;
import com.khauminhduy.controllers.UserController;

public class App {
	
	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new FirstModule());
		UserController userController = injector.getInstance(UserController.class);
		userController.send();
	}

}
