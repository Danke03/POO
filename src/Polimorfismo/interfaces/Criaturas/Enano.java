package Polimorfismo.interfaces.Criaturas;

public class Enano {

	private String nombre = null;
	private int fuerza = 0;
	
	public Enano(String nombre, int fuerza) {
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
		return "Soy el Enano: " + nombre + "de fuerza: " + fuerza;
	}
}
