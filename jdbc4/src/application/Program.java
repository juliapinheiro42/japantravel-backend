package application;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import db.DbIntegrityException;


public class Program {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
		
			st = conn.prepareStatement(
					"DELETE FROM promotions "
					+ "WHERE "
					+"Id = ?");
			
			st.setInt(1, 4);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("done! Rows Affected: " +rowsAffected);
		}
		catch(SQLException e){
			throw new DbIntegrityException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
}
}