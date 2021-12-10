package Zoo;

public class Leon extends Felino{
	private String nombre;

	public Leon(int tamano, int peso, String pupilas, String nombre) {
		super(tamano, peso, pupilas);
		this.nombre = nombre;
	}

	public Leon() {
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
		return "Los leones tienen nombre: " + nombre;
}
}
