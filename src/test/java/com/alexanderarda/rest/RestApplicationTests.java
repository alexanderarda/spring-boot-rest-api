package com.alexanderarda.rest;

import com.alexanderarda.rest.entity.Customer;
import com.alexanderarda.rest.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestApplicationTests {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testCreateCustomer(){

        Customer customer = new Customer();
        customer.setCustName("Alex");
        customer.setCustAddress("BSD City");

        customerRepository.save(customer);

    }

}
