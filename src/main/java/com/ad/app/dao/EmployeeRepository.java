package com.ad.app.dao;

import com.ad.app.domain.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {

    Employee findByLastName(String lastName);
}
