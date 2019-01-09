package controller;

import model.Combate;
import model.Personaje;
import model.Habilidad;
import vista.Vista;

public class ControllerCombate {

	// Métodos

	static Vista v1 = new Vista();

	public static Combate usarHabilidad(Combate c1, Habilidad h1, Habilidad h2, int contCombate) {

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

	public static Personaje moverp1(Personaje p1, int direccion) {

		if (direccion == 1) {
			if ((p1.getPosicion() - p1.getPosicion()) != 1) {
				p1.setPosicion(p1.getPosicion() + 1);
			} else {
				// vista no se puede realizar esa orden
			}
		} else if (direccion == 0) {
			if (p1.getPosicion() > 1) {
				p1.setPosicion(p1.getPosicion() - 1);
			}

		}

		return p1;
	}

}
