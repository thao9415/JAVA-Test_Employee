package com.codegym.service;

import com.codegym.model.Department;
import com.codegym.model.Employee;
import com.codegym.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Iterable<Employee> findAllByDepartment(Department department) {
        return employeeRepository.findAllByDepartment(department);
    }

    @Override
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void remove(Long id) {
        employeeRepository.delete(id);

    }

    @Override
    public Employee findById(Long id) {
        return employeeRepository.findOne(id);
    }
}