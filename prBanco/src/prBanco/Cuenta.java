package prBanco;

/**
 * 
 * @author Pablo Jesús Calvente Ramírez, Fernando Jesús Fernández Trujillo,
 *         Pablo Pérez Iza
 * @version 1.1
 *
 */

public class Cuenta {
	private int iban;
	private double saldo;
	private String estado;

	/**
	 * Constructor vacio clase cuenta
	 * 
	 * @param iban   iban de la cuenta
	 * @param saldo  saldo de la cuenta
	 * @param estado estado de la cuenta
	 */
	public Cuenta() {
		iban = 0;
		saldo = 0;
		estado = "";
	}

<<<<<<< HEAD
	/**
	 * Constructor clase cuenta
	 * 
	 * @param iban   iban de la cuenta
	 * @param saldo  saldo de la cuenta
	 * @param estado estado de la cuenta
	 */
	public Cuenta(int iban, double saldo, String estado) {
=======
	public Cuenta(int iban, double saldo, String estado) {

>>>>>>> c24fe17cdc89a3ddf30815528ef535412ddb3b64
		this.iban = iban;
		this.saldo = saldo;
		this.estado = estado;
	}

	/**
	 * Getter del iban
	 * 
	 * @return iban
	 */
	public int getiban() {
		return iban;
	}

	/**
	 * Getter del saldo
	 * 
	 * @return saldo
	 */
	public double getsaldo() {
		return saldo;
	}

	/**
	 * Setter del iban
	 * 
	 * @param iban
	 */
	public void setIban(int iban) {
		this.iban = iban;
	}

	/**
	 * Setter del saldo
	 * 
	 * @param saldo
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

<<<<<<< HEAD
	/**
	 * Setter del estado
	 * 
	 * @param estado
	 */
=======
>>>>>>> c24fe17cdc89a3ddf30815528ef535412ddb3b64
	public void setEstado(String estado) {
		this.estado = estado;
	}

<<<<<<< HEAD
	/**
	 * Getter del estado
	 * 
	 * @return estado
	 */
=======
>>>>>>> c24fe17cdc89a3ddf30815528ef535412ddb3b64
	public String getEstado() {
		return this.estado;
	}
	public String toString() {
		return "Saldo: "+this.saldo+" ,estado: "+this.estado;
	}
}
