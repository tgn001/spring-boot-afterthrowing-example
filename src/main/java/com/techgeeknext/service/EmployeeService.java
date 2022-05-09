package com.techgeeknext.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmployeeService
{

	public Object getEmployeeById(Integer empId) throws Exception {
		log.info("=====getEmployeeById Method====");
			throw new Exception("Exception occurred while retrieving employee.");
    }
}
