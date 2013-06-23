package com.jkd.service;

import javax.jws.WebService;

import com.jkd.model.Employee;

@WebService(endpointInterface="com.jkd.service.EmpService")
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public Employee getEmployee(int id) {
		Employee emp = new Employee();
		emp.setEmployeeId(id);
		emp.setFirstName("Krishna");
		emp.setLastName("Jey");
		return emp;
	}

}
