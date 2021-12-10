package Zoo;

public class Canino extends Animal{

	private String canino;

	public Canino() {
		super();
	}

	public Canino(int tamano, int peso, String canino) {
		super(tamano, peso);
		this.canino = canino;
	}

	public String getCanino() {
		return canino;
	}

	public void setCanino(String canino) {
		this.canino = canino;
	}
	
	public String toString() {
		return " los calinos tienen: " + canino;
	}
}
