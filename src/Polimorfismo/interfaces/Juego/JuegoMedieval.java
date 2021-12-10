package Polimorfismo.interfaces.Juego;

import Polimorfismo.interfaces.Criaturas.Elfo;
import Polimorfismo.interfaces.Criaturas.Enano;
import Polimorfismo.interfaces.Criaturas.Troll;
import Polimorfismo.interfaces.Criaturas.Utils.Constantes;

public class JuegoMedieval {

	public static void main(String[] args) {
		
		Troll a = new Troll("Trolito ", Constantes.FUERZA_TROLL);
		Enano b = new Enano("Enanito ", Constantes.FUERZA_ENANO);
		Elfo c = new Elfo("Logolas ", Constantes.FUERZA_ELFO);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

	}

}
