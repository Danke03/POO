package Polimorfismo.interfaces;

public class Avatar {

	public static void main(String[] args) {
		
		Personaje Aang = new Personaje("Aang",1000,990);
		Personaje Roku = new Personaje("Roku",2000,690);
		
		System.out.println("avatar aang");
		Aang.tenerSuperInvencibilidad();
		Aang.tenerSuperVelocidad();
		Aang.lucharConAgua();
		Aang.lucharConAire();
		Aang.lucharConFuego();
		Aang.lucharConTierra();
		Aang.lucharConLava();
		Aang.lucharConSangre();
		Aang.lucharConLaEspada();
		
		System.out.println("");
		System.out.println("avatar Roku");
		Roku.tenerSuperInvencibilidad();
		Roku.tenerSuperVelocidad();
		Roku.lucharConAgua();
		Roku.lucharConAire();
		Roku.lucharConFuego();
		Roku.lucharConTierra();
		Roku.lucharConLava();
		Roku.lucharConSangre();
		Roku.lucharConLaEspada();

	}

}
