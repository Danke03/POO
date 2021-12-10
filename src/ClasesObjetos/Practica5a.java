package ClasesObjetos;

public class Practica5a {

	public static void main(String[] args) {
		Punto5a a = new Punto5a();
		Punto5a b = new Punto5a(1.1,42.3);
		double distancia = a.calcularDistanciaDesde(b);
		System.out.println("La distancia es: " + distancia);
		
		Circulo c = new Circulo(a,5.0);
		System.out.println("El area es: " + c.calcularArea());
		System.out.println("El perimetro es: " + c.calcularPerimetro());
		System.out.println("La distancia es: " + b.calcularDistanciaDesde(c.getCentro()));
		
		Triangulo t = new Triangulo(a,b, new Punto5a(7.3,1.9));
		System.out.println("El area es: " + t.calcularArea());
		System.out.println("El perimetro es: " + t.calcularPerimetro());
		System.out.println("La distancia es: " + t.calcularDistanciaDesde(new Punto5a(8.0,9.0)));

	}

}
