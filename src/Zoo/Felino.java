package Zoo;

public class Felino extends Animal{

	private String Pupilas;

	public Felino() {
		super();
	}

	public Felino(int tamano, int peso ,String pupilas) {
		super(tamano, peso);
		Pupilas = pupilas;
	}

	public String getPupilas() {
		return Pupilas;
	}

	public void setPupilas(String pupilas) {
		Pupilas = pupilas;
	}
	@Override
	public String toString() {
		return "y los felinos tienen: " + Pupilas;
	}
}
