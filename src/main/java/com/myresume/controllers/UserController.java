package com.myresume.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myresume.dtos.UserDTO;
import com.myresume.enums.UserType;
import com.myresume.models.User;
import com.myresume.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/dev")
	public ResponseEntity<User> saveDev(@RequestBody @Valid UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		user.setUserType(UserType.DEVELOPER);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}

	@PostMapping(value = "/recruiter")
	public ResponseEntity<User> saveRecruiter(@RequestBody @Valid UserDTO userDTO) {
		User user = new User();
		BeanUtils.copyProperties(userDTO, user);
		user.setUserType(UserType.RECRUITER);
		return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
	}
}
