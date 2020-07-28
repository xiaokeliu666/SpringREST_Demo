package com.xliu.controller;

import com.xliu.dao.CustomerDao;
import com.xliu.entity.Customer;
import com.xliu.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
//    need to inject the customer dao
    @Autowired
    private CustomerService customerService;

    /*
            Start to test REST API: GET/POST/PUT/DELETE
     */
    @GetMapping("/list")
    public List<Customer> listCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/search/{theSearchName}")
    public List<Customer> search(@PathVariable String theSearchName) {
        // search customers from the service
        List<Customer> theCustomers = customerService.searchCustomers(theSearchName);
        return theCustomers;
    }

    @PostMapping("/saveCustomer")
    public Customer saveCustomer(@RequestBody Customer theCustomer) {
//        save the customer using our service
//        theCustomer.setId(0);
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return theCustomer;
    }

    @DeleteMapping("/delete/{customerId}")
    public String delete(@PathVariable int customerId) {
//        Customer tempCustomer = customerService.getCustomer(customerId);
        customerService.delete(customerId);
        return "Delete customer id:" + customerId;
    }



}
