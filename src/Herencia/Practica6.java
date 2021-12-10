package Herencia;

public class Practica6 {

	public static void main(String[] args) {
		Titular t1 = new Titular(new String ("Mi nombre"), new String("Mis apellidos"), 10);
		CuentaCorriente c1 = new CuentaCorriente(t1, new String("123456789"));
		CuentaAhorro c2  = new CuentaAhorro(new Titular(new String ("Otro nombre"), new String("Otros apellidos"), 43), new String("987654321"), 100.5, 1.7);
		
		System.out.println("Cuenta 1: " + c1);
		System.out.println("Cuenta 2: " + c2);
		c1.reintegro(1.2);
		c2.ingreso(1.2);
		System.out.println("Cuenta 1: " + c1);
		System.out.println("Cuenta 2: " + c2);
		c2.calcularInteres();
		System.out.println("Cuenta 2: " + c2);
		System.out.println("¿Son la misma cuenta?: : " + c2.equals(c1));

	}

}
