package com.kce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kce.model.Add_staffmodel;
import com.kce.model.Registercomplainsmodel;
import com.kce.model.Registermodel;
import com.kce.util.DBUtil;

public class RegisterDao {
	public boolean insertData(Registermodel sample) {
	Connection con = DBUtil.createconnection();
	String query = "insert into registercomplains values(?,?,?,?)";
	String query1="commit";
	int rowcount = 0;
	try {
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, sample.getName());
		ps.setString(2, sample.getEmail());
		ps.setString(3, sample.getSubject());
		ps.setString(4, sample.getComplains());
		rowcount = ps.executeUpdate();
PreparedStatement ps1=con.prepareStatement(query1);
ps1.execute();
	} catch (SQLException e) {

		e.printStackTrace();
	}
	if (rowcount >= 1) {
		return true;
	} else {
		return false;
	}
}
	
	}

