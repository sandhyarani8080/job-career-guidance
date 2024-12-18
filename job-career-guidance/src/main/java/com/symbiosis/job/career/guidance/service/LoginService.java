package com.symbiosis.job.career.guidance.service;

import java.util.List;

import com.symbiosis.job.career.guidance.model.Login;

public interface LoginService {
	
	Login insertrecord (Login r);
		List<Login> getAll();
		void del (int ri);
		Login updaterecord(int i,Login r);

}