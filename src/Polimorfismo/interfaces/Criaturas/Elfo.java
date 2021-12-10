package Polimorfismo.interfaces.Criaturas;

public class Elfo {

	private String nombre = null;
	private int fuerza = 0;
	
	public Elfo(String nombre, int fuerza) {
		this.nombre = nombre;
		this.fuerza = fuerza;
	}
	
public void descansar() {
		
	}
	public void luchar() {
		
	}
	public void recuperar() {
		
	}
	public String toString() {
		return "Soy el Elfo: " + nombre + "de fuerza: " + fuerza;
	}
}


