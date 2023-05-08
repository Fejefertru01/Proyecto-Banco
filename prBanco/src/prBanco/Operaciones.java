package prBanco;

/**
 * 
 * @author Pablo Jesús Calvente Ramírez, Fernando Jesús Fernández Trujillo,
 *         Pablo Perez Iza
 * @version 1.1
 */
public abstract class Operaciones {

	/**
	 * Con este método cambiamos la cantidad que queremos de una cuenta a otra
	 * 
	 * @param c1 cuenta 1
	 * @param c2 cuenta 2
	 * @param cantidad cantidad de dinero a camciar de cuenta
	 */
	public void transferencia(Cuenta c1,Cuenta c2, double cantidad) {
		c1.setSaldo(c1.getsaldo()-cantidad); 
		c2.setSaldo(c2.getsaldo()+cantidad); 
	}
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
