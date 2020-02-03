package com.neusoft.his.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.his.entity.User;
import com.neusoft.his.mapper.LoginMapper;
import com.neusoft.his.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	private LoginMapper loginMapper;

	@Override
	public User selectUserByNameByPass(User user) {
		return loginMapper.selectUserByNameByPass(user);
	}

}
