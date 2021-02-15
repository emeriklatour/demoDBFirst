package com.colval.demodbfirst.repositories;

import com.colval.demodbfirst.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findAllCustomerByLastName();

    void deleteById(Long id);

    Optional<Customer> findById(Long id);
}
