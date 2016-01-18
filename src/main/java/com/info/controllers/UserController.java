package com.info.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.info.entity.UserInfo;
import com.info.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

		private UserService userService;
		
		@RequestMapping("/selectAllUser")
		public String selectAllUser(){
			
			List<UserInfo> userList = userService.queryAll();
			if(userList.isEmpty()){
				throw  new RuntimeException("无用户!");
			}
			
			return "index";
			
		}
		
}
