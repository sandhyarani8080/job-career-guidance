package com.symbiosis.job.career.guidance.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.job.career.guidance.model.Login;

@Repository
@Qualifier("logRepo")
public interface LoginRepository extends JpaRepository<Login,Integer>{

	List<Login> findAllByEmailidAndPassword(String emailid, String password);

}
