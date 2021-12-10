package Utilidades.Practica;

public class Practica9b {

	public static void main(String[] args) {
		System.out.print("Introduzca el primer cateto: "); 
		 String s1 = Lector.leerString(); 
		 System.out.print("Introduzca el segundo cateto: "); 
		 String s2 = Lector.leerString(); 
		 long inicio = System.currentTimeMillis(); 
		 Practica9b.operar(Double.parseDouble(s1), Double.parseDouble(s2)); 
		 long fin = System.currentTimeMillis(); 
		 System.out.println("El método operar se ha ejecutado en: " + (inicio - fin) + " milisegundos."); 
		 } 
		 
		 public static void operar(double num1, double num2) 
		 { 
		 System.out.println("El cateto mayor es: " + Math.max(num1, num2)); 
		 System.out.println("El cateto menor es: " + Math.min(num1, num2)); 
		 System.out.println("La hipotenusa es: " + Math.sqrt(Math.pow(num1,2) + Math.pow(num2,2))); 

	}

}
