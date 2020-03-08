package com.mahima.web.Dao;

import com.mahima.web.model.Mahima;
import java.sql.*;
public class MahimaDao 
{
	public Mahima getMahima(int aid)
	{
		Mahima m=new Mahima();
		
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from jspServlet where aid="+aid);
			if(rs.next())
			{
				m.setAid(rs.getInt("aid"));
				m.setAname(rs.getString("aname"));
				m.setTech(rs.getString("tech"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return m;
		
		
		
	}

}
