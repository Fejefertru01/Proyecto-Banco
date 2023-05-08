package prBanco;

/**
 * 
 * @author Pablo Jesús Calvente Ramírez, Fernando Jesús Fernández Trujillo,
 *         Pablo Perez Iza
 * @version 1.1
 */
public class Clientes {
	private String nombre;
	private String apellidos;

	/**
	 * Contructor de la clase cliente.
	 * 
	 * @param nombre    nombre del cliente
	 * @param apellidos apellidos del cliente
	 */
	public Clientes(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	/**
	 * Cambia el nombre del cliente
	 * 
	 * @param nombre nuevo nombre del cliente
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Cambia el apellido del cliente
	 * 
	 * @param apellidos nuevo apellido del cliente
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Devuelve el valor de la variable nombre
	 * 
	 * @return nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Devuelve el valor de la variable apellidos
	 * 
	 * @return apellidos del cliente
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Representa al cliente de la manera deseada
	 * 
	 * @return representacion del cliente
	 */
	@Override
	public String toString() {
		return "-------------------\nCliente:\nNombre:" + nombre + "\nApellido: " + apellidos + "\n";
	}
}
