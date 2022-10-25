package Clases;

public class Cuenta {
	
	String mNumero;
	String nTitular;
	Double saldo;
	
	
	
	public Cuenta(String mNumero, String nTitular, Double saldo) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo = saldo;
	}

	public String getmNumero() {
		return mNumero;
	}

	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}

	public String getnTitular() {
		return nTitular;
	}

	public void setnTitular(String nTitular) {
		this.nTitular = nTitular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingreso(Double importe) {
		this.saldo= this.saldo+importe;
	}
	
	public void retirar(Double importe) {
		if(saldo >= importe) {
			this.saldo = this.saldo-importe;
		}
	}

}
