package Herencia;

public class Punto3DHerencia extends Punto2D{

	private int z;

	public Punto3DHerencia() {
		super();
		this.z = 30;
	}
	
	public Punto3DHerencia(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
}
	
	

