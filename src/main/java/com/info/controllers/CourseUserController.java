package com.info.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.info.dto.CourseUserDto;
import com.info.dto.ResponsDto;
import com.info.dto.SysCode;
import com.info.entity.CourseUserInfo;
import com.info.service.CourseUserService;

@Controller
@RequestMapping("/courseuser")
public class CourseUserController {

	private static final Logger logger = LoggerFactory.getLogger(CourseUserController.class);
	
	@Autowired
	private CourseUserService courseUserservice;
	
	@RequestMapping("/selectByKey")
	@ResponseBody
	public String selectCourseUserByKey(){
		ResponsDto responseDto = new ResponsDto();
		CourseUserDto CourseUserDto = new CourseUserDto();
		try {
			Integer id = CourseUserDto.getId();
			CourseUserInfo courseUserInfo = courseUserservice.selectByPrimaryKey(id);
			CourseUserDto.setCode(SysCode.SUCCESS);
			responseDto.setData(courseUserInfo);
		} catch (Exception e) {
			logger.error(e.getMessage(), "错误信息");
		}
		return responseDto.toString();
		
	}
}
