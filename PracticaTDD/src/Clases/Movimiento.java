package Clases;

public class Movimiento {
	Double importe;
	enum signo{D, H};
	String detalle;
	
	public Movimiento(Double importe,signo sig, String detalle) {
		super();
		this.importe = importe;
		this.detalle = detalle;
	}
	
}
