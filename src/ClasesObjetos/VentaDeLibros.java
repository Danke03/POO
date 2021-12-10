package ClasesObjetos;

public class VentaDeLibros {
	//mi ejercicio

	public static void main(String[] args) {
		
		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		
		libro2.setisbn("978-84-9794-219-5");
		libro2.setnombre("Asi hablo Saratustra");
		libro2.setprecio(300.00D);
		
		System.out.println("Usted esta comprando 5 copias de: " + libro1.getnombre() + " \nisbn : " + libro1.getisbn() + "\nprecio: " + libro1.getprecio());
		libro1.vender(5);
		System.out.println("El precio de su compra es: " + libro1.getprecio());
		
		System.out.println("");
		
		System.out.println("Usted esta comprando 10 copias de: " + libro2.getnombre() + " \nisbn : " + libro2.getisbn() + "\nprecio: " + libro2.getprecio());
		libro2.vender(10);
		System.out.println("El precio de su compra es: " + libro2.getprecio());
		
	}

}
