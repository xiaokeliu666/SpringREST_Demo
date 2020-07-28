package com.xliu.dao;

import com.xliu.entity.Customer;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getCustomers();
    public void saveCustomer(Customer theCustomer);
    public Customer getCustomer(int theId);
    public void delete(int theId);
    public List<Customer> searchCustomers(String theSearchName);
}
