package com.categorizenumbers.hugolopes.service.interfaces;

import java.util.List;

import com.categorizenumbers.hugolopes.exception.CustomerException;
import com.categorizenumbers.hugolopes.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {

	List<Customer> findAll() throws CustomerException;
}
