package com.naresh.service;

import java.util.List;

import com.naresh.model.Vaccine;

public interface IVaccineService {
	public Vaccine searchVaccineById(Integer id);
	public List<Vaccine> searchVaccineByGivenInfo(Vaccine vac);
	public String removeVaccineInfoByIds(Iterable<Integer> ids);
}
