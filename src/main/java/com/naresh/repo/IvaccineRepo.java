package com.naresh.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.naresh.model.Vaccine;
@Repository
public interface IvaccineRepo extends JpaRepository<Vaccine, Integer> {

}
