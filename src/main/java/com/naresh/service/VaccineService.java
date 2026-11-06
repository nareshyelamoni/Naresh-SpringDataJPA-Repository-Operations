package com.naresh.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
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
	public String removeVaccineInfoByIds(Iterable<Integer> ids) {
		List<Vaccine> list = repo.findAllById(ids);
		if(list.size()!=0) {
			repo.deleteAllByIdInBatch(ids);
			return "Records delete for your given ids";
		}
		return "Records not delete for your given ids";
	}

	@Override
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac) {
		Example<Vaccine> eg = Example.of(vac);
		return repo.findAll(eg);
	}

	@Override
	public Vaccine searchVaccineById(Integer id) {
		return repo.getReferenceById(id);
	}



	

}
