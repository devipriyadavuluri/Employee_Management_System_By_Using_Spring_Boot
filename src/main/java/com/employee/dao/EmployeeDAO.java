package com.employee.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeDetails;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	public EmployeeDetails insertDetails(EmployeeDetails employeeDetails)
	{
		return employeeRepository.save(employeeDetails);
	}
	public List<EmployeeDetails> getAllEmployeeDetails()
	{
		return employeeRepository.findAll();
	}
	public void  deleteEmployeeDetailsByUsingEmployeeId(int empid)
	{
		employeeRepository.deleteById(empid);
	}
	public EmployeeDetails getEmployeeDetailsByUsingPrimaryKey(int empid)
	{
		/**Optional<EmployeeDetails> byId=employeeRepository.findById(empid);
		try
		{
			EmployeeDetails employeeDetails=byId.get();
			return employeeDetails;
		}
		catch(Exception e)
		{
			return null;
		}**/
		try
		{
			EmployeeDetails employeeDetails=employeeRepository.findById(empid).get();
			return employeeDetails;
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
}

