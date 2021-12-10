package ClasesObjetos;

public class Circulo {
//Atributos
	private Punto5a centro = null;
	private double radio = 0.0;
	
	//Constructores
	public Circulo() {
		centro = new Punto5a();
		radio = 3.1;
	}
	
	public Circulo(Punto5a param1, double param2) {
		centro = param1;
		radio = param2;
	}
	
	public Circulo(double param1, double param2, double param3) {
		centro = new Punto5a(param1, param2);
		radio = param3;
	}
	
	//Getters
	public Punto5a getCentro() {
		return centro;
	}
	
	public double getRadio() {
		return radio;
	}
	
	//Resto de metodos
	public double calcularArea() {
		return Math.PI * radio * radio;
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public double calcularDistanciaDesde(Punto5a param) {
		return centro.calcularDistanciaDesde(param);
	}
}
