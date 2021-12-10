package Polimorfismo.Encriptador;

public class AlgoritmoDiferencia implements Algoritmo{
	//Atributos
	private int num = 0;
	
	//Constructores
	public AlgoritmoDiferencia(int param) {
		num = param;
	}
	@Override
	public int encriptar(int param) {
		return num - param;
	}

	@Override
	public int desencriptar(int param) {
		return num - param;
	}
}
