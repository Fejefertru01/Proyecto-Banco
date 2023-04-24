package prBanco;

public class Clientes {
	private String nombre;
	private String apellidos;

	public Clientes(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void getNombre(String nombre) {
		this.nombre = nombre;
	}

	public void getApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
}
