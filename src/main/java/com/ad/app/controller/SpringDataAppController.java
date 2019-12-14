package com.ad.app.controller;

import com.ad.app.domain.Employee;
import com.ad.app.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/spring-data-jpa")
public class SpringDataAppController {

    @Autowired
    private DatabaseService dbService;

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> retrieveAllEmployees() {
        return ResponseEntity.status(HttpStatus.OK).body(dbService.getAllEmployees());
    }


    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> retrieveEmployeeById(@PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(dbService.getEmployeeById(id));
    }


    @GetMapping("/employees/search")
    public ResponseEntity<Employee> retrieveEmployeesByLastName(@RequestParam(value = "last-name") String lastName) {
        return ResponseEntity.status(HttpStatus.OK).body(dbService.getEmployeeByLastName(lastName));
    }
}
