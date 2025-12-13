package com.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable=false)
	private String empname;
	@Column(nullable=false,unique=true)
	private String empemailid;
	@Column(nullable=false,unique=true)
	private long mobilenumber;
	@Column(nullable=false)
	private String gender;
	@Column(nullable=false)
	private String address;
	@Column(nullable=false)
	private double salary;
	@Column(nullable=false)
	private int deptno;

}
