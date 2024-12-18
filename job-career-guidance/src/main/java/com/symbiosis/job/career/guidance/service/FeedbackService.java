package com.symbiosis.job.career.guidance.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.symbiosis.job.career.guidance.model.Feedback;
@Service
public interface FeedbackService {
	
		Feedback insertrecord (Feedback r);
		List<Feedback> getAll();
		void del (int ri);
		Feedback updaterecord(int i,Feedback r);


}
