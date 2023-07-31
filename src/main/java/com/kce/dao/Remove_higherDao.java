package com.kce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kce.model.Add_highermodel;
import com.kce.model.Remove_highermodel;
import com.kce.model.Remove_staffmodel;
import com.kce.util.DBUtil;

public class Remove_higherDao {
	public boolean removeData(Remove_highermodel s) {
	Connection con = DBUtil.createconnection();
	String query = "DELETE FROM higheroffcial WHERE name=?";
	String query1="commit";
	int rowcount = 0;
	try {
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, s.getName());
		
		
		rowcount = ps.executeUpdate();
PreparedStatement ps1=con.prepareStatement(query1);
ps1.execute();
	} catch (SQLException e) {
//TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (rowcount >= 1) {
		return true;
	} else {
		return false;
	}
}
}
