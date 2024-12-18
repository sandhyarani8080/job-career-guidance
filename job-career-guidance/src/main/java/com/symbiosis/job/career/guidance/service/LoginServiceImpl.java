package com.symbiosis.job.career.guidance.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.symbiosis.job.career.guidance.model.Login;
import com.symbiosis.job.career.guidance.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
@Autowired
@Qualifier("logRepo")
private LoginRepository logRepo;
	
	
	@Override
	public Login insertrecord(Login r) {
		// TODO Auto-generated method stub
		return logRepo.save(r);
	}

	@Override
	public List<Login> getAll() {
		// TODO Auto-generated method stub
		return logRepo.findAll();
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		logRepo.deleteById(ri);
	}

	@Override
	public Login updaterecord(int i, Login r) {
		// TODO Auto-generated method stub
		Optional<Login> opt=logRepo.findById(r.getLogid());
		if(opt.isPresent())
		{
			Login rold=opt.get();
			rold.setEmailid(r.getEmailid());
			rold.setPassword(r.getPassword());
			rold.setLogid(r.getLogid());
			return logRepo.save(rold);
			}

		return null;
	}

}
