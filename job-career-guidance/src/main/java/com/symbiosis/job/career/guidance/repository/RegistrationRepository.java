package com.symbiosis.job.career.guidance.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.job.career.guidance.model.Registration;

@Repository
@Qualifier("regRepo")
public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
