package com.ad.app.controller;

import com.ad.app.domain.Employee;
import com.ad.app.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring-data-jpa")
public class SpringDataAppController {

    @Autowired
    private DatabaseService dbService;

    @GetMapping("/employees")
    public List<Employee> retrieveAllEmployees() {
        return dbService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee retrieveEmployeeById(@PathVariable String id) {
        return dbService.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public Employee retrieveEmployeeByLastName(@RequestParam(value = "last-name") String lastName) {
        return dbService.getEmployeeByLastName(lastName);
    }
}
