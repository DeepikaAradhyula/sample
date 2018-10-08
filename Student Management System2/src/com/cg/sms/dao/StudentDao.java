package com.cg.sms.dao;

import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentException;

public interface StudentDao {

	void addStudentDetails(Student student) throws StudentException;
	void viewStudentDetails(Student student) throws StudentException;
	 
	
}
