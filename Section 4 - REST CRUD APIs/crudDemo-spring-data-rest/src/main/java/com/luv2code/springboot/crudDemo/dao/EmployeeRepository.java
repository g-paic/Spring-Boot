package com.luv2code.springboot.crudDemo.dao;

import com.luv2code.springboot.crudDemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// @RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it... no need to write any code LOL!
}
