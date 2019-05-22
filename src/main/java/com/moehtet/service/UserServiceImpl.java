package com.moehtet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moehtet.mapper.UserMapper;
import com.moehtet.model.LoginUser;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	
	public UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public List<LoginUser> findAll() {
		return userMapper.findAll();
	}

}
