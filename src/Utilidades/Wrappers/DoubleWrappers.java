package Utilidades.Wrappers;

import Utilidades.Practica.Lector;

public class DoubleWrappers {

	public static void main(String[] args) {
		
//		System.out.println("Dame un valor: ");
//		String valor1 = Lector.leerString();
//		
//		System.out.println("Dame otro valor: ");
//		String valor2 = Lector.leerString();
		
		System.out.println("Dame un valor: ");
		Double valor1 = Lector.leerDouble();
		
		System.out.println("Dame un valor: ");
		Double valor2 = Lector.leerDouble();
		
		
		Double resultado= valor1 + valor2;
		
		System.out.println("El valor que me diste fue: " + valor1 + " y " + valor2);
		System.out.println("El valor de la suma de a y b: " + resultado);

	}

}
