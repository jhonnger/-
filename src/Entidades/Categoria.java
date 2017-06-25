package Entidades;


public class Categoria{
	
	private String id;
	private String descripcion;
	private int correlativo;
	private int estadoBloqueo;
	private String userBloqueo;
	
	public Categoria(){
		
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCorrelativo() {
		return correlativo;
	}

	public void setCorrelativo(int correlativo) {
		this.correlativo = correlativo;
	}

	public int getEstadoBloqueo() {
		return estadoBloqueo;
	}

	public void setEstadoBloqueo(int estadoBloqueo) {
		this.estadoBloqueo = estadoBloqueo;
	}

	public String getUserBloqueo() {
		return userBloqueo;
	}

	public void setUserBloqueo(String userBloqueo) {
		this.userBloqueo = userBloqueo;
	}
	
	
	
}