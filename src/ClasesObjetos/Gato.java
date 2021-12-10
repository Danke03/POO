package ClasesObjetos;

public class Gato {

		//Atributos
	private String nombre;
	private String raza;
	
	//Getters y Setters
	String getNombre() {
		return nombre;
	}
	
	String getRaza() {
		return raza;
	}
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	void serRaza(String raza) {
		this.raza = raza;
	}
	
	//Metodos extra
	
	public void jugar() {
		System.out.println("El gato juega");
	}
	
	public void comer() {
		System.out.println("El gato come");
	}
}
