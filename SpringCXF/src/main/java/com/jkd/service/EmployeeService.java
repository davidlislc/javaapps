package com.jkd.service;

import javax.jws.WebService;

import com.jkd.model.Employee;

/**
 * Employee web service 
 * @author krishna
 *
 */
@WebService
public interface EmployeeService {

	public Employee getEmployee(int id);
}
