package ClasesObjetos;

public class Materia {
//Atributos
	public int identificador;
	public double calificacion;
	
	//constructor
	public Materia(int param) {
		identificador = param;
	}
	//Getters
	public int getIdentificador() {
		return identificador;
	}
	public double getCalificacion() {
		return calificacion;
	}
	
	//Setters
	public void setCalificacion(double param) {
		calificacion = param;
	}
}
