package com.info.dto;

public enum CourseCode implements ICode {
	NOT_EXISIT_COURSE(601,"不存在课程！");
	
	private Integer code;
	private String msg;
	
	private CourseCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	@Override
	public String toString() {
		return this.code.toString();
	}

}
