package crud;

import model.Habilidad;
import model.Personaje;

public class CrudPersonaje {

	public static Personaje actualizarposicion(Personaje p, int posicion) {
		p.setPosicion(posicion);
		return p;
	}

	public static Personaje actualizarSalud(Personaje p, Habilidad h, int salud) {
		p.setSalud(salud - h.getPotencia());
		return p;
	}

	public static Personaje actualizarMana(Personaje p, Habilidad h, int mana) {
		p.setMana(mana - h.getCosteMana());
		return p;
	}
	
	public static Personaje actualizarMuerte(Personaje p) {
		p.setMuerte(true);
		return p;
	}

}
