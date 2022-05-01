package com.ibandorta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibandorta.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}