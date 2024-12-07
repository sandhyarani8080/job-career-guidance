package com.symbiosis.job.career.guidance.service;

import java.util.List;

import com.symbiosis.job.career.guidance.model.Feedback;
import com.symbiosis.job.career.guidance.model.Registration;

public interface FeedbackService {
	
		Feedback insertrecord (Registration r);
		List<Feedback> getAll();
		void del (int ri);
		Feedback updaterecord(int i,Feedback r);


}
