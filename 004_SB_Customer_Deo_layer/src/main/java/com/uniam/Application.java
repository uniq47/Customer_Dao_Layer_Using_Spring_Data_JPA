package com.uniam;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.uniam.entity.Customer;
import com.uniam.repo.CustomerRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);

		CustomerRepository daoImpl = ctx.getBean(CustomerRepository.class);// to create the instance of the customer
																			// repo class

		Customer customer = new Customer();
		customer.setCno(47);
		customer.setCname("uniq");
		customer.setCadd("USA");

		// to store data into the datbase
		// dilects converts java to sql

		/*
		 * Customer cust = daoImpl.save(customer);
		 * 
		 * if(cust!=null) System.out.println(cust.getCno()+"\t"+ cust.getCname()+"\t"+
		 * cust.getCadd()); else
		 * System.out.println("customer Not Stored in the database");
		 */

		// to fetch the data fom the data base

		List<Customer> viewRecords = daoImpl.findAll();

		viewRecords.stream().forEach(cust -> 
		{
			System.out.println(cust.getCno() + "\t" + cust.getCname() + "\t" + cust.getCadd());
		}

		);
		
		// to fetch a data form the database only one record
		
		Optional<Customer> viewRecord = daoImpl.findById(47);
		Customer cust = viewRecord.get();
		
		if(cust!=null)
			System.out.println(cust.getCno() + "\t" + cust.getCname() + "\t" + cust.getCadd());

	}

}
