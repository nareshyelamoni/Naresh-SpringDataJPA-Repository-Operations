package com.naresh;



import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naresh.model.Vaccine;
import com.naresh.service.VaccineService;


@SpringBootApplication
public class SpringDataJpaRepositoryApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(SpringDataJpaRepositoryApplication.class, args);
		VaccineService vaccineService=cont.getBean(VaccineService.class);
		Vaccine va = vaccineService.searchVaccineById(10);
		System.out.println(va);
		Vaccine vac = new Vaccine("Rabies", "Bharat Biotech", 950.00);
		List<Vaccine> list = vaccineService.searchVaccineByGivenInfo(vac);
		for(Vaccine v:list) {
			System.out.println(v);
		}
		List<Integer> idsIntegers=new ArrayList<Integer>();
		idsIntegers.add(9);
		idsIntegers.add(5);
		idsIntegers.add(25);
		System.out.println(vaccineService.removeVaccineInfoByIds(idsIntegers));
		
	}

}
