package Polimorfismo.Encriptador;

public class Encriptador {
	//Metodos
	public int encriptar(int param1, Algoritmo param2) {
		return param2.encriptar(param1);
	}
	public int desencriptar(int param1, Algoritmo param2) {
		return param2.desencriptar(param1);
	}
}
