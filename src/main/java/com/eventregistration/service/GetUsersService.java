package com.eventregistration.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eventregistration.entity.User;
import com.eventregistration.utils.DBConnection;

public class GetUsersService {
	
	public List<User> getAllUsers()
	{
		List<User> users=new ArrayList<>();
		try {
			String sql="select * from User";
			Connection con=DBConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			
			while(rs.next())
			{
				User user=new User();
				user.setName(rs.getString(1));
				user.setRc_id(rs.getString(2));
				user.setCollegeName(rs.getString(3));
				user.setContact(rs.getString(4));
				user.setYear(rs.getString(5));
				user.setStream(rs.getString(6));
				
				users.add(user);
			}
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return users;
	}

}
