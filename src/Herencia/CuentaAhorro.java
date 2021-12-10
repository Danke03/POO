package Herencia;

public class CuentaAhorro extends CuentaCorriente {

	//Atributos
	private double interes = 0.0;

	public CuentaAhorro(Titular param1, String param2, double param3, double param4) {
		super(param1, param2, param3);
		interes = param4;
	}
	
	public CuentaAhorro(Titular param1, String param2, double param3) {
		super (param1, param2, 15.3);
		interes = param3;
	}
	public CuentaAhorro(Titular param1, String param2) {
		super(param1, param2,15.3);
		interes = 2.5;
	}
	//Getters
	public double getInteres() {
		return interes;
	}
	//Otros metodos
	public void calcularInteres() {
		setSaldo(getSaldo() + getSaldo() * interes);
	}
}
