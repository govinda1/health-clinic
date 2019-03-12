package com.sample.web.service;

import com.sample.web.model.Login;
import com.sample.web.model.User;

public interface UserService {
	
	void register(User user);

	User validateUser(Login login);

}
