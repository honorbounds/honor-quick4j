package org.honor.web.model;

import java.util.Date;

public class UserInfood {

	private String userId; // 用户id
	private String userName; // 用户名
	private String password; // 密码
	private String phone; // 手机号
	private char loginAuto; // 是否自动登录
	private char isdel; // 是否删除。1未删除，0已删除
	private String ip; // 用户ip地址
	private char stauts; // 状态，0禁用，1正常
	private Date lastLoginTime; // 最后登录时间
	private Date updateTime; // 更新时间
	private String opUserInfo; // 操作人
	private char istotal; // 是否参与统计，1参与，0不参与
	private char freError; // 错误次数
	private String codeId; // 验证码id

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public char getLoginAuto() {
		return loginAuto;
	}

	public void setLoginAuto(char loginAuto) {
		this.loginAuto = loginAuto;
	}

	public char getIsdel() {
		return isdel;
	}

	public void setIsdel(char isdel) {
		this.isdel = isdel;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public char getStauts() {
		return stauts;
	}

	public void setStauts(char stauts) {
		this.stauts = stauts;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getOpUserInfo() {
		return opUserInfo;
	}

	public void setOpUserInfo(String opUserInfo) {
		this.opUserInfo = opUserInfo;
	}

	public char getIstotal() {
		return istotal;
	}

	public void setIstotal(char istotal) {
		this.istotal = istotal;
	}

	public char getFreError() {
		return freError;
	}

	public void setFreError(char freError) {
		this.freError = freError;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

}
