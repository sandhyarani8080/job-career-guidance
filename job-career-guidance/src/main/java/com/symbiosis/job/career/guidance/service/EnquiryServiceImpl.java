package com.symbiosis.job.career.guidance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.job.career.guidance.model.Enquiry;
import com.symbiosis.job.career.guidance.repository.EnquiryRepository;

@Service
public class EnquiryServiceImpl implements EnquiryService {
@Autowired
@Qualifier("EnqRepo")
private EnquiryRepository EnqRepo;

	@Override
	public Enquiry insertrecord(Enquiry e) {
		// TODO Auto-generated method stub
		return EnqRepo.save(e);
	}

	@Override
	public List<Enquiry> getAll() {
		// TODO Auto-generated method stub
		return EnqRepo.findAll();
	}

	@Override
	public void del(int ei) {
		// TODO Auto-generated method stub
		EnqRepo.deleteById(ei);
	}

	@Override
	public Enquiry updaterecord(Enquiry e) {
		// TODO Auto-generated method stub
		Optional<Enquiry> opt=EnqRepo.findById(e.getEnquiryid());
		if(opt.isPresent())
		{
			Enquiry eold=opt.get();
			eold.setName(e.getName());
			eold.setAge(e.getAge());
			eold.setEmail(e.getEmail());
			eold.setContact(e.getContact());
			eold.setEductionalbackground(e.getEductionalbackground());
			eold.setCurrentstatus(e.getCurrentstatus());
			eold.setWorkexperience(e.getWorkexperience());
			return EnqRepo.save(eold);
			
			
			
		}
		return null;
		
	}

}
