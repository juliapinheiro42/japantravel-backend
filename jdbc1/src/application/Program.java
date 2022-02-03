package application;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;




import model.entities.Clients;


public class Program {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from clients");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " , " + rs.getString("Name") + " , " + rs.getString("email") + " , " + rs.getString("password"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		System.out.println("-----------------------------------------Promotions----------------------------------------");
		
		try {
			conn = DB.getConnection();
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from promotions");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + " , " + rs.getString("Name") + " , " + rs.getDouble("Stock") + " , " + rs.getDouble("Price"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			DB.closeResultSet(rs);
		    DB.closeStatement(st);
		    DB.closeConnection();
		}
}
}
