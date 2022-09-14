package com.uniam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//t= table name id= [primary key data type
import org.springframework.stereotype.Repository;

import com.uniam.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
