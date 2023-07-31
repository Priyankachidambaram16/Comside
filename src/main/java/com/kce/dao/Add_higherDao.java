package com.kce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.kce.model.Add_highermodel;

import com.kce.util.DBUtil;

public class Add_higherDao {
	public boolean insertData(Add_highermodel sample) {
		Connection con = DBUtil.createconnection();
		String query = "insert into higheroffcial values(?,?)";
		String query1="commit";
		int rowcount = 0;
		try {
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, sample.getName());
			ps.setString(2, sample.getPassword());
			
			rowcount = ps.executeUpdate();
 PreparedStatement ps1=con.prepareStatement(query1);
 ps1.execute();
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rowcount >= 1) {
			return true;
		} else {
			return false;
		}
// return false;

	}
}
