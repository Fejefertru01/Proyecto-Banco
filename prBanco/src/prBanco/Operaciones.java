package prBanco;

/**
 * 
 * @author Pablo Jesús Calvente Ramírez, Fernando Jesús Fernández Trujillo,
 *         Pablo Perez Iza
 * @version 1.1
 */
public abstract class Operaciones {

	/**
	 * Bloquea el estado de la cuenta.
	 * 
	 * @param c cuenta la cual se va a bloquear
	 */
	public void bloquear(Cuenta c) {
		c.setEstado("Bloqueada");
	}

	/**
	 * Activa la cuenta.
	 * 
	 * @param c cuenta la cual se va a activar.
	 */
	public void desbloquear(Cuenta c) {
		c.setEstado("Activa");
	}

	/**
	 * Metodo para sumar dinero a una cuenta
	 * 
	 * @param c        cuenta a la que se le va a añadir el dinero.
	 * @param cantidad cantidad de dinero a sumar
	 */
	public void prestamo(Cuenta c, int cantidad) {
		c.setSaldo(c.getsaldo() + cantidad);
	}
}
