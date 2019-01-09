package crud;

import model.Habilidad;
import model.Personaje;

public class CrudPersonaje {
	
	public Personaje actualizarposicion(Personaje p, int posicion) {
		p.setPosicion(posicion);
		return p;
	}
	
	public Personaje actualizarSalud(Personaje p, Habilidad h, int salud) {
		p.setSalud(salud - h.getPotencia());
		return p;
	}
	
	public Personaje actualizarMana(Personaje p, Habilidad h, int mana) {
		p.setMana(mana - h.getCosteMana());
		return p;
	}
	
	
}
 