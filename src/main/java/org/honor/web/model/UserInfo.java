package org.honor.web.model;

import java.util.Date;

public class UserInfo {
	private int userid;//用户名
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	private String username;//用户名
	private String password;//密码
	private String phone;//手机号
	private String loginauto;//是否自动登录
	private String ip;//用户ip地址
	private String stauts;//状态
	private String lastlogintime;//最后登录时间
	private Date updatetime;//更新时间
	private char istotal;//是否参与统计
	private char freerror;//错误次数
	
	public UserInfo(String username, String password, String phone,
			String loginauto, String ip, String stauts, String lastlogintime,
			Date updatetime, char istotal, char freerror) {
		super();
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.loginauto = loginauto;
		this.ip = ip;
		this.stauts = stauts;
		this.lastlogintime = lastlogintime;
		this.updatetime = updatetime;
		this.istotal = istotal;
		this.freerror = freerror;
	}
	public UserInfo() {
		super();
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password
				+ ", phone=" + phone + ", loginauto=" + loginauto + ", ip="
				+ ip + ", stauts=" + stauts + ", lastlogintime="
				+ lastlogintime + ", updatetime=" + updatetime + ", istotal="
				+ istotal + ", freerror=" + freerror + "]";
	}
	
	
	
	
	

}
