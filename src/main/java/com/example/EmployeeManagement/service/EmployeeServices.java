package com.example.EmployeeManagement.service;

import java.util.List;

import com.example.EmployeeManagement.model.Employee;

public interface EmployeeServices {
    List<Employee> getAllEmployee();

    void save(Employee employee);

    Employee getById(Long id);

    void deleteViaId(long id);
}

