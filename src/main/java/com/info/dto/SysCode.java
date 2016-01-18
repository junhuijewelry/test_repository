package com.info.dto;

public enum SysCode implements ICode {

	SUCCESS(200,"成功"), param_error(400,"参数错误"),sys_erorr(500,"系统内部错误");
	private Integer code;
	private String msg;
	
	
	private SysCode(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		return this.code.toString();
	}
	
}
