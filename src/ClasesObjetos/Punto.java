package ClasesObjetos;

public class Punto{
	
	//atributos
	private int x;
	private int y;
	
	
	//Constructores
	public Punto() {
		this.x=0;
		this.y=0;
	}
	
	public Punto(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	//Getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	//otros metodos
	public void moverPunto(int incrementoX, int incrementoY) {
		this.x = this.x + incrementoX;
		this.y= this.y + incrementoY;
	}
}
