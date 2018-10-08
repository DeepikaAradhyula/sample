package com.cg.sms.dao;
import com.cg.sms.client.*;
import com.cg.sms.entity.Student;
import com.cg.sms.exception.StudentException;

public class StudentDaoImpl implements StudentDao {
	
	Student student = new Student();

	@Override
	public void addStudentDetails(Student student) throws StudentException {
		// TODO Auto-generated method stub
		System.out.println("Name: "+student.getStudentName() +"\n Student ID: "+student.getStudentId()
							+"\n City: "+student.getCity()+"\n Phone No: "+student.getEmailId()
							+"\n E-mail ID: "+student.getEmailId());
	}

	@Override
	public void viewStudentDetails(Student student) throws StudentException {	
		
		System.out.println("Name: "+student.getStudentName() +"\n Student ID: "+student.getStudentId()
				+"\n City: "+student.getCity()+"\n Phone No: "+student.getEmailId()
				+"\n E-mail ID: "+student.getEmailId());
		
	}
	
}
		
		
	
