package com.BJ.javabean;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="t_chat")
public class Chat extends Model{
	@Column
	private Integer pk_chat;
	@Column
	private String fk_group;
	@Column
	private Integer fk_user;
	@Column
	private Integer category;
	@Column
	private Integer type;
	@Column
	private String content;
	@Column
	private String image_path;
	@Column
	private String create_time;
	@Column
	private Integer status;
	
	public Integer getPk_chat() {
		return pk_chat;
	}
	public void setPk_chat(Integer pk_chat) {
		this.pk_chat = pk_chat;
	}
	public String getFk_group() {
		return fk_group;
	}
	public void setFk_group(String fk_group) {
		this.fk_group = fk_group;
	}
	public Integer getFk_user() {
		return fk_user;
	}
	public void setFk_user(Integer fk_user) {
		this.fk_user = fk_user;
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
	public String getCreate_time() {
		return create_time;
	}
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
