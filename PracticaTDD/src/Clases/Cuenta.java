package Clases;

import java.util.ArrayList;
import java.util.List;

import Clases.Movimiento.signo;

public class Cuenta {
	
	String mNumero;
	String nTitular;
	Double saldo;
	List<Movimiento> mMovimiento;
	Double limite;
	
	public Cuenta(String mNumero, String nTitular, Double saldo) {
		super();
		this.mNumero = mNumero;
		this.nTitular = nTitular;
		this.saldo = saldo;
		this.mMovimiento = new ArrayList<>();
		limite=-500.0;
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

	public void ingreso(Double importe) throws Exception {
		if(importe<0) {
			throw new Exception("Error valor a ingresar negativo");
		}
		Movimiento m = new Movimiento(importe, signo.H, "ingreso");
		this.mMovimiento.add(m);
		
		this.setSaldo(this.getSaldo()+importe);
	}
	
	public void retirar(Double importe) throws Exception {
		if(importe < 0) {
			throw new Exception("No se puede retirar saldo negativo");
		}
		if(this.getSaldo() < importe) {
			throw new Exception("Saldo insuficiente");
		}
		
		Movimiento m = new Movimiento(importe, signo.D, "reintegro");
		this.mMovimiento.add(m);
		
		this.setSaldo(this.getSaldo()-importe);
	}

}
