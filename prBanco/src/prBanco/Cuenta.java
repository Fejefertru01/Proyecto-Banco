package prBanco;

public class Cuenta {

	private int iban;
	private double saldo;
	private String estado;

	public Cuenta() {
		iban = 0;
		saldo = 0;
		estado="";
	}

	public Cuenta(int iban, double saldo,String estado) {
		this.iban = iban;
		this.saldo = saldo;
		this.estado=estado;
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
	public void setEstado(String estado) {
		this.estado=estado;
	}
	public String getEstado() {
		return this.estado;
	}
}
