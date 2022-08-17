package com.batch.demo.controller;

import com.batch.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/importCSV")
    public String importCSV() {
        return customerService.upload();
    }
}