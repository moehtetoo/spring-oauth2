package com.moehtet.mapper;

import java.util.List;

import com.moehtet.model.LoginUser;

public interface UserMapper {
	
	List<LoginUser> findAll();
}
