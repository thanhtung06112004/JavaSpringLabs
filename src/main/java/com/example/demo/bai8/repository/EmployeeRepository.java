package com.example.demo.bai8.repository;

import com.example.demo.bai8.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
