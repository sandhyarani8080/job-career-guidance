package com.symbiosis.job.career.guidance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.job.career.guidance.model.Feedback;
import com.symbiosis.job.career.guidance.model.Registration;
import com.symbiosis.job.career.guidance.repository.feedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService {
	
	@Autowired
	@Qualifier("feedRepo")
	private feedbackRepository feedRepo;


	@Override
	public Feedback insertrecord(Registration r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Feedback> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Feedback updaterecord(int i, Feedback r) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
