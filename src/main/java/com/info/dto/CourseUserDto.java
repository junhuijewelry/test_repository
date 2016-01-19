package com.info.dto;

import java.io.Serializable;

import com.info.entity.CourseUserInfo;

public class CourseUserDto extends CourseUserInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ICode code;

	public ICode getCode() {
		return code;
	}

	public void setCode(ICode code) {
		this.code = code;
	}
	
	

}
