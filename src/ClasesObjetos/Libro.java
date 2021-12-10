package ClasesObjetos;

public class Libro {
	//mi ejercicio

	//atributos
	private String isbn;
	private String nombre;
	private double precio;
	
	//constructores
	public Libro() {
		this.isbn = "000-000-00";
		this.nombre = "El retrato de Dorian Grey";
		this.precio = 250.00D;
	}
	public Libro (String isbn, String nombre, double precio) {
		this.isbn = isbn;
		this.nombre = nombre;
		this.precio = precio;
	}
	
	//getters
	public String getisbn() {
		return isbn;
	}
	public String getnombre() {
		return nombre;
	}
	public double getprecio() {
		return precio;
	}
	
	//setters
	 public void setisbn(String isbn) {
		 this.isbn = isbn;
	 }
	 public void setnombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public void setprecio(double precio) {
		 this.precio = precio;
	 }
	 
	 //metodo vender
	 public void vender(int cantidadA) {
		 this.precio= this.precio * cantidadA;
	 }
}