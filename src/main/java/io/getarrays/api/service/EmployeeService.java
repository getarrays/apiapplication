package io.getarrays.api.service;

import io.getarrays.api.model.Employee;

import java.util.List;

public interface EmployeeService {
    // Save an employee
    Employee addEmployee(Employee employee);

    // Get employees
    List<Employee> getAllEmployees();

    // Get one employee
    Employee findById(Integer id);

    // Update employee
    void updateEmployee(Employee employee);

    // Delete employee
    Boolean deleteById(Integer id);
}
