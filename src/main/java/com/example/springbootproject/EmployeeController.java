package com.example.springbootproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empcontrol")
public class EmployeeController {
      
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee employee)
	{
		return employeeService.save(employee);
		
	}
	@DeleteMapping("del/{id}")
	public Integer Delete(@PathVariable Integer id)
	{
		return employeeService.Delete(id);
	
	}
	
	@GetMapping("read/{id}")
	public Employee read(@PathVariable Integer id)
	{
		return employeeService.read(id);
	}
	
	@GetMapping("ids")
	public List<Employee> readAll()
	{
		List<Employee> emp= (List<Employee>) employeeService.readAll();
		return emp;
	}
	
	@GetMapping("names/{fname}")
	public List<Employee> findByFname(@PathVariable String fname)
	{
		return (List<Employee>) employeeService.findByFname(fname);
	}
}
