package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
	
	
	Conexion conexion;
	
	public Login(){
		conexion = new Conexion();
	}

	public boolean loguear(String user,String pass){
		
		ResultSet rs;
			
		String sql = "SELECT *  FROM usuarios "
				+ "WHERE nombreUser =? AND contraseña=? ";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(sql);
			
			preparedStatement.setString(1,user );
			preparedStatement.setString(2,pass );
			rs = preparedStatement .executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		finally{
			conexion.desconectar();
		}
		return false;
		}
	
	public boolean insertarUsuario(String user,String contra){
		
		PreparedStatement ps = null;
	   
		String query = "INSERT INTO usuarios (nombreUser,contraseña) values ( ?, ?)";
			try {		
				ps = conexion.conectar().prepareStatement(query);
				ps.setString(1, user);
				ps.setString(2, contra);
				ps.executeUpdate();
				return true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			conexion.desconectar();
		}
			return false;
	}
	
	public boolean checkUserIfExists(String user){
		ResultSet rs;
		
		String sql = "SELECT *  FROM usuarios "
				+ "WHERE nombreUser =?";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(sql);
			
			preparedStatement.setString(1,user );
			rs = preparedStatement .executeQuery();
			return rs.next();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		finally{
			conexion.desconectar();
		}
		return false;
	}
	
}
