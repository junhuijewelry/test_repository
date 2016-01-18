package com.info.dto;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;

public class ResponsDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final static Logger logger = LoggerFactory.getLogger(ResponsDto.class); 
	private final static String DATE_FORMAT = "yyyy-MM-dd HH:mm:dd";
	private int code;
	private String msg;
	private Object data;

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	public void setCode(ICode code) {
		this.code = code.getCode();
		this.msg = code.getMsg();
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		JSON json = (JSON) JSON.toJSON(this);
		logger.debug("response body={}", JSON.toJSONStringWithDateFormat(json,DATE_FORMAT));
		return JSON.toJSONStringWithDateFormat(json,DATE_FORMAT);
	}
}
