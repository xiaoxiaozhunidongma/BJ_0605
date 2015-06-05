package com.BJ.javabean;

import java.sql.Date;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="t_user_chat")
public class User_Chat {
	
	@Column
	private Integer pk_user_chat;
	@Column
	private Integer fk_user_from;
	@Column
	private Integer fk_user_to;
	@Column
	private Integer category;
	@Column
	private Integer type;
	@Column
	private String content;
	@Column
	private String image_path;
	@Column
	private Date create_time;
	@Column
	private Integer status;
	public Integer getPk_user_chat() {
		return pk_user_chat;
	}
	public void setPk_user_chat(Integer pk_user_chat) {
		this.pk_user_chat = pk_user_chat;
	}
	public Integer getFk_user_from() {
		return fk_user_from;
	}
	public void setFk_user_from(Integer fk_user_from) {
		this.fk_user_from = fk_user_from;
	}
	public Integer getFk_user_to() {
		return fk_user_to;
	}
	public void setFk_user_to(Integer fk_user_to) {
		this.fk_user_to = fk_user_to;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getImage_path() {
		return image_path;
	}
	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
