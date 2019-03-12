package com.sample.web.dao;

import com.sample.web.model.Login;
import com.sample.web.model.User;

public interface UserDao {
	
	void register(User user);
	
	User validateUser(Login login);

}
