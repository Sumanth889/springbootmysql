package com.example.springbootproject;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;


	public Employee save(Employee employee)
	{
		return employeeRepository.save(employee);
	}

	public Integer Delete(Integer id)
	{
		employeeRepository.deleteById(id);
		return id;
	}


	public List<Employee> readAll()
	{
		List<Employee> emp= (List<Employee>) employeeRepository.findAll();
		return emp;
	}
	
	public Employee read(Integer id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public List<Employee> findByFname(String fname)
	{
		return  employeeRepository.findByFnameStartsWith(fname);
	}
	

}
