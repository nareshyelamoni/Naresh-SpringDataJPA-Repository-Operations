package com.naresh.repo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.naresh.model.Vaccine;
@Repository
public interface PVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

}
