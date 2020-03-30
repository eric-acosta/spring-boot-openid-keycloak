package com.scool.app.model;

import java.util.Arrays;


public class SchoolData {
	private String name;
	private String idSchool;
	private String sector;
	private String[] levels;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdSchool() {
		return idSchool;
	}
	public void setIdSchool(String idSchool) {
		this.idSchool = idSchool;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String[] getLevels() {
		return levels;
	}
	public void setLevels(String[] levels) {
		this.levels = levels;
	}
	@Override
	public String toString() {
		return "SchoolData [name=" + name + ", idSchool=" + idSchool + ", sector=" + sector + ", levels="
				+ Arrays.toString(levels) + "]";
	}
	
}
