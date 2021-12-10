package ClasesObjetos;

public class Punto5a {
	//Atributos
	private double x = 0.0;
	private double y;
	//Constructores
	public Punto5a() {
		x=2.2;
		y=0.0;
	}
	public Punto5a(double param1, double param2) {
		x= param1;
		y=param2;
	}
	
	//Getters
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	
	//Resto de metodos
	public double calcularDistanciaDesde(Punto5a param) {
		double cateto1 = x - param.getX();
		double cateto2 = y - param.getY();
		double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
		return hipotenusa;
	}
	
}

