package com.luv2code.springboot.crudDemo.service;

import com.luv2code.springboot.crudDemo.dao.EmployeeRepository;
import com.luv2code.springboot.crudDemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        this.employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = this.employeeRepository.findById(theId);

        Employee theEmployee = null;

        if(result.isPresent()) {
            theEmployee = result.get();
        } else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return this.employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        this.employeeRepository.deleteById(theId);
    }
}
