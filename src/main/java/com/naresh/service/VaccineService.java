package com.naresh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naresh.model.Vaccine;
import com.naresh.repo.IvaccineRepo;
@Service
public class VaccineService implements IVaccineService {
	
	private IvaccineRepo repo;
	
	@Autowired
	public void setRepo(IvaccineRepo repo) {
		this.repo = repo;
	}

	@Override
	public Iterable<Vaccine> registerMultipleRecords(Iterable<Vaccine> vaccines) {
		return repo.saveAll(vaccines);
	}



	

}
