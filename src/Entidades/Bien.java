package Entidades;

public class Bien {

	private String id;
	private String descripcion;
	private String unidades;
	private double precio;
	private int estadoBloqueo;
	private String userBloqueo;
	
	public Bien(){
		
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

	public String getUnidades() {
		return unidades;
	}

	public void setUnidades(String unidades) {
		this.unidades = unidades;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
