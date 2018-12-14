package com.cg.StudentJoining.dao;

import java.sql.SQLException;

import com.cg.StudentJoining.entity.Student;

public interface IDao {
	void insertDetails(Student s) throws ClassNotFoundException, SQLException;
	void viewAllDetails();
	void nearByLocation();
	void viewAllColleges();
	void CollegesByMarks();

}
