package application;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;


public class Program {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();		
		   st = conn.prepareStatement(
				   "INSERT INTO clients "
				   + "(Name, Email, Password, PromotionsId) " 
						   + "VALUES "
				   +"(? ,? ,? , ?)",
				   Statement.RETURN_GENERATED_KEYS);
		   
		   st.setString(1, "João Garcia");
		   st.setString(2, "jgarcia.123@gmail.com");
		   st.setString(3, "270588");
		   st.setInt(4, 2);
		   
		   int rowsAffected = st.executeUpdate();
		   
		  if (rowsAffected > 0) {
			 ResultSet rs = st.getGeneratedKeys();
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 System.out.println("Done! ClientId = " + id);
			 }
		  }
		  else {
			  System.out.println("No rown affected!");
		  }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			conn = DB.getConnection();		
		   st = conn.prepareStatement(
				   "INSERT INTO promotions "
				   + "(Name, Stock, Price) " 
						   + "VALUES "
				   +"(? ,? , ?)",
				   Statement.RETURN_GENERATED_KEYS);
		   
		   st.setString(1, "Kyoto");
		   st.setDouble(2, 20.0);
		   st.setDouble(3, 4998.7);
		   
		   int rowsAffected = st.executeUpdate();
		   
		  if (rowsAffected > 0) {
			 ResultSet rs = st.getGeneratedKeys();
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 System.out.println("Done! PromoId = " + id);
			 }
		  }
		  else {
			  System.out.println("No rown affected!");
		  }
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
}
}