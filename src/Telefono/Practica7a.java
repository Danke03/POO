package Telefono;

public class Practica7a {

	public static void main(String[] args) {
		Centralita c = new Centralita();
		
		LLamada l1 = new LLamadaLocal("911234567","919876543",67);
		c.registrarLlamada(l1);
		LLamada l2 = new LLamadaLocal("919876543","911234567",43);
		c.registrarLlamada(l2);
		LLamada f1 = new LLamadaForanea("911234567","939876543",12,3);
		c.registrarLlamada(f1);
		c.registrarLlamada(new LLamadaForanea("939876543","911234567",1,1));
		System.out.println();
		System.out.println("Numero total de llamadas: " + c.getTotalLLamadas());
		System.out.println("Total facturado: " + c.getTotalFacturado());

	}

}
