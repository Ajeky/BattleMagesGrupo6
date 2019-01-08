package crud;
import model.Combate;
import model.Personaje;
import datos.DatosCombate;

public class CrudCombate {
	
	static String [][] mapa;

	public static Combate crearCombate(Personaje p1, Personaje p2, int contCombate) {
		
		if (contCombate == 0) {
			mapa = DatosCombate.batalla4;
		}
		
		Combate c1 = new Combate(p1, p2, mapa);
		return c1;
	}
	
	public static void borrarCombate(Combate c1) {
		c1 = null;
	}

	public static Combate eliminarCombate(Combate c1) {
		
		c1 = null;
		
		return c1;
	}
	
	public static Combate actualizarCombate(int contCombate) {
		
		Personaje p1 = new Personaje();
		Personaje p2 = new Personaje();
		
		Personaje player1 = new Personaje(p1.getE(), p1.getNombre(), p1.getSalud(), p1.getMana(), p1.getPosicion());
		Personaje player2 = new Personaje(p2.getE(), p2.getNombre(), p2.getSalud(), p2.getMana(), p2.getPosicion());
		
		if(contCombate == 1) {
			
			mapa = DatosCombate.batalla1;
		}
		
		
		Combate updCombat = new Combate(player1, player2, mapa);
		
		return updCombat;
	}
	
}
