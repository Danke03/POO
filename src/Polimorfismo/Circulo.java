package Polimorfismo;

public class Circulo extends Figura{
	
	private Punto centro = null;
	private double radio = 0.0D;
	
	

	public Circulo() {
	
	}

	public Circulo(Punto centro, double radio) {
		this.centro = centro;
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.PI*radio*radio;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return 2*Math.PI * radio;
	}
}
