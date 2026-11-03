package com.naresh.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort.Direction;

import com.naresh.model.Vaccine;
import com.naresh.repo.PVaccineRepo;
@Service
public class PagingService implements PVaccineService {
	
	private PVaccineRepo rep;

	@Autowired
	public void setRepo(PVaccineRepo rep) {
		this.rep = rep;
	}

	@Override
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String... properties) {
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		return rep.findAll(sort);
	}

	@Override
	public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize, boolean status, String... properties) {
		Sort sort = Sort.by(status?Direction.ASC:Direction.DESC, properties);
		PageRequest pagable = PageRequest.of(pgNo, pgSize, sort);
		Page<Vaccine> page = rep.findAll(pagable);
		return page.getContent();
	}

	@Override
	public void fetchDetailsByOnlyPageSize(int pgSize) {
		int count=12;
		int pagecount=count/pgSize;
		pagecount=count%pgSize==0?pagecount:++pagecount;
		for(int i=0; i<pagecount;i++) {
			PageRequest pagable = PageRequest.of(i, pgSize);
			Page<Vaccine> page = rep.findAll(pagable);
			page.getContent().forEach(v->System.out.println(v));
			System.out.println("**********************************************");
		}
		
	}
}
