package com.employee.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;

public class EmployeeExceptionHandler {
	public String methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException invalidData,Model model)
	{
		Map<String,String>invalidmsg=new HashMap<String,String>();
		invalidData.getBindingResult().getFieldErrors().forEach(error->
		{invalidmsg.put(error.getField(),error.getDefaultMessage());
			model.addAttribute("invalidmsg",invalidmsg);
		});
		return "forward:/registrationpage";
	}
}
