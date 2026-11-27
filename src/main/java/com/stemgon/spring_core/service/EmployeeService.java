package com.stemgon.spring_core.service;

import com.stemgon.spring_core.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmployeeById(int employeeId);

    Employee save(Employee theEmployee);

    void deleteById(int theId);
}
