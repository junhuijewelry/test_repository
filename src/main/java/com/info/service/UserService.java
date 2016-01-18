package com.info.service;

import java.util.List;

import com.info.entity.UserInfo;

public interface UserService {

	List<UserInfo> queryAll();
	UserInfo selectUserInfoByPrimaryKey(Integer id);
}
