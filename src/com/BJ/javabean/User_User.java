package com.BJ.javabean;

import java.sql.Date;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="tre_user_user")
public class User_User {
	
	@Column
	private Integer pk_user_user;
	@Column
	private Integer fk_user_from;
	@Column
	private String user_from_remark_name;
	@Column
	private Integer fk_user_to;
	@Column
	private String user_to_remark_name;
	@Column
	private Integer relationship;
	@Column
	private Date create_date;
	@Column
	private Integer chat_update;
	@Column
	private Integer relationship_update;
	@Column
	private Integer status;
	public Integer getPk_user_user() {
		return pk_user_user;
	}
	public void setPk_user_user(Integer pk_user_user) {
		this.pk_user_user = pk_user_user;
	}
	public Integer getFk_user_from() {
		return fk_user_from;
	}
	public void setFk_user_from(Integer fk_user_from) {
		this.fk_user_from = fk_user_from;
	}
	public String getUser_from_remark_name() {
		return user_from_remark_name;
	}
	public void setUser_from_remark_name(String user_from_remark_name) {
		this.user_from_remark_name = user_from_remark_name;
	}
	public Integer getFk_user_to() {
		return fk_user_to;
	}
	public void setFk_user_to(Integer fk_user_to) {
		this.fk_user_to = fk_user_to;
	}
	public String getUser_to_remark_name() {
		return user_to_remark_name;
	}
	public void setUser_to_remark_name(String user_to_remark_name) {
		this.user_to_remark_name = user_to_remark_name;
	}
	public Integer getRelationship() {
		return relationship;
	}
	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Integer getChat_update() {
		return chat_update;
	}
	public void setChat_update(Integer chat_update) {
		this.chat_update = chat_update;
	}
	public Integer getRelationship_update() {
		return relationship_update;
	}
	public void setRelationship_update(Integer relationship_update) {
		this.relationship_update = relationship_update;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
