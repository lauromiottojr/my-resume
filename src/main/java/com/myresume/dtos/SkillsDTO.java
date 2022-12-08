package com.myresume.dtos;

import java.io.Serializable;

public class SkillsDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String skillName;
	private Integer skillYearsExperience;

	public SkillsDTO() {

	}

	public SkillsDTO(String skillName, Integer skillYearsExperience) {
		super();
		this.skillName = skillName;
		this.skillYearsExperience = skillYearsExperience;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public Integer getSkillYearsExperience() {
		return skillYearsExperience;
	}

	public void setSkillYearsExperience(Integer skillYearsExperience) {
		this.skillYearsExperience = skillYearsExperience;
	}

}
