package com.info.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.info.entity.UserInfo;
import com.info.mapper.UserInfoMapper;
import com.info.service.UserService;

@Service("userService")
public class UserInfoImpl implements UserService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public List<UserInfo> queryAll( ) {
		
		return userInfoMapper.queryAll();
	}

	@Override
	public UserInfo selectUserInfoByPrimaryKey(Integer id) {
		return userInfoMapper.selectByPrimaryKey(id);
	}

}
