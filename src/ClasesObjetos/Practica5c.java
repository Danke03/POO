package ClasesObjetos;

public class Practica5c {

	public static void main(String[] args) {
		Coche c1 = new Coche(new String("Fiat"), new String("Cinquecento"));
		Coche c2 = new Coche(new String("Renault"), new String("Clio"));
		Garaje g = new Garaje();
		
		System.out.println("Numero de coches atendidos: " + g.getNumCochesAtendidos());
		
		if(!g.aceptarcoche(c1, "Pinchazo en la rueda")) {
			System.out.println("Ya están atendiendo otro coche");
		}
		
		if(!g.aceptarcoche(c1, "Se ha quedado sin gasolina")) {
			System.out.println("ya están atendiendo otro coche y no van a aceptar el nuestro");
		}
		
		g.devolverCoche();
		
		if(!g.aceptarcoche(c2, "Fallo del motor")) {
			System.out.println("Ya están atendiendo otro coche");
		}else
		{//Pasará un tiempo
			g.devolverCoche();
		}
		if (!g.aceptarcoche(c2, "aceite")) {
			System.out.println("Ya están atendiendo a otro coche");
		}else
		{
			g.devolverCoche();
		}
		System.out.println("Numero de coches atendidos: "  + g.getNumCochesAtendidos());
		System.out.println("Coche 1 Averia: " +c1.getImporteAveria() + "aceite: " + c1.getMotor().getAceite());
		System.out.println("Coche 1 Averia: " +c2.getImporteAveria() + "aceite: " + c2.getMotor().getAceite());
		

	}

}
