package Zoo;

public class Gato extends Felino{

	private String nombre;

	public Gato(int tamano, int peso, String pupilas, String nombre) {
		super(tamano, peso, pupilas);
		this.nombre = nombre;
	}

	public Gato() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
	return "Los gatos tienen nombre: " + nombre;
	
}
}