package vista;

import model.Habilidad;
import model.Personaje;

public class Vista {
	Habilidad habilidad1;
	Personaje personaje1;
	Personaje personaje2;
	
//	Falta public Integer MostrarDistanciaComabte(){}
	public String MostrarNombreHabilidades() {
		return habilidad1.getNombre();
	}
	
	public Integer MostrarVidaPersonaje() {
		return personaje1.getSalud();
	}
	
	public Integer MostrarManaPersonaje() {
		return personaje1.getMana();
	}
	
	public Integer MostrarVidaEnemigo() {
		return personaje2.getSalud();
	}
	
	public Integer MostrarManaEnemigo() {
		return personaje2.getMana();
	}
}
