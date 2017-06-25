package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Conexion {

	private final String user = "root";
	private final String password = "";
	private final String host = "localhost";
	private final String database = "bdAlmacenscs";
	private final String port = "3306";
	private Connection conexion = null;
	
	public Conexion(){
		
	}
	
	public Connection conectar() throws ClassNotFoundException, SQLException{
		
		Class.forName("org.gjt.mm.mysql.Driver");
	    conexion = DriverManager.getConnection(
	       "jdbc:mysql://"+host+":"+port+"/"+database, user, password);
		
        return conexion;
	}
	
	public void desconectar(){
		
		if(conexion != null){
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
