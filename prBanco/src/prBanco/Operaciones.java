package prBanco;

public class Operaciones {

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
		
}
