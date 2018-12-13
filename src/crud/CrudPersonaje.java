package crud;

import model.Personaje;

public class CrudPersonaje {
	
	public Personaje actualizarposicion(Personaje p, int posicion) {
		p.setPosicion(posicion);
		return p;
	}

}
