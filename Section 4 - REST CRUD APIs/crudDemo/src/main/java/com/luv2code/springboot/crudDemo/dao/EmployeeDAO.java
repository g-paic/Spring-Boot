package com.luv2code.springboot.crudDemo.dao;

import com.luv2code.springboot.crudDemo.entity.Employee;
import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
