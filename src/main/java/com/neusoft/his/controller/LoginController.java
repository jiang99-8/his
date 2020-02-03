package com.neusoft.his.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.his.entity.User;
import com.neusoft.his.service.LoginService;


@RestController
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping("/login")
	public User selectsysUserByNameByPass(@RequestBody User user) {
		System.out.println(user.getUserName()+"---");
		User result = loginService.selectUserByNameByPass(user);
		return result;   
    
	}

}
