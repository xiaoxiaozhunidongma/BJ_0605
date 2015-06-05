package com.BJ.javabean;

import java.sql.Date;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="t_user")
public class User {
	
	@Column
	private Integer pk_user;
	@Column
	private String nickname;
	@Column
	private String avatar_path;
	@Column
	private String phone;
	@Column
	private String password;
	@Column
	private Date setup_time;
	@Column
	private Date last_login_time;
	@Column
	private String jpush_id;
	@Column
	private Integer sex;
	@Column
	private String device_id;
	@Column
	private Integer status;
	public Integer getPk_user() {
		return pk_user;
	}
	public void setPk_user(Integer pk_user) {
		this.pk_user = pk_user;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getAvatar_path() {
		return avatar_path;
	}
	public void setAvatar_path(String avatar_path) {
		this.avatar_path = avatar_path;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getSetup_time() {
		return setup_time;
	}
	public void setSetup_time(Date setup_time) {
		this.setup_time = setup_time;
	}
	public Date getLast_login_time() {
		return last_login_time;
	}
	public void setLast_login_time(Date last_login_time) {
		this.last_login_time = last_login_time;
	}
	public String getJpush_id() {
		return jpush_id;
	}
	public void setJpush_id(String jpush_id) {
		this.jpush_id = jpush_id;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getDevice_id() {
		return device_id;
	}
	public void setDevice_id(String device_id) {
		this.device_id = device_id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	
}
