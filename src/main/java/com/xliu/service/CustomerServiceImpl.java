package com.xliu.service;

import com.xliu.dao.CustomerDao;
import com.xliu.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDao customerDao;
    @Override
    @Transactional
    public List<Customer> getCustomers() {
        return customerDao.getCustomers();
    }

    @Override
    @Transactional
    public void saveCustomer(Customer theCustomer) {
        customerDao.saveCustomer(theCustomer);
    }

    @Override
    @Transactional
    public Customer getCustomer(int theId) {
        return customerDao.getCustomer(theId);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        customerDao.delete(theId);
    }

    @Override
    @Transactional
    public List<Customer> searchCustomers(String theName) {
        return customerDao.searchCustomers(theName);
    }
}
