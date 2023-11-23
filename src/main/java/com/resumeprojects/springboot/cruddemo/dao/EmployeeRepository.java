package com.resumeprojects.springboot.cruddemo.dao;

import com.resumeprojects.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


}
