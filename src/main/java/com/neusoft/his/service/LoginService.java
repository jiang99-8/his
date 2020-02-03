package com.neusoft.his.service;

import com.neusoft.his.entity.User;

public interface LoginService {
	public User selectUserByNameByPass(User user);

}
