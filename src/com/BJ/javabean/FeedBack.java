package com.BJ.javabean;

import java.sql.Date;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="t_feedback")
public class FeedBack extends Model{

	@Column
	private Integer pk_feedback;
	@Column
	private Integer fk_user;
	@Column
	private String content;
	@Column
	private Date date;      //date¿‡–Õ£ø datetime £ø
	@Column
	private Integer type;
	@Column
	private Integer status;
	
	public Integer getPk_feedback() {
		return pk_feedback;
	}
	public void setPk_feedback(Integer pk_feedback) {
		this.pk_feedback = pk_feedback;
	}
	public Integer getFk_user() {
		return fk_user;
	}
	public void setFk_user(Integer fk_user) {
		this.fk_user = fk_user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
