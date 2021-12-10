package Polimorfismo.Encriptador;

public class Practica7b {

	public static void main(String[] args) {
		int codigo = 12345;
		System.out.println("Codigo: " + codigo);
		Encriptador e = new Encriptador();
		int aux = 0;
		
		Algoritmo a1 = new AlgoritmoMultiplicacion(10);
		aux = e.encriptar(codigo, a1);
		System.out.println("Encriptado: " + aux);
		System.out.println("Desencriptado: " + e.desencriptar(aux, a1));
		
		Algoritmo a2 = new AlgoritmoDiferencia(2147483467);
		aux = e.encriptar(codigo, a2);
		System.out.println("Encriptado: " + aux);
		System.out.println("Desencriptado: " + e.desencriptar(aux, a2));
		
		Algoritmo a3 = new AlgoritmoXOR(83067);
		aux = e.encriptar(codigo, a3);
		System.out.println("Encriptado: " + aux);
		System.out.println("Desencriptado: " + e.desencriptar(aux, a3));

	}

}
