package com.onlyflan.onlyflan_api.controllers;

import com.onlyflan.onlyflan_api.dao.CustomerDao;
import com.onlyflan.onlyflan_api.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class CustomerController {

    protected CustomerDao customerDao;

    @Autowired
    public CustomerController(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @GetMapping("/customers")
    public List<Customer> getAll() {
        return customerDao.findAll();
    }

    @GetMapping("customers/{id}")
    public ResponseEntity<Customer> get(@PathVariable Long id) {

        Optional<Customer> optionalCustomer = customerDao.findById(id);

        if (optionalCustomer.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(optionalCustomer.get(), HttpStatus.OK);
    }


}
