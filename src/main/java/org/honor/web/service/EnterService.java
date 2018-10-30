package org.honor.web.service;

import org.apache.ibatis.annotations.Param;
import org.honor.web.model.UserInfood;

public interface EnterService {

	// 验证用户登录
	public UserInfood userLogin(@Param("phone") String phone,
			@Param("password") String password);

	// 用户注册
	public int registerUser(@Param("phone") String phone,
			@Param("password") String password);

}
