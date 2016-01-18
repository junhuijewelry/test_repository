package com.info.dto;

import java.io.Serializable;

import com.info.entity.CourseInfo;

public class CourseDto extends CourseInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	public ICode code;

	public ICode getCode() {
		return code;
	}

	public void setCode(ICode code) {
		this.code = code;
	}
	

}
