package Herencia;

public class Animal extends Object{
	
	private int clave;
	private String nombre;
	
	
	
	public Animal(int clave, String nombre) {
		this.clave = clave;
		this.nombre = nombre;
	}



	public String toString() {
		return "La clave del animal es: " + clave + " y su nombre es: " + nombre;
	}

}
