package Polimorfismo.interfaces.Criaturas;

public class Troll implements Criatura{

	private String nombre = null;
	private int fuerza = 0;
	
	public Troll(String nombre, int fuerza) {
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
		return "Soy el Troll: " + nombre + "de fuerza: " + fuerza;
	}
}
