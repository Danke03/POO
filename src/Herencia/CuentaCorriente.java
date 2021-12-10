package Herencia;

public class CuentaCorriente {

	//atributos
	private Titular titular = null;
	private String num = null;
	private double saldo = 0;
	
	//Constructores
	public CuentaCorriente(Titular param1, String param2, double param3) {
		titular = param1;
		num = param2;
		saldo = param3;
		
	}
	public CuentaCorriente(Titular param1, String param2){
		this(param1, param2, 15.3);
	}

	public Titular getTitular() {
		return titular;
	}

	public String getNum() {
		return num;
	}

	public double getSaldo() {
		return saldo;
	}

	//setter
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//Otros metodos
	public void ingreso(double param) {
		saldo +=param;
	}
	public void reintegro(double param) {
		saldo -=param;
	}
	public String toString() {
		return num + " ; " + saldo;
	}
	public boolean equals(Object o) {
		if (num.compareTo(((CuentaCorriente)o).getNum())==0)
		 return true;
		else
			return false;
	}
}
