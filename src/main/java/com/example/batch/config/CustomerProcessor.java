package com.example.batch.config;

import com.example.batch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;


//According to the Spring Batch Arhitecture we have to create this processor class.This class has to be configured in the SpringBatchConfig aswell.
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    //Here we can give options to the batch job , so it will not return all the records but only that meet the criteria.example

//    @Override
//    public Customer process(Customer customer) throws Exception {
//        if (customer.getCountry().equals("United States")) {
//            return customer;
//        } else {
//            return null;
//        }
//    }

    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }
}
