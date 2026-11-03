package com.naresh.service;

import com.naresh.model.Vaccine;

public interface IVaccineService {
	public Iterable<Vaccine> registerMultipleRecords(Iterable<Vaccine> vaccines);
}
