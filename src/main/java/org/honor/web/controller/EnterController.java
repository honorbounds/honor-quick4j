package org.honor.web.controller;


import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.honor.core.util.JsonMap;
import org.honor.core.util.SysConstant;

import org.honor.web.service.EnterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("enter")
public class EnterController {
	@Autowired
	EnterService enterService;
	JsonMap<String, Object> model = new JsonMap<String, Object>();

	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ResponseBody
	public JsonMap<String, Object> enterLogin(BindingResult result,
			String phone, String password, HttpSession session) {
		Subject subject = SecurityUtils.getSubject();

		if (subject.isAuthenticated()) {
			model.put(SysConstant.OP_FLAG, "0");
			model.put(SysConstant.OP_MESSAGE, "用户已经登录！");
			return model;
		}
		if (result.hasErrors()) {
			model.put(SysConstant.OP_FLAG, "0");
			model.put(SysConstant.OP_MESSAGE, "参数错误！");
			return model;
		}
		subject.login(new UsernamePasswordToken(phone, password));
		// final UserInfood
		model.put(SysConstant.OP_FLAG, "1");
		model.put(SysConstant.OP_MESSAGE, "登录成功！");
		return model;
	}

}
