package Zoo;

public class Perro extends Canino{
	private String nombre;

	public Perro(int tamano, int peso, String caninos, String nombre) {
		super(tamano, peso, caninos);
		this.nombre = nombre;
	}

	public Perro() {
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
		return "Los perros tienen nombre: " + nombre;
}
}
