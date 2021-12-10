package ClasesObjetos;

public class Profesor {
public void ponerNotas(Alumno param) {
	param.getMateria1().setCalificacion(Math.random() * 10);
	param.getMateria2().setCalificacion(Math.random() * 10);
	param.getMateria3().setCalificacion(Math.random() * 10);
	}
	public double calcularMedia(Alumno param) {
		double nota1 = param.getMateria1().getCalificacion();
		double nota2 = param.getMateria2().getCalificacion();
		double nota3 = param.getMateria3().getCalificacion();
		return (nota1 + nota2 + nota3)/3;	
		}
}
