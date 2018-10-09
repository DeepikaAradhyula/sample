package com.cg.sms.service;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentException;

public class StudentService implements StudentInterface {

	//create object for dao??
	StudentInterface service=new StudentService();
	
	@Override
	public void addStudentDetails(Student student) throws StudentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewStudentDetails(Student student) throws StudentException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateDetails(int id,String name,String city,String phoneNo,String emailId){
		if(service.validateId(id)&&service.validateName(name)&&service.validateCity(city)&&service.validateMobileNo(phoneNo)&&service.validateEmailId(emailId)){
			return true;
		}else{
			throw new StudentException();
		}
		
	}
	
	
	private boolean validateId(int id) throws StudentException {
		// TODO Auto-generated method stub
		return false;
	}

	
	private boolean validateName(String name) throws StudentException {
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

	
	private boolean validateCity(String city) throws StudentException {
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

	
	private boolean validateMobileNo(String phoneNo) throws StudentException {
		// TODO Auto-generated method stub
		if(!phoneNo.matches("\\d[0-9]{10}")){
			throw new StudentException("Moblie Number should contain 10 digits");			
		}
		return true;
		
	}

	
	private boolean validateEmailId(String emailId) throws StudentException {
		// TODO Auto-generated method stub
		if(!emailId.matches("^(.*)@(.*)$")){
			
			throw new StudentException("Invalid E-mail Id please check your e-mail id");	
		}
		return true;
	}

	

}
