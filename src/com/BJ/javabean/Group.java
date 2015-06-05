package com.BJ.javabean;

import java.sql.Date;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="t_group")
public class Group {
	
	@Column
	private Integer pk_group;
	@Column
	private String em_id;
	@Column
	private String name;
	@Column
	private Date setup_time;
	@Column
	private Date last_post_time;
	@Column
	private String last_post_message;
	@Column
	private String avatar_path;
	@Column
	private String remark;
	@Column
	private Integer status;
	public Integer getPk_group() {
		return pk_group;
	}
	public void setPk_group(Integer pk_group) {
		this.pk_group = pk_group;
	}
	public String getEm_id() {
		return em_id;
	}
	public void setEm_id(String em_id) {
		this.em_id = em_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getSetup_time() {
		return setup_time;
	}
	public void setSetup_time(Date setup_time) {
		this.setup_time = setup_time;
	}
	public Date getLast_post_time() {
		return last_post_time;
	}
	public void setLast_post_time(Date last_post_time) {
		this.last_post_time = last_post_time;
	}
	public String getLast_post_message() {
		return last_post_message;
	}
	public void setLast_post_message(String last_post_message) {
		this.last_post_message = last_post_message;
	}
	public String getAvatar_path() {
		return avatar_path;
	}
	public void setAvatar_path(String avatar_path) {
		this.avatar_path = avatar_path;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	

}
