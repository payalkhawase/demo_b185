package com.app.servicei;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{

	@Autowired
	EmployeeRepository er;
	
	@Override
	public Employee addEmployee(Employee e) {
		Employee em=er.save(e);
		return em;
	}

	@Override
	public Employee getData(String username, String password) {
		
		Employee em=er.findByUsernameAndPassword(username, password);
		
		return em;
	}

	@Override
	public Employee editEmployee(Employee e) {
		Employee emp=er.save(e);
		return emp;
	}

	@Override
	public Employee deleteEmployee(int id) {
		er.deleteById(id);
		return null;
	}

	@Override
	public Employee getSingleData(int id) {
		Optional<Employee> op=er.findById(id);
		if(op.isPresent()) {
			Employee e=op.get();
			return e;
		}
		return null;
	}

}
