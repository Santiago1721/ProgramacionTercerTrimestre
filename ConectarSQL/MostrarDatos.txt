package ConectarBDconJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MostrarDatos {

	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String sql = "Select * From clientes";
		
		try {
			
			conn=DriverManager.getConnection("jdbc:mysql://localhost/phoneland2022/","host","");
		    stmt= conn.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);
		    while(rs.next()) {
		    	int id= rs.getInt("id");
		    	String nif =rs.getString("Nif");
		    	String nombre = rs.getString("nombre");
		    	String edad = rs.getString("Edad");
		    	System.out.println("id: "+id+",nif "+nif+ " ,nombre "+nombre+",edad "+edad);
		    }
		    
		    
		    conn.close();
		    stmt.close();
		    rs.close();

	}
		catch (SQLException e)
		{e.printStackTrace();

}
}
}
