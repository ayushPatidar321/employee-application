package com.example.demo.service.impl;

import com.example.demo.config.AppConfig;
import com.example.demo.dto.ApiResponse;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepository;
import com.example.demo.service.EmployeeService;
import com.example.demo.util.ServiceResponseCodeEnum;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static com.example.demo.util.ServiceUtil.createApiResponse;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final ApplicationContext context;

    private final AppConfig appConfig;

    @Value("${third.party.url}")
    private String url;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ApplicationContext context,
                               AppConfig appConfig) {
        this.employeeRepository = employeeRepository;
        this.context = context;
        this.appConfig = appConfig;
    }

    @Transactional
    @Override
    public ApiResponse saveEmployee(EmployeeDto employee) {
        Employee emp = new Employee();
        try {
            emp.setName(employee.getName());
            emp.setPosition(employee.getPosition());
            emp.setSalary(employee.getSalary());
            return createApiResponse(ServiceResponseCodeEnum._SUCCESS.getCode(),
                    ServiceResponseCodeEnum._SUCCESS.getStatus(),
                    ServiceResponseCodeEnum._SUCCESS.getDescription(), employeeRepository.save(emp));
        } catch (Exception e) {
            log.error("Error during save Employee details " + e.getStackTrace());
            return createApiResponse(ServiceResponseCodeEnum._GENERAL_ERROR.getCode(),
                    ServiceResponseCodeEnum._GENERAL_ERROR.getStatus(),
                    ServiceResponseCodeEnum._GENERAL_ERROR.getDescription(), StringUtils.EMPTY);
        }

    }

    @Transactional(readOnly = true)
    @Override
    public ApiResponse getEmployeeById(Long id) {
        try {
            Optional<Employee> employee = employeeRepository.findById(id);
            if (employee.isPresent()) {
                log.info("Found employee: {}", employee.get());
                return createApiResponse(ServiceResponseCodeEnum._SUCCESS.getCode(),
                        ServiceResponseCodeEnum._SUCCESS.getStatus(),
                        ServiceResponseCodeEnum._SUCCESS.getDescription(), employee.get());
            } else {
                log.info("Employee Details Not Found For Id : {}", id);
                return createApiResponse(ServiceResponseCodeEnum._ERROR.getCode(),
                        ServiceResponseCodeEnum._ERROR.getStatus(),
                        ServiceResponseCodeEnum._ERROR.getDescription(), StringUtils.EMPTY);
            }
        } catch (Exception e) {
            log.error("Employee Details Not Found For Id : {} , Exception : {}", id, e.getMessage());
            return createApiResponse(ServiceResponseCodeEnum._GENERAL_ERROR.getCode(),
                    ServiceResponseCodeEnum._GENERAL_ERROR.getStatus(),
                    ServiceResponseCodeEnum._GENERAL_ERROR.getDescription(), StringUtils.EMPTY);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Page<Employee> getAllEmployees(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public ApiResponse getExternalDetails() {

        try {
            return createApiResponse(ServiceResponseCodeEnum._SUCCESS.getCode(),
                    ServiceResponseCodeEnum._SUCCESS.getStatus(),
                    ServiceResponseCodeEnum._SUCCESS.getDescription(), appConfig.restTemplate().getForObject(url,
                            String.class));
        } catch (Exception e) {
            log.error("Exception during third party call: {}", e.getMessage());
            return createApiResponse(ServiceResponseCodeEnum._SERVER_ERROR.getCode(),
                    ServiceResponseCodeEnum._SERVER_ERROR.getStatus(),
                    ServiceResponseCodeEnum._SERVER_ERROR.getDescription(), StringUtils.EMPTY);
        }

    }
}
