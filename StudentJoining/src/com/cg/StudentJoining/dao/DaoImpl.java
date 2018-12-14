package com.cg.StudentJoining.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import com.cg.StudentJoining.DB.DBConnection;
import com.cg.StudentJoining.entity.Student;
import java.sql.*;

public class DaoImpl implements IDao{
	DBConnection db=new DBConnection();

	@Override
	public void insertDetails(Student s) throws ClassNotFoundException, SQLException {
		int rs=0;
		Connection conn=db.getconnection();
		Statement st=conn.createStatement();
		PreparedStatement psmt=conn.prepareStatement("insert into StudentJoining values(Student_Sequence.nextval,?,?,?,?)");
		psmt.setString(1,s.getSname());
		psmt.setString(2,s.getSmail());
		psmt.setInt(3,s.getSmarks());
		psmt.setString(4,s.getSlocation());
		rs=psmt.executeUpdate();
		if(rs!=0) {
			System.out.println("sucess");
		}
		
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
	
	
	
	
	

}
