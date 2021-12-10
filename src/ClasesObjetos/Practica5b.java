package ClasesObjetos;

public class Practica5b {

	public static void main(String[] args) {
		Materia español = new Materia(1);
		Materia matematicas = new Materia(2);
		Materia historia = new Materia(3);
		Alumno a = new Alumno(español,matematicas,historia);
		
		Profesor p = new Profesor();
		p.ponerNotas(a);
		System.out.println("El promedio del alumno es: " + p.calcularMedia(a));
	}

}
