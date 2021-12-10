package Utilidades;

public class MyString {

	public static void main(String[] args) {

		String s1 = new String();
		String s2 = new String("ababaABABA");
		String s3 = "Ejemplo";
		String s4 ="There are many variations of passages of Lorem Ipsum available," 
						+ "but the majority have suffered alteration in some form, by injected humour"
						+" or randomised words which don't look even slightly believable. If you are going "
						+"to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing"
						+"hidden in the middle of text. All the Lorem Ipsum generators on the Internet tend to repeat"
						 +"predefined chunks as necessary, making this the first true generator on the Internet. It uses "
						 + "a dictionary of over 200 Latin words, combined with a handful of model sentence structures, "
						 + "to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free "
						 + "from repetition, injected humour, or non-characteristic words etc.";
		
		System.out.println(s1.compareTo(""));
		System.out.println(s2.concat((s3)));
		System.out.println(s2+s3);
		System.out.println(s1.indexOf('h'));
		System.out.println(s2.trim());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s2.indexOf('b'));
		System.out.println(s2.lastIndexOf('b'));
		System.out.println(s4.length());
		System.out.println(s3.charAt(1));
		System.out.println(s2.replace('A', 'x'));
	}

}
