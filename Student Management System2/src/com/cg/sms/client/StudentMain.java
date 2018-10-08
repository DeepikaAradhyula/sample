package com.cg.sms.client;

import java.util.Scanner;

import com.cg.sms.exception.StudentException;
import com.cg.sms.service.StudentInterface;
import com.cg.sms.service.StudentService;

public class StudentMain{
	
	Scanner s = new Scanner(System.in);
	StudentInterface si = new StudentService();
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		StudentMain sm = new StudentMain();
	
		while(true){
			System.out.println("Menu: ");
			System.out.println("Student Management System");
			System.out.println("1. Add Student Details");
			System.out.println("2. View Student Details");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			int option = s.nextInt();
			
			switch(option){
				
				case 1:
					sm.addStudentDetails();
					break;
				case 2:
					sm.viewStudentDetails();
					break;
				case 3:
					System.exit(0);
			}
		}
	}

	private void addStudentDetails() {
		// TODO Auto-generated method stub
		System.out.print("Enter Student Name: ");
		String name = s.nextLine();
		System.out.println("Enter Student ID: ");
		int id = s.nextInt();
		System.out.println("Enter City: ");
		String city = s.next();
		
		try {
			boolean result1 = si.validateName(name);
			boolean result2 = si.validateId(id);
			boolean result3 = si.validateCity(city);
			if(result1){
				
			}
			else if(result2){
				
			}
			else if(result3){
				
			}
		} catch (StudentException e) {

		}
	
			
		
		
	}

	private void viewStudentDetails() {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
		
			
			
	

