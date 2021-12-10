package Herencia;

public class Titular {
	//atributos
	private String nombre = null;
	private String apellidos = null;
	private int edad = 0;
	
	//constructores
	public Titular(String param1, String param2, int param3) {
		nombre = param1;
		apellidos = param2;
		edad = param3;
	}
	//Otros metodos
	public String toString() {
		return nombre + " " + apellidos + " " + edad;
	}

}
