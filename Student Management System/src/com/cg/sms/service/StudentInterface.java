package com.cg.sms.service;

import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentException;

public interface StudentInterface {
	
	public void addStudentDetails(Student student) throws StudentException;
	public List<Student> viewStudentDetails() throws StudentException;
	
//	boolean validateId(int id)  throws StudentException;
//	boolean validateName(String name)  throws StudentException;
//	boolean validateCity(String city)  throws StudentException;
//	boolean validateMobileNo(String phoneNo)  throws StudentException;
//	boolean validateEmailId(String emailId)  throws StudentException;

	
	public boolean validateDetails(int id,String name,String city,String phoneNo,String emailId) throws StudentException();
}
