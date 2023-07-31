package com.kce.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
public static Connection connection;
public static Connection createconnection() {
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	try {
		connection=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","admin");
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return connection;
	
}
}
