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


	/**
	 * Constructor clase cuenta
	 * 
	 * @param iban   iban de la cuenta
	 * @param saldo  saldo de la cuenta
	 * @param estado estado de la cuenta
	 */
	public Cuenta(int iban, double saldo, String estado) {
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


	/**
	 * Setter del estado
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


	/**
	 * Getter del estado
	 * 
	 * @return estado
	 */

	public String getEstado() {
		return this.estado;
	}
	
	/**
	 * Representa a la cuenta de la manera deseada
	 * @return representacion de la cuenta
	 */
	public String toString() {
		return "Saldo: "+this.saldo+" ,estado: "+this.estado;
	}
}
