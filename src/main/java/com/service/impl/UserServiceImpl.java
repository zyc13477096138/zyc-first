/**
 * 
 */
package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.pojo.User;
import com.service.UserService;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao ud;
	@Override
	public User findUser(User user) {
		return ud.findUser(user);
	}
	@Override
	public List<User> findAllUser() {
		return ud.findAllUser();
	}
    
}
