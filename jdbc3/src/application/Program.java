package application;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;


public class Program {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
		
			st = conn.prepareStatement(
					"UPDATE clients "
					+ "SET password =  ? "
					+ "WHERE "
					+ "(Id = ?)");
			
			st.setString(1, "453bvc");
			st.setInt(2, 3);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("done! Rows Affected: " +rowsAffected);
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
}
}