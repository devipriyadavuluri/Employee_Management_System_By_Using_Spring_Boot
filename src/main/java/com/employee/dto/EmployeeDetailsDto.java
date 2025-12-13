package com.employee.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDetailsDto {
	private String empname;
	@Email(message="invalid Emailid")
	private String empemailid;
	@Min(value=6000000000l, message="invalid mobile number")
	@Max(value=9999999999l , message="invalid mobile number")
	private long mobilenumber;
	@NotEmpty(message="invalid gender")
	private String gender;
	private String address;
	private double salary;
	private int deptno;

}
