package com.BJ.javabean;

import java.sql.Date;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="t_photo")
public class Photo {

	@Column
	private String pk_photo;
	@Column
	private Integer fk_group;
	@Column
	private String fk_party;
	@Column
	private Integer fk_user;
	@Column
	private String path;
	@Column
	private Date create_time;
	@Column
	private Integer type;
	@Column
	private String remark;
	@Column
	private Integer status;
	public String getPk_photo() {
		return pk_photo;
	}
	public void setPk_photo(String pk_photo) {
		this.pk_photo = pk_photo;
	}
	public Integer getFk_group() {
		return fk_group;
	}
	public void setFk_group(Integer fk_group) {
		this.fk_group = fk_group;
	}
	public String getFk_party() {
		return fk_party;
	}
	public void setFk_party(String fk_party) {
		this.fk_party = fk_party;
	}
	public Integer getFk_user() {
		return fk_user;
	}
	public void setFk_user(Integer fk_user) {
		this.fk_user = fk_user;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
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
