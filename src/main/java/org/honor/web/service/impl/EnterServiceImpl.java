package org.honor.web.service.impl;

import org.honor.web.dao.EnterDao;
import org.honor.web.model.UserInfood;
import org.honor.web.service.EnterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterServiceImpl implements EnterService {
	@Autowired
	EnterDao enterDao;

	@Override
	public UserInfood userLogin(String phone, String password) {
		// TODO Auto-generated method stub
		return enterDao.userLogin(phone, password);
	}

	@Override
	public int registerUser(String phone, String password) {
		// TODO Auto-generated method stub
		return enterDao.registerUser(phone, password);
	}

}
