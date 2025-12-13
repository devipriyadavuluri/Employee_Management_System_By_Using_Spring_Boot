

package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.employee.EmployeeManagementSystemByUsingSpringBootApplication;
import com.employee.dto.EmployeeDetailsDto;
import com.employee.entity.EmployeeDetails;
import com.employee.repository.EmployeeRepository;
import com.employee.service.EmployeeService;

import jakarta.validation.Valid;

@Controller /*it is used to specify the  class of  requesting and response*/
public class EmployeeController {

    private final EmployeeManagementSystemByUsingSpringBootApplication employeeManagementSystemByUsingSpringBootApplication;

    private final EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeService employeeservice;

    EmployeeController(EmployeeRepository employeeRepository, EmployeeManagementSystemByUsingSpringBootApplication employeeManagementSystemByUsingSpringBootApplication) {
        this.employeeRepository = employeeRepository;
        this.employeeManagementSystemByUsingSpringBootApplication = employeeManagementSystemByUsingSpringBootApplication;
    }
	
	@RequestMapping("/registrationpage")
	public String employeeRegistrationPage(Model model)
	{
		model.addAttribute("employeeDetails",new EmployeeDetailsDto());
		return "EmployeeRegistration";

		
	}
	@RequestMapping("/registration")
	public String employeeRegistration(@Valid EmployeeDetailsDto employeeDetailsdto)
	{
		System.out.println(employeeDetailsdto);
		employeeservice.employeeRegistration(employeeDetailsdto);
		return "redirect:/getAllEmployeeDetails";

	}
	

	@RequestMapping("/getAllEmployeeDetils")
	public String getAllEmployeeDetails(Model model)
	{
		List<EmployeeDetails> allEmployeeDetails=employeeservice.allEmployeeDetails();
		model.addAttribute("allemployeedetails", allEmployeeDetails);
		return "DisplayAllEmployeeDetails";
	}
	@RequestMapping("/deletebyid")
	public void deleteEmployeeDetailsByUsingId(int empid)
	{
		System.out.println(empid);
	}
	public void getEmployeeDetailsByUsingId(int empid)
	{
		System.out.println(empid);
	}
	

}
