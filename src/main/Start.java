package main;

import managers.DataManager;
import models.User;

public class Start {
	
	public static void main() {
		DataManager manager = DataManager.getInstance();
		
		manager.createNewUser(new User("Gosho"));
		
	}

}
