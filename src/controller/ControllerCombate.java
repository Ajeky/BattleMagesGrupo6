package controller;

import model.Combate;
import model.Personaje;

import datos.DatosElemento;
import model.Habilidad;
import vista.Vista;

public class ControllerCombate {
	
	// Métodos

	static Vista v1 = new Vista();
	
	public static Combate atacar(Combate c1, Habilidad h1, Habilidad h2, int contCombate) {

		int dano = 0;

		c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());

		if (h1.getTipo() == 1 || h1.getTipo() == 2) {

			if (h2.getTipo() == 3) {

				c1.getP2().setMana(c1.getP2().getMana() - h2.getCosteMana());

				dano = h1.getPotencia() - h2.getPotencia();

				if (dano < 0) {
					dano = 0;
				}
			} else {
				dano = h1.getPotencia();
			}
		} else {
			v1.habilidadIncorrecta();
		}
		c1.getP2().setSalud(c1.getP2().getSalud() - dano);
		
		if (c1.getP1().getSalud() <= 0) {
			c1.getP1().setMuerte(true);
			
		} else if (c1.getP2().getSalud() <= 0) {
			c1.getP2().setMuerte(true);
		}

		return c1;
	}

}
