package com.myresume.dtos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.myresume.enums.UserType;

@Document
public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotBlank
	private String userName;

	@NotNull
	@JsonFormat(pattern = "dd/MM/yyy")
	private Date userBirthDate;

	@NotBlank
	private String userLinkedin;

	@NotBlank
	private String userGit;

	@NotBlank
	private String userPhone;

	@NotBlank
	private String userEmail;

	@NotBlank
	private String userPassword;

	private UserType userType;

	private List<SkillsDTO> userSkills = new ArrayList<>();

	public UserDTO() {

	}

	public UserDTO(String userName, Date userBirthDate, String userLinkedin, String userGit, String userPhone,
			String userEmail, String userPassword, UserType userType, List<SkillsDTO> userSkills) {
		super();
		this.userName = userName;
		this.userBirthDate = userBirthDate;
		this.userLinkedin = userLinkedin;
		this.userGit = userGit;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userType = userType;
		this.userSkills = userSkills;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getUserBirthDate() {
		return userBirthDate;
	}

	public void setUserBirthDate(Date userBirthDate) {
		this.userBirthDate = userBirthDate;
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

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public List<SkillsDTO> getUserSkills() {
		return userSkills;
	}

	public void setUserSkills(List<SkillsDTO> userSkills) {
		this.userSkills = userSkills;
	}

}
