package com.naresh.service;

import java.util.List;

import com.naresh.model.Vaccine;

public interface PVaccineService {
	
	public Iterable<Vaccine> fetchDetailsBySorting(boolean status, String...properties);
	
	public List<Vaccine> fetchDetailsByPagination(int pgNo, int pgSize, boolean status, String...properties);
	
	public void fetchDetailsByOnlyPageSize(int pgSize);
}
