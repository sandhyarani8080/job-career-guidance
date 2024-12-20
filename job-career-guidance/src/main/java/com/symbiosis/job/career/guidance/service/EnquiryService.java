package com.symbiosis.job.career.guidance.service;

import java.util.List;

import com.symbiosis.job.career.guidance.model.Enquiry;

public interface EnquiryService {
Enquiry insertrecord(Enquiry e);
List<Enquiry> getAll();
void del(int ei);
Enquiry updaterecord(Enquiry e);


}
