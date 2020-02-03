package com.neusoft.his.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.neusoft.his.entity.User;

@Mapper
public interface LoginMapper {
	@Select("select * from user where username=#{username} and passwprd=#{password}")
	public User selectUserByNameByPass(User user);

}
