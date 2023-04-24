package prBanco;

public class Banco {

	private int iban;
	private double saldo;

	public Banco() {
		iban = 0;
		saldo = 0;
	}

	public Banco(int iban, double saldo) {
		this.iban = iban;
		this.saldo = saldo;
	}

	public void setIban(int iban) {
		this.iban = iban;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
