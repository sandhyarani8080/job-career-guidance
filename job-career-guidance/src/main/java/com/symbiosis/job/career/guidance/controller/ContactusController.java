package com.symbiosis.job.career.guidance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.job.career.guidance.model.Contactus;
import com.symbiosis.job.career.guidance.service.ContactusService;

@RestController
public class ContactusController {
@Autowired
private ContactusService rs;

@GetMapping("/contactus")
public List<Contactus> handleget()
{
	return rs.getAll();	
}
@PostMapping("/addcont")
public Contactus add(@RequestBody Contactus r)
{
	return rs.insertrecord(r);
}
}
