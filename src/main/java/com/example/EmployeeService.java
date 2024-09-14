package com.example;
    
import java.util.List;

public interface EmployeeService {
	    void addEmployee(Employee employee);
	    Employee getEmployee(Long id);
	    List<Employee> getAllEmployees();
	    void updateEmployee(Employee employee);
	    void deleteEmployee(Long id);
	}


