package ConectarBDconJava;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;


public class ConectarBD {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost/phoneland2022","root","");
            
		if (conn != null) {
			System.out.println("Conexion a base de datos ok");
		conn.close();
	
	}

}
catch (SQLException e) {
System.out.println("Error en la conexion" + e.getMessage());


}
}
}
