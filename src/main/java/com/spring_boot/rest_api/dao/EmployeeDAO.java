package com.spring_boot.rest_api.dao;


import com.spring_boot.rest_api.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> getAllEmployees();
    Employee getEmployee(int id);
    void saveEmployee(Employee employee);
    void deleteEmployee(int id);

}
