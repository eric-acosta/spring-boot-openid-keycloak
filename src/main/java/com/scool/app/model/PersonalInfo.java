package com.scool.app.model;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
public class PersonalInfo {
	private String name;
	private String surnames;
	@JsonProperty("birthday") @JsonFormat(pattern = "dd/MM/yyyy") private LocalDate birthday;
	private String phone;
	private String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurnames() {
		return surnames;
	}
	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "PersonalInfo [name=" + name + ", surnames=" + surnames + ", birthday=" + birthday + ", phone=" + phone
				+ ", email=" + email + "]";
	}
	
}
