package com.symbiosis.job.career.guidance.service;

import java.util.List;

import com.symbiosis.job.career.guidance.model.Contactus;

public interface ContactusService {
Contactus insertrecord(Contactus r);
List<Contactus> getAll();
void del(int ri);
Contactus updaterecord(Contactus r);





}
