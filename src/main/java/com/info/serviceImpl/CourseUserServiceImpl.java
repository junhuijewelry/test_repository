package com.info.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.info.entity.CourseUserInfo;
import com.info.mapper.CourseUserInfoMapper;
import com.info.service.CourseUserService;

public class CourseUserServiceImpl implements CourseUserService {

	@Autowired
	private CourseUserInfoMapper courseUserInfoMapper;
	@Override
	public CourseUserInfo selectByPrimaryKey(Integer id) {
		return courseUserInfoMapper.selectByPrimaryKey(id);
	}

}
