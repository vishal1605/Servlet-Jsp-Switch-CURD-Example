package com.crud.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class CrudConnections {
	private static String userName="root";
	private static String jdbcPassword="900482";
	private static String JdbcUrl = "jdbc:mysql://localhost:3306/myproject";
	private static Connection con=null;
	public static Connection getCon() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(JdbcUrl, userName, jdbcPassword);
			if(con==null) {
				System.out.println("Error");
			}else {
				System.out.println("Done");
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}

	public static void main(String[] args) {
		getCon();

	}


}
