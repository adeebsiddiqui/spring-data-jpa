package com.ad.app.repository;

import com.ad.app.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Employee findByLastName(String lastName);
}
