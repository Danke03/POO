package Telefono;

public class LLamadaLocal extends LLamada{
	//Atributos
	private double precio = 15;

	//Constructores
	public LLamadaLocal(String param1, String param2, double param3) {
		super(param1, param2, param3);
	}

	//Metodos
	@Override
	public double calcularPrecio() {
		return getDuracion() * precio;
	}
	
	public String toString() {
		return "LLamada local #" + getNumOrigen() + "-#" + getNumDestino() + "-" + getDuracion() + "segs";
	}
}
