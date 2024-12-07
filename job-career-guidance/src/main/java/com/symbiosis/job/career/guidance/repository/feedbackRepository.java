package com.symbiosis.job.career.guidance.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.symbiosis.job.career.guidance.model.Feedback;

@Repository
@Qualifier("feedRepo")
public interface feedbackRepository extends JpaRepository<Feedback,Integer> {

}
