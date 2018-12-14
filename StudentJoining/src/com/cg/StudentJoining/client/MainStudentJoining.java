package com.cg.StudentJoining.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.cg.StudentJoining.dao.DaoImpl;
import com.cg.StudentJoining.dao.IDao;
import com.cg.StudentJoining.entity.Student;
import com.cg.StudentJoining.exception.StudentException;
import com.cg.StudentJoining.service.ServiceImpl;

public class MainStudentJoining {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("WELCOME TO STUDENT JOINING");
		System.out.println("1.REGISTER");
		System.out.println("2.VIEW ALL COLLEGES");
		System.out.println("3.CHECK NEAR BY COLLEGES");
		System.out.println("4.EXIT");
		System.out.println("choose your option:");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			Student s=new Student();
		
		System.out.println("enter your name:");
		String name=sc.next();
		s.setSname(name);
		System.out.println("enter your mailid:");
		String mail=sc.next();
		s.setSmail(mail);
		System.out.println("enter your marks:");
		int marks=sc.nextInt();
		s.setSmarks(marks);
		System.out.println("enter your location");
		String location=sc.next();
		s.setSlocation(location);
		ServiceImpl serviceimpl=new ServiceImpl();
			try {
				serviceimpl.validateStudent(s);
			} catch (StudentException e) {
				System.out.println(e);
			}
			IDao idao;
			idao=new DaoImpl();
			try {
				idao.insertDetails(s);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		break;
		
		
		}
	}

}
