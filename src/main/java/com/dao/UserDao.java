/**
 * 
 */
package com.dao;

import java.util.List;

import com.pojo.User;

/**
 * @author Administrator
 *
 */
public interface UserDao {
	public User findUser(User user);
	
	public List<User> findAllUser();
}