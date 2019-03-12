package com.sample.web.service;

import com.sample.web.dao.UserDao;
import com.sample.web.model.Login;
import com.sample.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {
	
	  @Autowired
	  public UserDao userDao;

	  public void register(User user) {
	    userDao.register(user);
	  }

	  public User validateUser(Login login) {
	    return userDao.validateUser(login);
	  }


}
