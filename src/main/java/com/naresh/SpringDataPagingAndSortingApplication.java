package com.naresh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.naresh.model.Vaccine;

import com.naresh.service.PagingService;
//import com.naresh.service.VaccineService;

@SpringBootApplication
public class SpringDataPagingAndSortingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cont = SpringApplication.run(SpringDataPagingAndSortingApplication.class, args);
//		VaccineService vaccineService=cont.getBean(VaccineService.class);
//		
//		Vaccine vac1 = new Vaccine("Polio", "WHO", 4828.25);
//		Vaccine vac2 = new Vaccine("Covishield", "AstraZeneca", 4999.60);
//		Vaccine vac3 = new Vaccine("Covaxin", "Bharat Biotech", 3599.00);
//		Vaccine vac4 = new Vaccine("BCG", "Serum Institute", 1250.50);
//		Vaccine vac5 = new Vaccine("Hepatitis B", "GSK", 2200.00);
//		Vaccine vac6 = new Vaccine("MMR", "Merck", 1850.75);
//		Vaccine vac7 = new Vaccine("Rabies", "Bharat Biotech", 950.00);
//		Vaccine vac8 = new Vaccine("Influenza", "Sanofi", 1650.00);
//		Vaccine vac9 = new Vaccine("HPV", "Merck", 4500.00);
//		Vaccine vac10 = new Vaccine("Rotavirus", "Bharat Biotech", 1800.00);
//		Vaccine vac11 = new Vaccine("Typhoid", "Sanofi", 1200.00);
//		Vaccine vac12 = new Vaccine("Japanese Encephalitis", "Bharat Biotech", 1450.00);
//		  List<Vaccine> vaccIterable=new ArrayList<Vaccine>();
//		  vaccIterable.add(vac1);
//		  vaccIterable.add(vac2);
//		  vaccIterable.add(vac3);
//		  vaccIterable.add(vac4);
//		  vaccIterable.add(vac5);
//		  vaccIterable.add(vac6);
//		  vaccIterable.add(vac7);
//		  vaccIterable.add(vac8);
//		  vaccIterable.add(vac9);
//		  vaccIterable.add(vac10);
//		  vaccIterable.add(vac11);
//		  vaccIterable.add(vac12);
//		  vaccineService.registerMultipleRecords(vaccIterable).forEach(v->System.out.println(v));
		 
		PagingService pagingService = cont.getBean(PagingService.class);
		//pagingService.fetchDetailsBySorting(true, "vaccineName","vaccineCompany").forEach(v->System.out.println(v.getVaccineName()));
//		int pageCount=12/2;
//		for(int i=0; i<pageCount;i++) {
//			pagingService.fetchDetailsByPagination(i, 2, true, "vaccineName","vaccineCompany").forEach(v->System.out.println(v));
//		}
		pagingService.fetchDetailsByOnlyPageSize(3);
		
		
		
	}

}
