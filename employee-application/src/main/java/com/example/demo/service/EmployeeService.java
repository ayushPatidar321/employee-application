package com.example.demo.service;

import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.ApplicationResponse;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EmployeeService {
    ApiResponse saveEmployee(EmployeeDto employee);

    ApiResponse getEmployeeById(Long id);

    Page<Employee> getAllEmployees(Pageable pageable);

    void deleteEmployee(Long id);

    ApiResponse getExternalDetails();
}
