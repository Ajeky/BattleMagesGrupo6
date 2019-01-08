package crud;
import model.Combate;
import model.Personaje;
import datos.DatosCombate;

public class CrudCombate {
	
	static String [][] mapa;

	public static Combate crearCombate(Personaje p1, Personaje p2, int contCombate) {
		DatosCombate DC = new DatosCombate();
		
		if (contCombate == 0) {
			mapa = DC.getBatalla4();
		}
		
		Combate c1 = new Combate(p1, p2, mapa);
		return c1;
	}
	
	public static void borrarCombate(Combate c1) {
		c1 = null;
	}
	
}
