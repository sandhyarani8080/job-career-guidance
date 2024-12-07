package com.symbiosis.job.career.guidance.service;

import java.util.List;

import com.symbiosis.job.career.guidance.model.Registration;
import com.symbiosis.job.career.guidance.model.Registration;

public interface RegistrationService {
	
	Registration insertrecord (Registration r);
		List<Registration> getAll();
		void del (int ri);
		Registration updaterecord(int i,Registration r);


}
