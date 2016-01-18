package com.info.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.info.dto.CourseCode;
import com.info.dto.CourseDto;
import com.info.dto.ResponsDto;
import com.info.dto.SysCode;
import com.info.entity.CourseInfo;
import com.info.service.CourseService;

@Controller
@RequestMapping("/course")
public class CourseController {

	private static final Logger logger = LoggerFactory.getLogger(CourseController.class);
			
	@Autowired
	private CourseService courseService;
	
	@SuppressWarnings("null")
	@RequestMapping("/selectCourse")
	@ResponseBody
	public String selectCourse(){
		ResponsDto responsDto = new ResponsDto();
		CourseDto courseDto = new CourseDto();
		
		try {
			Integer id = null;
			
			CourseInfo couseInfo = courseService.selectCourse(id);
			if(couseInfo==null && couseInfo.equals("")){
				courseDto.setCode(CourseCode.NOT_EXISIT_COURSE);
			}
			responsDto.setCode(SysCode.SUCCESS);
			responsDto.setData(couseInfo);
		} catch (Exception e) {
			logger.error("参数错误:{}", e.getMessage());
		}
		return responsDto.toString();
		
	}
	
}
