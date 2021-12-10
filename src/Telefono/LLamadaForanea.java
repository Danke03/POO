package Telefono;

public class LLamadaForanea extends LLamada{
	private double precio1 = 20;
	private double precio2 = 25;
	private double precio3 = 30;
	private int franja = 0;

	public LLamadaForanea(String param1, String param2, int param3, int param4) {
		super(param1, param2, param3);
		franja = param4;
	}

	@Override
	public double calcularPrecio() {
		if(franja==1)
			return getDuracion()*precio1;
		else if (franja==2)
			return getDuracion() * precio2;
		else
			return getDuracion() * precio3;
	}
	public String toString() {
		return "LLamada local #" + getNumOrigen() + "-#" + getNumDestino() + "-" + getDuracion() + "segs - #" + franja;
	}

}
