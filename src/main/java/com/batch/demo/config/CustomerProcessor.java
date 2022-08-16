package com.batch.demo.config;

import com.batch.demo.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {
    @Override
    public Customer process(Customer item) {
        return item;
    }
}
