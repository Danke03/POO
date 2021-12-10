package ClasesObjetos;

public class Triangulo {
//Atributos
	private Punto5a p1, p2;
	private Punto5a p3 = null;
	
	//Constructores
	public Triangulo() {
		p1 = new Punto5a();
		p2 = new Punto5a(1.2,10.7);
		p3 = new Punto5a(5.5,5.5);
	}
	public Triangulo (Punto5a param1, Punto5a param2, Punto5a param3) {
		p1 = param1;
		p2 = param2;
		p3 = param3;
	}
	public Triangulo(double x1, double x2, double y1, double y2, double x3, double y3) {
		p1 = new Punto5a(x1,y1);
		p2 = new Punto5a(x2,y2);
		p3 = new Punto5a(x3,y3);
	}
	//getters
	public Punto5a getP1() {
		return p1;
	}
	public Punto5a getP2() {
		return p2;
	}
	public Punto5a getP3() {
		return p3;
	}
	
	//Resto de metodos
	public double calcularArea() {
		double base = p1.calcularDistanciaDesde(p2);
		double altura = p1.calcularDistanciaDesde(p3);
		return base * altura /2;
	}
	 public double calcularPerimetro() {
		 double lado1 = p1.calcularDistanciaDesde(p2);
		 double lado2 = p2.calcularDistanciaDesde(p3);
		 double lado3 = p3.calcularDistanciaDesde(p1);
		 return lado1 + lado2 + lado3;
	 }
	 
	 public double calcularDistanciaDesde(Punto5a param) {
		 return p1.calcularDistanciaDesde(param);		 
	 }
}
