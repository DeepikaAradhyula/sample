package com.cg.sms.service;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentException;

public class StudentService implements StudentInterface {

	@Override
	public void addStudentDetails(Student student) throws StudentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewStudentDetails(Student student) throws StudentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateId(int id) throws StudentException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateName(String name) throws StudentException {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile( "[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(name);
		if(matcher.matches()){
			return true;
		}
				
		else{
			throw new StudentException("invalid name");
		}
		
		
	}

	@Override
	public boolean validateCity(String city) throws StudentException {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile( "[A-Z]{1}[a-z]");
		Matcher matcher = pattern.matcher(city);
		if(matcher.find()){
			return true;
		}
				
		else{
			System.out.println("Invalid City");
		}
		return true;		
	}

	@Override
	public boolean validateMobileNo(String phoneNo) throws StudentException {
		// TODO Auto-generated method stub
		if(!phoneNo.matches("\\d[0-9]{10}")){
			throw new StudentException("Moblie Number should contain 10 digits");			
		}
		return true;
		
	}

	@Override
	public boolean validateEmailId(String emailId) throws StudentException {
		// TODO Auto-generated method stub
		if(!emailId.matches("^(.*)@(.*)$")){
			
			throw new StudentException("Invalid E-mail Id please check your e-mail id");	
		}
		return true;
	}

	

}
