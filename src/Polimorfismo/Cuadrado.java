package Polimorfismo;

public class Cuadrado extends Figura {

	private double lado;
	
	
	
	public Cuadrado() {
	}

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		// TODO Auto-generated method stub
		return lado * lado;
	}

	@Override
	public double calcularPerimetro() {
		// TODO Auto-generated method stub
		return lado * 4;
	}

}
