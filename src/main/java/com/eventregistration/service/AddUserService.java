package com.eventregistration.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.eventregistration.entity.User;
import com.eventregistration.utils.DBConnection;

public class AddUserService {

	public boolean AddUser(User user)
	{
		boolean status=false;
		try
		{
			Connection con=DBConnection.getConnection();
			
			String sql="insert into User values(?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getRc_id());
			ps.setString(3, user.getCollegeName());
			ps.setString(4, user.getContact());
			ps.setString(5, user.getYear());
			ps.setString(6, user.getStream());
			
			if(ps.executeUpdate()==1)
				return true;
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return status;
	}
}
