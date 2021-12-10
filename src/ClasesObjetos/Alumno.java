package ClasesObjetos;

public class Alumno {
 //Atributos
	private Materia materia1 = null;
	private Materia materia2 = null;
	private Materia materia3 = null;
	
	//Constructores
	public Alumno(Materia param1, Materia param2, Materia param3) {
		materia1 = param1;
		materia2 = param2;
		materia3 = param3;
	}
	public Alumno(int param1, int param2, int param3) {
		materia1 = new Materia(param1);
		materia2 = new Materia(param2);
		materia3 = new Materia(param3);
	}
	//Getters
	public Materia getMateria1() {
		return materia1;
	}
	public Materia getMateria2() {
		return materia2;
	}
	public Materia getMateria3() {
		return materia3;
	}
}
