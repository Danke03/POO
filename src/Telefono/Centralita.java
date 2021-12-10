package Telefono;

public class Centralita {
	
	//Atributos
	private int cont = 0;
	private double acum = 0;
	
	//Getters
	public int getTotalLLamadas() {
		return cont;
	}
	public double getTotalFacturado() {
		return acum;
	}
	
	//Metodos
	public void registrarLlamada(LLamada param) {
		System.out.println(param);
		cont++;
		acum += param.calcularPrecio();
	}
	

}
