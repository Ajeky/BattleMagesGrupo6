package crud;

import model.Combate;
import model.Personaje;
import vista.Vista;
import datos.Datos;
import model.Habilidad;
import controller.ControllerCombate;

public class CrudCombate {

	static String[][] mapa;

	public static Combate crearCombate(Personaje p1, Personaje p2, Datos bd, int contCombate) {
		Combate c = new Combate();
		switch (contCombate) {
		case 0:
			Combate c1 = new Combate(p1, p2, bd.getBatalla1());
			c1.getCampoBatalla()[11][c1.getP1().getPosicion()] = "******";
			c1.getCampoBatalla()[12][c1.getP1().getPosicion()] = "|    |";
			c1.getCampoBatalla()[13][c1.getP1().getPosicion()] = "******";

			c1.getCampoBatalla()[11][c1.getP2().getPosicion()] = "******";
			c1.getCampoBatalla()[12][c1.getP2().getPosicion()] = "|    |";
			c1.getCampoBatalla()[13][c1.getP2().getPosicion()] = "******";
			c = c1;
			break;
		case 1:
			Combate c2 = new Combate(p1, p2, bd.getBatalla2());
			c2.getCampoBatalla()[9][c2.getP1().getPosicion()] = "******";
			c2.getCampoBatalla()[10][c2.getP1().getPosicion()] = "|    |";
			c2.getCampoBatalla()[11][c2.getP1().getPosicion()] = "******";

			c2.getCampoBatalla()[9][c2.getP2().getPosicion()] = "******";
			c2.getCampoBatalla()[10][c2.getP2().getPosicion()] = "|    |";
			c2.getCampoBatalla()[11][c2.getP2().getPosicion()] = "******";
			c = c2;
			break;
		case 2:
			Combate c3 = new Combate(p1, p2, bd.getBatalla3());
			c3.getCampoBatalla()[6][c3.getP1().getPosicion()] = "******";
			c3.getCampoBatalla()[7][c3.getP1().getPosicion()] = "|    |";
			c3.getCampoBatalla()[8][c3.getP1().getPosicion()] = "******";

			c3.getCampoBatalla()[6][c3.getP2().getPosicion()] = "******";
			c3.getCampoBatalla()[7][c3.getP2().getPosicion()] = "|    |";
			c3.getCampoBatalla()[8][c3.getP2().getPosicion()] = "******";
			c = c3;
			break;

		case 3:
			Combate c4 = new Combate(p1, p2, bd.getBatalla4());
			c4.getCampoBatalla()[4][c4.getP1().getPosicion()] = "******";
			c4.getCampoBatalla()[5][c4.getP1().getPosicion()] = "|    |";
			c4.getCampoBatalla()[6][c4.getP1().getPosicion()] = "******";

			c4.getCampoBatalla()[4][c4.getP2().getPosicion()] = "******";
			c4.getCampoBatalla()[5][c4.getP2().getPosicion()] = "|    |";
			c4.getCampoBatalla()[6][c4.getP2().getPosicion()] = "******";
			c = c4;
			break;
		default:
			break;
		}
		return c;

	}

	public static void borrarCombate(Combate c1) {
		c1 = null;
	}

	public static Combate actualizarCombate(Combate c, int contCombate, Habilidad h1, Habilidad h2) {

		int danoP1 = 0, danoP2 = 0;

		if (h1.getTipo() == 4) {
			c.getP1().setSalud(c.getP1().getSalud() + ControllerCombate.curarP1(c, h1));
		}

		if (h2.getTipo() == 4) {
			c.getP2().setSalud(c.getP2().getSalud() + ControllerCombate.curarP2(c, h2));
		}

		if (h1.getTipo() == 3) {
			if (h2.getTipo() == 1 || h2.getTipo() == 2) {
				// dañoP1 representa el daño QUE SE LE VA A HACER AL jugador 1
				danoP1 = ControllerCombate.atacarP2(c, h2) - ControllerCombate.defenderP1(c, h1);
				if (danoP1 < 0) {
					danoP1 = 0;
				}
			} else {
				ControllerCombate.defenderP1(c, h1);
			}
		}

		if (h2.getTipo() == 3) {
			if (h1.getTipo() == 1 || h1.getTipo() == 2) {
				// dañoP2 representa el daño QUE SE LE VA A HACER AL jugador 2
				danoP2 = ControllerCombate.atacarP1(c, h1) - ControllerCombate.defenderP2(c, h2);
				if (danoP2 < 0) {
					danoP2 = 0;
				}
			} else {
				ControllerCombate.defenderP2(c, h2);
			}
		}

		if (h1.getTipo() == 5) {
			c = ControllerCombate.moverp1(c, h1.getPotencia());
		}

		if (h2.getTipo() == 5) {
			c = ControllerCombate.moverp2(c, h2.getPotencia());
		}

		if (h1.getTipo() == 1 || h1.getTipo() == 2) {
			if (h2.getTipo() == 3) {
				// Lo que habría que hacer en este caso ya está hecho arriba
			} else {
				// dañoP2 representa el daño QUE SE LE VA A HACER AL jugador 2
				danoP2 = ControllerCombate.atacarP1(c, h1);
			}
		}

		if (h2.getTipo() == 1 || h2.getTipo() == 2) {
			if (h1.getTipo() == 3) {
				// Lo que habría que hacer en este caso ya está hecho arriba
			} else {
				// dañoP1 representa el daño QUE SE LE VA A HACER AL jugador 1
				danoP1 = ControllerCombate.atacarP2(c, h2);
			}
		}

		if (h1.getTipo() == 6) {
			c = ControllerCombate.descansarP1(c, h1);
		}

		if (h2.getTipo() == 6) {
			c = ControllerCombate.descansarP2(c, h2);
		}

		ControllerCombate.danarP1(c, danoP1);

		ControllerCombate.danarP2(c, danoP2);

		if (c.getP1().getSalud() > 800) {
			c.getP1().setSalud(800);
		}

		if (c.getP2().getSalud() > 200) {
			c.getP2().setSalud(200);
		}

		c.getP1().setMana(c.getP1().getMana() + 20);
		if (c.getP1().getMana() > 100) {
			c.getP1().setMana(100);
		}

		c.getP2().setMana(c.getP2().getMana() + 20);
		if (c.getP2().getMana() > 100) {
			c.getP2().setMana(100);
		}

		if (h1.getTipo() == 1 || h1.getTipo() == 2 || h1.getTipo() == 3) {
			Vista.imprimirHabilidad(h1);
		}

		if (h2.getTipo() == 1 || h2.getTipo() == 2 || h2.getTipo() == 3) {
			Vista.imprimirHabilidad(h2);
		}

		return c;
	}

}