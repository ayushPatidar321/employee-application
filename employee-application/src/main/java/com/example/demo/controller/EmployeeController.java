package com.example.demo.controller;


import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.ApplicationResponse;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployeeDetails")
    public ResponseEntity<ApiResponse> createEmployee(@RequestBody EmployeeDto employee) {
        log.info("Received request to create employee: {}", employee);
        ApiResponse savedEmployee = employeeService.saveEmployee(employee);
        log.info("Created employee: {}", savedEmployee);
        return ResponseEntity.ok(savedEmployee);
    }

    @GetMapping("/getEmployeeDetails/{id}")
    public ResponseEntity<ApiResponse> getEmployeeById(@PathVariable Long id) {
        log.info("Received request to get employee by ID: {}", id);
       return  ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @GetMapping
    public ResponseEntity<Page<Employee>> getAllEmployees(@RequestParam int page, @RequestParam int size) {
        log.info("Received request to get all employees, page: {}, size: {}", page, size);
        Pageable pageable = PageRequest.of(page, size);
        Page<Employee> employees = employeeService.getAllEmployees(pageable);
        log.info("Found employees: {}", employees.getContent());
        return ResponseEntity.ok(employees);
    }

    @DeleteMapping("/removeRecord/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Long id) {
        log.info("Received request to delete employee with ID: {}", id);
        employeeService.deleteEmployee(id);
        log.info("Deleted employee with ID: {}", id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/external")
    public ResponseEntity<ApiResponse> getExternalDetails() {
        log.info("Received request to get external details");
        ApiResponse details = employeeService.getExternalDetails();
        log.info("External details received: {}", details);
        return ResponseEntity.ok(details);
    }
}