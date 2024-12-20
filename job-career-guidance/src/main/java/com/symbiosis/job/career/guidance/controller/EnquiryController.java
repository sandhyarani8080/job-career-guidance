package com.symbiosis.job.career.guidance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.symbiosis.job.career.guidance.model.Enquiry;
import com.symbiosis.job.career.guidance.service.EnquiryService;

@RestController
public class EnquiryController {
@Autowired
private EnquiryService es;
@GetMapping("/Enquiry")
public List<Enquiry> handleget()
{
	return es.getAll();
	
}
@PostMapping("/addenq")
public Enquiry add(@RequestBody Enquiry e)
{
	return es.insertrecord(e);
}

}
