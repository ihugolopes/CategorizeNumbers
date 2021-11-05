package com.categorizenumbers.hugolopes.service.impl;

import com.categorizenumbers.hugolopes.exception.CustomerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.categorizenumbers.hugolopes.model.Customer;
import com.categorizenumbers.hugolopes.repository.CustomerRepository;
import com.categorizenumbers.hugolopes.service.interfaces.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	public List<Customer> findAll() throws CustomerException {
		try {
			return repository.findAll();
		} catch (Exception ex) {
			throw new CustomerException("Error fetching all customers: " + ex.getMessage());
		}
	}




}
