package com.ad.app.controller;

import com.ad.app.domain.Employee;
import com.ad.app.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/spring-data-jpa")
public class SpringDataAppController {

    @Autowired
    private DatabaseService dbService;

    @GetMapping("/employees")
    public List<Employee> retrieveAllTopics() {
        return dbService.getAllEmployees();
    }
}
