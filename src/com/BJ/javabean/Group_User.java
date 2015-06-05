package com.BJ.javabean;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="tre_group_user")
public class Group_User {
	
	@Column
	private Integer pk_group_user;
	@Column
	private Integer fk_group;
	@Column
	private Integer fk_user;
	@Column
	private Integer message_warn;
	@Column
	private Integer party_warn;
	@Column
	private Integer public_phone;
	@Column
	private String remarks_name;
	@Column
	private Integer photo_update;
	@Column
	private Integer chat_update;
	@Column
	private Integer party_update;
	@Column
	private Integer role;
	@Column
	private Integer status;
	public Integer getPk_group_user() {
		return pk_group_user;
	}
	public void setPk_group_user(Integer pk_group_user) {
		this.pk_group_user = pk_group_user;
	}
	public Integer getFk_group() {
		return fk_group;
	}
	public void setFk_group(Integer fk_group) {
		this.fk_group = fk_group;
	}
	public Integer getFk_user() {
		return fk_user;
	}
	public void setFk_user(Integer fk_user) {
		this.fk_user = fk_user;
	}
	public Integer getMessage_warn() {
		return message_warn;
	}
	public void setMessage_warn(Integer message_warn) {
		this.message_warn = message_warn;
	}
	public Integer getParty_warn() {
		return party_warn;
	}
	public void setParty_warn(Integer party_warn) {
		this.party_warn = party_warn;
	}
	public Integer getPublic_phone() {
		return public_phone;
	}
	public void setPublic_phone(Integer public_phone) {
		this.public_phone = public_phone;
	}
	public String getRemarks_name() {
		return remarks_name;
	}
	public void setRemarks_name(String remarks_name) {
		this.remarks_name = remarks_name;
	}
	public Integer getPhoto_update() {
		return photo_update;
	}
	public void setPhoto_update(Integer photo_update) {
		this.photo_update = photo_update;
	}
	public Integer getChat_update() {
		return chat_update;
	}
	public void setChat_update(Integer chat_update) {
		this.chat_update = chat_update;
	}
	public Integer getParty_update() {
		return party_update;
	}
	public void setParty_update(Integer party_update) {
		this.party_update = party_update;
	}
	public Integer getRole() {
		return role;
	}
	public void setRole(Integer role) {
		this.role = role;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	

}
