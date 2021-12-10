package Polimorfismo.interfaces;

public class Personaje implements HabilidadesExtras, HabilidadesExtras2, HabilidadesdeSoka{

	private String nombre;
	private int defensa;
	private int ataque;
	
	
	public Personaje() {
	}


	public Personaje(String nombre, int defensa, int ataque) {
		this.nombre = nombre;
		this.defensa = defensa;
		this.ataque = ataque;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getDefensa() {
		return defensa;
	}


	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}


	public int getAtaque() {
		return ataque;
	}


	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	
	
	//Otros metodos
	public void tenerSuperVelocidad() {
		System.out.println("Ahora tienes super velocidad");
		
	}
	
	public void tenerSuperInvencibilidad() {
		System.out.println("Ahora tienes invencibilidad");
		
	}


	@Override
	public void lucharConFuego() {
		System.out.println("Ahora puedes usar el fuego");
		
	}


	@Override
	public void lucharConAgua() {
		System.out.println("Ahora puedes usar el agua");
		
	}


	@Override
	public void lucharConTierra() {
		System.out.println("Ahora puedes usar la tierra");
		
	}


	@Override
	public void lucharConAire() {
		System.out.println("Ahora puedes usar el aire");
		
	}


	@Override
	public void lucharConLava() {
		System.out.println("Ahora puedes usar la lava para atacar");
		
	}


	@Override
	public void lucharConSangre() {
		System.out.println("Ahora puedes usar la sangre para atacar");
		
	}


	@Override
	public void lucharConLaEspada() {
		System.out.println("Ahora puedes usar la espada para atacar");
		
	}
}
