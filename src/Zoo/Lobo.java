package Zoo;

public class Lobo extends Canino{
	private String nombre;

	public Lobo(int tamano, int peso, String caninos, String nombre) {
		super(tamano, peso, caninos);
		this.nombre = nombre;
	}

	public Lobo() {
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
		return "Los lobos tienen nombre: " + nombre;
}
}
