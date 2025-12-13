package com.employee.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDAO;
import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDAO employeedao;
	@Autowired
	private ModelMapper mapper;
	public void employeeRegistration(EmployeeDetailsDto employeeDetailsdto)
	{
	/*	EmployeeDetails employeeDetails=new EmployeeDetails();
		employeeDetails.setEmpname(employeeDetailsdto.getEmpname());
		employeeDetails.setAddress(employeeDetailsdto.getAddress());
		employeeDetails.setDeptno(employeeDetailsdto.getDeptno());
		employeeDetails.setEmpemailid(employeeDetailsdto.getEmpemailid());
		employeeDetails.setGender(employeeDetailsdto.getGender());
		employeeDetails.setSalary(employeeDetailsdto.getSalary());
		employeeDetails.setDeptno(employeeDetailsdto.getDeptno());*/
		EmployeeDetails employeeDetails=mapper.map(employeeDetailsdto, EmployeeDetails.class);
		employeedao.insertDetails(employeeDetails);
	}
	public List<EmployeeDetails> allEmployeeDetails()
	{
		return employeedao.getAllEmployeeDetails();
	}
	public void deleteEmployeeByUsingId(int empid)
	{
		employeedao.deleteEmployeeDetailsByUsingEmployeeId(empid);
	}
	public EmployeeDetails getEmployeeByUsingId(int empid)
	{
		return employeedao.getEmployeeDetailsByUsingPrimaryKey(empid);
	}

}
