package com.sarv.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {

	private List<User> users = new ArrayList<User>();
	
	@Override
	public void sendMessage(String msg, User user) {
		for(User u : this.users) {
			if(u != user) {
				u.receive(msg);
			}
		}
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}

}
