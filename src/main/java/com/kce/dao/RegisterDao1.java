package com.kce.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.kce.model.Registercomplainsmodel;
import com.kce.model.Registermodel;
import com.kce.util.DBUtil;

public class RegisterDao1 {
	public static ArrayList<Registercomplainsmodel> getAllDetails() {
		ArrayList<Registercomplainsmodel> c=new ArrayList<>();

		Connection con=DBUtil.createconnection();
		String query="SELECT * FROM registercomplains";

		try {
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs=ps.executeQuery(query);
		while(rs.next()) {
			Registercomplainsmodel ct=new Registercomplainsmodel();
		ct.setName(rs.getString("name"));
		System.out.println(rs.getString("name"));
		ct.setEmail(rs.getString("email"));
		System.out.println(rs.getString("email"));
		ct.setSubject(rs.getString("subject"));
		System.out.println(rs.getString("subject"));
		ct.setComplains(rs.getString("complains"));
		System.out.println(rs.getString("complains"));
		c.add(ct);
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
    public static int delete(String name){  
        int status=0;  
        try{  
        	Connection con=DBUtil.createconnection();
            PreparedStatement ps=con.prepareStatement("delete from registercomplains where name=?");  
            ps.setString(1,name);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
}
