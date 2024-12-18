package com.symbiosis.job.career.guidance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.job.career.guidance.model.Contactus;
import com.symbiosis.job.career.guidance.repository.ContactusRepository;

@Service
public class ContactusServiceImpl implements ContactusService {
@Autowired
@Qualifier("contRepo")
private ContactusRepository contRepo;
	
	
	@Override
	public Contactus insertrecord(Contactus r) {
		// TODO Auto-generated method stub
		return contRepo.save(r);
	}

	@Override
	public List<Contactus> getAll() {
		// TODO Auto-generated method stub
		return contRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		contRepo.deleteById(ri);
	}

	@Override
	public Contactus updaterecord(Contactus r) {
		// TODO Auto-generated method stub
		Optional<Contactus> opt=contRepo.findById(r.getRegid());
		if(opt.isPresent())
		{
			Contactus cold=opt.get();
			cold.setName(r.getName());
			
			cold.setEmailid(r.getEmailid());
			cold.setPassword(r.getpassword());
			
			return contRepo.save(cold);
		}
		
		return null;
	}

}
