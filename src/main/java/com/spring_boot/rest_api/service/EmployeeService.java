package com.spring_boot.rest_api.service;


import com.spring_boot.rest_api.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    Employee getEmployee(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(int id);

}
