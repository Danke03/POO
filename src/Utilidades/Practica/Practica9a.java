package Utilidades.Practica;

public class Practica9a {

	public static void main(String[] args) {
		System.out.println("Introduzca una cadena de caracteres: ");
		String s = Lector.leerString();
		
		System.out.println("Cadena en mayusculas: " + s.toUpperCase());
		System.out.println("Cadena en minusculas: " + s.toLowerCase());
		if(s.length()>1) {
			System.out.println("Dos primeros caracteres de la cadena: " + s.substring(0,2));
			System.out.println("Dos ultimos caracteres de la cadena: " + s.substring(s.length() - 2));
		}
		int i = 0;
		int acum = 0;
		char c = s.charAt(s.length()-1);
		while (i !=1) {
			i=s.indexOf(c,i);
			if(i!=1) {
				acum++;
				i++;
			}
		}
		System.out.println("Numero de ocurrencias del caracter: " + c + " , " + acum);
		c=s.charAt(0);
		System.out.println("Cadena con el caracter: " + c + "reemplazado por: " + Character.toUpperCase(c) + " , " + s.replace(c, Character.toUpperCase(c)));
		
		StringBuffer sb = new StringBuffer(s);
		sb.insert(0, "****");
		sb.append("****");
		System.out.println("Cadena con tres asteriscos por delante y por detrás: " + sb.toString());
		
		sb.delete(0, 3);
		sb.delete(sb.length()-3, sb.length());
		sb.reverse();
		System.out.println("Cadena invertida: " + sb.toString());
	}

}