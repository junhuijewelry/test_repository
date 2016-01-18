package com.info.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.info.entity.CourseInfo;
import com.info.mapper.CourseInfoMapper;
import com.info.service.CourseService;

public class CourseServiceImpl implements CourseService {

	@Autowired
	private CourseInfoMapper courseInfoMapper;

	@Override
	public CourseInfo selectCourse(Integer id) {
		// TODO Auto-generated method stub
		return courseInfoMapper.selectCourse(id);
	}

}
