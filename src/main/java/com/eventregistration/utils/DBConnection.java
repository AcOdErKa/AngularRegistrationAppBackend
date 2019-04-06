package com.eventregistration.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection()
	{
		Connection con = null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/eventregistration","root","root");
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
