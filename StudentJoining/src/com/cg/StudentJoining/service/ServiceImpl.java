package com.cg.StudentJoining.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.cg.StudentJoining.exception.StudentException;
import com.cg.StudentJoining.entity.Student;

public class ServiceImpl implements IService{

	@Override
	public void insertDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nearByLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewAllColleges() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CollegesByMarks() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	public void validateStudent(Student student) throws StudentException
	{
		List<String> validationErrors = new ArrayList<String>();

		//Validating donor name
		if(!(isValidsname(student.getSname()))) {
			validationErrors.add("\n Student Name Should Be  minimum 3 characters long ! \n");
		}
		//Validating address
		if((isValidsmail(student.getSmail()))){
			validationErrors.add("\n mail  \n");
		}
		//Validating marks
		if(!(isValidsmarks(student.getSmarks()))){
			validationErrors.add("\n marks should be more than 60 percent");
		}
		//Validating location
		if(!(isValidslocation(student.getSlocation()))){
			validationErrors.add("\n location shoud be more than 3 characters \n" );
		}
		
		if(!validationErrors.isEmpty())
			throw new StudentException(validationErrors +"");
	}
	
	public boolean isValidsname(String sname) {
		Pattern namepattern=Pattern.compile("^[A-Za-z]{3,}$");
		Matcher namematcher=namepattern.matcher(sname);
		return namematcher.matches() ;
		
	}
	public boolean isValidsmail(String smail) {
		Pattern mailpattern=Pattern.compile("[a-z]([a-zA-Z0-9].)*@([a-z]{5}).([a-z]{2,3})");
		Matcher mailmatcher=mailpattern.matcher(smail);
		System.out.println(mailmatcher.matches());
		return mailmatcher.matches() ;
	}
	public boolean isValidsmarks(int smarks) {
		
		Pattern markspattern=Pattern.compile("^[0-9]*$");
		Matcher marksmatcher=markspattern.matcher(Integer.toString(smarks));
		return marksmatcher.matches() ;
	}
	public boolean isValidslocation(String slocation) {
		Pattern locationpattern=Pattern.compile("[A-Za-z]{2,}$");
		Matcher locationmatcher=locationpattern.matcher(slocation);
		return locationmatcher.matches() ;
		
		
		
		
	
	}
	
	
	
	
	
	
	
	

}
