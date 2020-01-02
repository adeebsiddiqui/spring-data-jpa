package com.ad.app.service;

import com.ad.app.repository.EmployeeRepository;
import com.ad.app.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DatabaseService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employeeList = new ArrayList<>();
        employeeRepository.findAll().forEach(employeeList::add);
        return employeeList;
    }


    public Employee getEmployeeById(String id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public Employee getEmployeeByLastName(String lastName) {
        return employeeRepository.findByLastName(lastName);
    }
}
