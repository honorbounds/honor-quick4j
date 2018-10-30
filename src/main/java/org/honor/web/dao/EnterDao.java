package org.honor.web.dao;

import org.apache.ibatis.annotations.Param;
import org.honor.web.model.UserInfood;

public interface EnterDao {
	// 验证用户登录
	public UserInfood userLogin(@Param("phone") String phone,
			@Param("password") String password);

	// 用户注册
	public int registerUser(@Param("phone") String phone,
			@Param("password") String password);

}
