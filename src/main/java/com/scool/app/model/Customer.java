package com.scool.app.model;

import java.time.LocalDateTime;
import org.springframework.data.annotation.Id;

public class Customer {
	@Id
	private String _id;
	private PersonalInfo personalInfo;
	private SchoolData schoolData;
	private String userLastModifier;
	private LocalDateTime registerDate;
	private LocalDateTime modifierDate;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	public SchoolData getSchoolData() {
		return schoolData;
	}
	public void setSchoolData(SchoolData schoolData) {
		this.schoolData = schoolData;
	}
	public String getUserLastModifier() {
		return userLastModifier;
	}
	public void setUserLastModifier(String userLastModifier) {
		this.userLastModifier = userLastModifier;
	}
	public LocalDateTime getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(LocalDateTime registerDate) {
		this.registerDate = registerDate;
	}
	public LocalDateTime getModifierDate() {
		return modifierDate;
	}
	public void setModifierDate(LocalDateTime modifierDate) {
		this.modifierDate = modifierDate;
	}
	@Override
	public String toString() {
		return "Customer [_id=" + _id + ", personalInfo=" + personalInfo + ", schoolData=" + schoolData
				+ ", userLastModifier=" + userLastModifier + ", registerDate=" + registerDate + ", modifierDate="
				+ modifierDate + "]";
	}
	
}
