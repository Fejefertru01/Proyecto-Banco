package prBanco;

public abstract class Operaciones {
/**
 * Metodo para sumar dinero a una cuenta
 * @param c cuenta a la que se le va a añadir el dinero.
 * @param cantidad cantidad de dinero a sumar
 */
	public void prestamo(Cuenta c, int cantidad) {
		 c.setSaldo(c.getsaldo()+cantidad);
	}
}
