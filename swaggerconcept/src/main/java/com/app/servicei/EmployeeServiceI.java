package com.app.servicei;

import com.app.model.Employee;

public interface EmployeeServiceI {

	public Employee addEmployee(Employee e);

	public Employee getData(String username, String password);

	public Employee editEmployee(Employee e);

	public Employee deleteEmployee(int id);

	public Employee getSingleData(int id);

}
