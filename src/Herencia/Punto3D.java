package Herencia;

public class Punto3D {
	private int x;
	private int y;
	private int z;
	
	public Punto3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Punto3D() {
		this.x = 10;
		this.y = 20;
		this.z = 30;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
		
}