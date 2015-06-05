package com.BJ.javabean;

import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table (name="tre_party_user")
public class Party_User {

	@Column
	private Integer pk_party_user;
	@Column
	private String fk_party;
	@Column
	private Integer fk_user;
	@Column
	private Integer type;
	@Column
	private Integer relationship;
	@Column
	private Integer syn_calendar;
	@Column
	private Integer status;
	public Integer getPk_party_user() {
		return pk_party_user;
	}
	public void setPk_party_user(Integer pk_party_user) {
		this.pk_party_user = pk_party_user;
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
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getRelationship() {
		return relationship;
	}
	public void setRelationship(Integer relationship) {
		this.relationship = relationship;
	}
	public Integer getSyn_calendar() {
		return syn_calendar;
	}
	public void setSyn_calendar(Integer syn_calendar) {
		this.syn_calendar = syn_calendar;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
}
