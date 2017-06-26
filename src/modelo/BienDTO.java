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
			 resultSet = statement.executeQuery("SELECT * FROM bien where eliminado = 0");
			 
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
		System.out.print("hola :");
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

	public boolean insertar(String desc, String cantidad, String precio, String categoria) {
		String insertTableSQL = "INSERT INTO bien"
				+ "(idBien, descBien,unidades,precio,estbloqueo,userBloqueo) VALUES"
				+ "(?,?,?,?,?,?)";
		System.out.print("Aqui");
		// execute insert SQL stetement
		try {
			double p=Double.parseDouble(precio);
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
			preparedStatement.setInt(1, 0);
			preparedStatement.setString(2,desc);
			preparedStatement.setString(3,cantidad);
			preparedStatement.setDouble(4,p);
			preparedStatement.setInt(5,0);
			preparedStatement.setString(6, "cumpita");
			preparedStatement .executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(String cod) {
		String insertTableSQL = "UPDATE bien "
				+ "SET eliminado = ? "
				+ "WHERE idBien like ? ";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
			preparedStatement.setString(1, "1");
			preparedStatement.setString(2,cod );
			preparedStatement .executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

public boolean modificar(String codigo,String desc,String unidades,double precio){
		
		String insertTableSQL = "UPDATE bien "
				+ "SET descBien= ? , unidades= ?, precio=?,estbloqueo=?,userBloqueo=? "
				+ "WHERE idBien like ? AND eliminado = ?";
			
		// execute insert SQL stetement
		System.out.println(codigo+" "+desc);
		try {
			System.out.print("aqui en modificar ");
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
<<<<<<< HEAD
			
			preparedStatement.setString(1,desc);
			preparedStatement.setString(2,unidades);
			preparedStatement.setDouble(3,precio);
			preparedStatement.setInt(4,0);
			preparedStatement.setString(5,"nadie" );
			preparedStatement.setString(6, codigo);
=======
			preparedStatement.setString(1, desc);
			preparedStatement.setString(2,unidades);
			preparedStatement.setDouble(3,precio);
			preparedStatement.setInt(4,0);
			preparedStatement.setString(5,"nadie");
			preparedStatement.setString(6,codigo );
>>>>>>> 8c9c00fb228e446a851f57db161fbee31e6e29dd
			preparedStatement.setString(7,"0" );
			
			return preparedStatement .executeUpdate()>0? true:false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
