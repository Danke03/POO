package ClasesObjetos;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Punto punto1 = new Punto();
		Punto punto2 = new Punto(10,10);
		
		System.out.println("Valores del punto 1");
		punto1.setX(20);
		punto1.moverPunto(25, -10);
		System.out.println("Valor en x: " + punto1.getX());
		System.out.println("Valor en y: " + punto1.getY());
		
		System.out.println("");
		System.out.println("Valores del punto 2");
		punto2.setY(30);
		punto2.moverPunto(2, -2);
		System.out.println("Valor en x: " + punto2.getX());
		System.out.println("Valor en y: " + punto2.getY());
	}

}
