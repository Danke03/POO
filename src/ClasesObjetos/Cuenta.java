package ClasesObjetos;

public class Cuenta {
//Atributos
	private double saldo;
	private String titular;
	
	//Constructores
	public Cuenta() {
		this.saldo = 0.00D;
		this.titular = "Jose Trinidad Garcia";
		
	}
	
	public Cuenta(double saldo, String titular) {
		this.saldo = saldo;
		this.titular = titular;
	}
	
	//Getters
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	//Setters
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void retirar (double retiro) {
		saldo -= retiro;
	}
	
	public void ingresar (double ingreso) {
		saldo += ingreso;
	}
}
