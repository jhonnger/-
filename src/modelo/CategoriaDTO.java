package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Entidades.Categoria;

public class CategoriaDTO {

Conexion conexion;
	
	public CategoriaDTO(){
		conexion = new Conexion();
	}
	
	public ArrayList<Categoria> listar(){
		Statement statement;
		ResultSet resultSet;
		
		ArrayList<Categoria> categorias;
		Categoria categoria;
		
		categorias =  new ArrayList<>();
		try {
			 statement = conexion.conectar().createStatement();
			 resultSet = statement.executeQuery("SELECT * FROM categoria WHERE eliminado = 0");
			 
			 while(resultSet.next())  {
				 categoria=new Categoria(); 
					
				 categoria.setId(resultSet.getString(1));
				 categoria.setDescripcion(resultSet.getString(2)); 
				 categoria.setCorrelativo(resultSet.getInt(3));
					
				 categorias.add(categoria);
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
		return categorias;
	}
	
public boolean insertar(String codigo, String descripcion){
		
		String insertTableSQL = "INSERT INTO categoria"
				+ "(codCat, desccat) VALUES"
				+ "(?,?)";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
			preparedStatement.setString(1, codigo);
			preparedStatement.setString(2,descripcion );
			preparedStatement .executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

	public boolean eliminar(String codigo){
		
		String insertTableSQL = "UPDATE categoria "
				+ "SET eliminado = ? "
				+ "WHERE codCat like ? ";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
			preparedStatement.setString(1, "1");
			preparedStatement.setString(2,codigo );
			preparedStatement .executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	public boolean modificar(String codigo,String desc){
		
		String insertTableSQL = "UPDATE categoria "
				+ "SET desccat= ?  "
				+ "WHERE codCat like ? AND eliminado = ? ";
		
		// execute insert SQL stetement
		try {
			PreparedStatement preparedStatement = conexion.conectar().prepareStatement(insertTableSQL);
			preparedStatement.setString(1, desc);
			preparedStatement.setString(2,codigo );
			preparedStatement.setString(3,"0" );
			
			return preparedStatement .executeUpdate()>0? true:false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
