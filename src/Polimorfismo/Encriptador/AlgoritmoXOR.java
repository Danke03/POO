package Polimorfismo.Encriptador;

public class AlgoritmoXOR implements Algoritmo{
	//Atributos
	private int num = 0;

	//Constructores
	public AlgoritmoXOR(int param) {
		num = param;
	}

	@Override
	public int encriptar(int param) {
		return param ^ num;
	}

	@Override
	public int desencriptar(int param) {
		return param ^ num;
	}
	

	

}
