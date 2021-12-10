package Polimorfismo.Encriptador;

public class AlgoritmoMultiplicacion implements Algoritmo{
	//Atributos
	private int num = 0;

	public AlgoritmoMultiplicacion(int param) {
		num = param;
	}
//Metodos
	@Override
	public int encriptar(int param) {
		return param * num;
	}

	@Override
	public int desencriptar(int param) {
		return param/num;
	}
}
