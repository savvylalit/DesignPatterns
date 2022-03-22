package com.sarv.behavioural.mediator;

public class ChatClient {
	public static void main(String[] args) {
		ChatMediator mediator = new ChatMediatorImpl();
		User user1 = new User(mediator, "Sarvv001");
		User user2 = new User(mediator, "Sarvv002");
		User user3 = new User(mediator, "Sarvv003");
		User user4 = new User(mediator, "Sarvv004");
		
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hello All...!!!");
	}
}
