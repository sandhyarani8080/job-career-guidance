package com.symbiosis.job.career.guidance.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.symbiosis.job.career.guidance.model.AdminLogin;

@Repository
@Qualifier("admRepo")
public interface AdminLoginRepository extends JpaRepository<AdminLogin,Integer> {

	@Query(	value = "select * from registration where emailid=:emailid and password=:password",nativeQuery=true)
	List<AdminLogin> findAllByEmailidAndPassword(String emailid,String password);  
	

}
