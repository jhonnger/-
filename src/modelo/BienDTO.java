package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entidades.Bien;

public class BienDTO {
	
	Conexion conexion;
	
	public BienDTO(){
		conexion = new Conexion();
	}

	public ArrayList<Bien> listar(){
		Statement statement;
		ResultSet resultSet;
		
		ArrayList<Bien> bienes;
		Bien bien;
		
		bienes =  new ArrayList<>();
		try {
			 statement = conexion.conectar().createStatement();
			 resultSet = statement.executeQuery("SELECT * FROM bien");
			 
			 while(resultSet.next())  {
					bien=new Bien(); 
					
					bien.setId(resultSet.getString(1));
					bien.setDescripcion(resultSet.getString(2)); 
					bien.setUnidades(resultSet.getString(3)); 
					bien.setPrecio(resultSet.getDouble(4));
					bien.setEstadoBloqueo(resultSet.getInt(5));
					bien.setUserBloqueo(resultSet.getString(6));
					
					bienes.add(bien);
					}
			resultSet.close();
			 
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			try{
			 conexion.desconectar();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		return bienes;
	}
	
	public boolean insertar(String descripcion,int unidades, double precio){
		
		String insertTableSQL = "INSERT INTO bien"
				+ "(idBien, descBien, unidades, precio) VALUES"
				+ "(?,?,?,?)";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
			preparedStatement.setInt(1, 11);
			preparedStatement.setString(2,descripcion );
			preparedStatement.setInt(3, unidades);
			preparedStatement.setDouble(4, precio);
			preparedStatement .executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
