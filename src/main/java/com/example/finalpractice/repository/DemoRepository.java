package com.example.finalpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.finalpractice.model.Customer;

@Repository
public interface DemoRepository extends JpaRepository<Customer, Integer> {

}
