package prBanco;

public class Cuenta {

	private int iban;
	private double saldo;

	public Cuenta() {
		iban = 0;
		saldo = 0;
	}

	public Cuenta(int iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

	public int getiban() {
		return iban;
	}

	public double getsaldo() {
		return saldo;
	}

	public void setIban(int iban) {
		this.iban = iban;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
