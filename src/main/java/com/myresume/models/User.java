package com.myresume.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.myresume.dtos.SkillsDTO;

@Document
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userId;
	private String userName;
	private String userLinkedin;
	private String userGit;
	private String userPhone;
	private String userEmail;
	private String userPassword;

	private List<SkillsDTO> userSkills = new ArrayList<>();

	public User() {

	}

	public User(String userId, String userName, String userLinkedin, String userGit, String userPhone, String userEmail,
			String userPassword, List<SkillsDTO> userSkills) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userLinkedin = userLinkedin;
		this.userGit = userGit;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userSkills = userSkills;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLinkedin() {
		return userLinkedin;
	}

	public void setUserLinkedin(String userLinkedin) {
		this.userLinkedin = userLinkedin;
	}

	public String getUserGit() {
		return userGit;
	}

	public void setUserGit(String userGit) {
		this.userGit = userGit;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public List<SkillsDTO> getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(List<SkillsDTO> userSkills) {
		this.userSkills = userSkills;
	}

}
