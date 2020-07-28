package com.xliu.service;

import com.xliu.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getCustomers();
    public void saveCustomer(Customer theCustomer);
    public Customer getCustomer(int theId);
    public void delete(int theId);
    public List<Customer> searchCustomers(String theName);
}
