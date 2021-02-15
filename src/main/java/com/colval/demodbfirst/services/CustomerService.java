package com.colval.demodbfirst.services;

import com.colval.demodbfirst.entities.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer create(Customer customer);

    Optional<Customer> readOne(Long id);

    List<Customer> readAll();

    void delete(Long id);

    List<Customer> getAllCustomerByLastName();

    Customer updateFirstNameAndLastName(Long customerId,String firstName,String lastName);


}
