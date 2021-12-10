package Telefono;

public abstract class LLamada {
	
	//Atributos
	private String numOrigen = null;
	private String numDestino = null;
	private double duracion = 0;
	
	//Constructores
	public LLamada(String param1, String param2, double param3) {
		numOrigen = param1;
		numDestino = param2;
		duracion = param3;
	}

	//getters
	
	public String getNumOrigen() {
		return numOrigen;
	}

	public String getNumDestino() {
		return numDestino;
	}

	public double getDuracion() {
		return duracion;
	}
	
	//Metodos
	public abstract double calcularPrecio() ;
	}
