/**
 * 
 */
package com.service;

import java.util.List;

import com.pojo.User;

/**
 * @author Administrator
 *
 */
public interface UserService {
	public User findUser(User user);
	
	public List<User> findAllUser();
}