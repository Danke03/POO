package Herencia;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Punto3DHerencia p1 = new Punto3DHerencia(5,10,15);
		
		p1.setX(50);
		p1.setY(100);
		p1.setZ(150);
		
		System.out.println("El valor en x es: " + p1.getX());
		System.out.println("El valor en y es: " + p1.getY());
		System.out.println("El valor en z es: " + p1.getZ());
	}

}
