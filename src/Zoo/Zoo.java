package Zoo;

public class Zoo {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal(50, 50);
		
		Felino felino1 = new Felino(20, 120, "Pupilas alargadas");
		Canino canino1 = new Canino(30, 130, "4 caninos");
		
		Gato gato1 = new Gato(2, 60, "Pupilas alargadas", "Tomas");
		Perro perro1 = new Perro(5, 90, "3 caninos", "Snoopy");
		Leon leon1 = new Leon(50, 160, "pupilas alargadas", "simba");
		Lobo lobo1 = new Lobo(20, 120, "4 caninos", "lobito");
		
		Animal animal2 = new Felino(20, 120, "Pupilas alargadas");
		Canino canino2 = new Lobo(20, 120, "4 caninos", "lobito");
		
		canino2 = (Canino)animal1;
		
		System.out.println(animal1.toString());
		System.out.println(felino1.toString());
		System.out.println(canino1.toString());
		
		System.out.println(gato1.toString());
		System.out.println(perro1.toString());
		System.out.println(leon1.toString());
		System.out.println(lobo1.toString());
		
	}

}
