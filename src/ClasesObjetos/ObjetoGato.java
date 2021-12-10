package ClasesObjetos;

public class ObjetoGato {
	
	public static void main(String[] args) {
		Gato gato1 = new Gato();
		Gato gato2 = new Gato();
		Gato gato3 = new Gato();
		Gato gato4 = new Gato();
		Gato gato5 = new Gato();
		
		gato1.setNombre("Tom");
		gato2.setNombre("Benito");
		gato3.setNombre("Silvestre");
		gato4.setNombre("Pelusa");
		gato5.setNombre("Gato con botas");
		
		System.out.println("Mi primer gato se llama: " + gato1.getNombre());
		System.out.println("Mi segundo gato se llama: " + gato2.getNombre());
		System.out.println("Mi tercer gato se llama: " + gato3.getNombre());
		System.out.println("Mi cuarto gato se llama: " + gato4.getNombre());
		System.out.println("Mi quinto gato se llama: " + gato5.getNombre());
	}
}
