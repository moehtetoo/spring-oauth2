package com.moehtet.service;

import java.util.List;

import com.moehtet.model.LoginUser;

public interface UserService {
	List<LoginUser> findAll();
}
