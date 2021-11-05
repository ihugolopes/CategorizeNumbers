package com.categorizenumbers.hugolopes.repository;

import com.categorizenumbers.hugolopes.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.List;

@SpringBootTest
@AutoConfigureMockMvc
public class CustomerRepositoryTest {

    @MockBean
    private CustomerRepository repository;

    @Test
    void mustFindAllCustomersWithRepository() {
        List<Customer> customers = repository.findAll();
        Assert.notNull(customers);
    }


}
