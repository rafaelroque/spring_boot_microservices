package com.example.app.ws.ui.mapper;

import com.example.app.ws.ui.model.User;
import com.example.app.ws.ui.to.UserTO;

public class UserMapper {
	
	public static User fromTo(UserTO to) {
		return new User(to.getFirstName(), to.getLastName(), to.getEmail(), to.getPassword());
	}

}
