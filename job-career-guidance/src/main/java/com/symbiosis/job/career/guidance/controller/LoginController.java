package com.symbiosis.job.career.guidance.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.symbiosis.job.career.guidance.model.Registration;

public class LoginController {
	@GetMapping("/login/{emailid}/{password}")
	public List<Registration> login (@PathVariable("emailid")String emailid,@PathVariable("password")String password)
	{
	return login(emailid, password);
	}
}
