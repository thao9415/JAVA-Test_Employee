package com.codegym.service;

import com.codegym.model.Department;
import com.codegym.model.Employee;

public interface EmployeeService extends GeneralService<Employee> {
    Iterable<Employee> findAllByDepartment(Department department);
}
