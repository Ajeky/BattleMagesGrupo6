package controller;

import model.Combate;
import model.Personaje;
import model.Habilidad;
import vista.Vista;

public class ControllerCombate {
	// Métodos

	public static int atacarP1(Combate c1, Habilidad h1) {
		c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());
		return h1.getPotencia();
	}

	public static int atacarP2(Combate c1, Habilidad h1) {
		c1.getP2().setMana(c1.getP2().getMana() - h1.getCosteMana());
		return h1.getPotencia();
	}

	public static int defenderP1(Combate c1, Habilidad h1) {
		c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());
		return h1.getPotencia();
	}

	public static int defenderP2(Combate c1, Habilidad h1) {
		c1.getP2().setMana(c1.getP2().getMana() - h1.getCosteMana());
		return h1.getPotencia();
	}

	public static int curarP1(Combate c1, Habilidad h1) {
		c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());
		c1.getP1().setContCurar(c1.getP1().getContCurar() + 1);
		return h1.getPotencia();
	}

	public static int curarP2(Combate c1, Habilidad h1) {
		c1.getP2().setMana(c1.getP2().getMana() - h1.getCosteMana());
		c1.getP2().setContCurar(c1.getP2().getContCurar() + 1);
		return h1.getPotencia();
	}

	public static Combate descansarP1(Combate c1, Habilidad h1) {
		c1.getP1().setMana(c1.getP1().getMana() + h1.getPotencia());
		return c1;
	}

	public static Combate descansarP2(Combate c1, Habilidad h1) {
		c1.getP2().setMana(c1.getP2().getMana() + h1.getPotencia());
		return c1;
	}

	public static Combate danarP1(Combate c1, int dano) {
		c1.getP1().setSalud(c1.getP1().getSalud() - dano);
		return c1;
	}

	public static Combate danarP2(Combate c1, int dano) {
		c1.getP2().setSalud(c1.getP2().getSalud() - dano);
		return c1;
	}

	public static Combate moverp1(Combate c1, int direccion) {

		if (direccion == 1) {
			if ((c1.getP2().getPosicion() - c1.getP1().getPosicion()) > 1) {
				c1.getP1().setPosicion(c1.getP1().getPosicion() + 1);
			} else {
				Vista.movimientoPers();
			}
		} else if (direccion == 0) {
			if (c1.getP1().getPosicion() > 1) {
				c1.getP1().setPosicion(c1.getP1().getPosicion() - 1);
			} else {
				Vista.movimientoPers();
			}

		}

		return c1;
	}

	public static Combate moverp2(Combate c1, int direccion) {

		if (direccion == 0) {
			if ((c1.getP2().getPosicion() - c1.getP1().getPosicion()) > 1) {
				c1.getP2().setPosicion(c1.getP2().getPosicion() - 1);
			} else {
				Vista.movimientoPers();
			}
		}

		else if (direccion == 1) {
			if (c1.getP2().getPosicion() < c1.getCampoBatalla()[0].length - 2) {
				c1.getP2().setPosicion(c1.getP2().getPosicion() + 1);
			} else {
				Vista.movimientoPers();
			}
		}

		return c1;
	}

	public static void mostrarVidaP1(Combate c1) {

		if (c1.getP1().isMuerte()) {

			Vista.personajeMuerto();
		}

		if (c1.getP1().getSalud() > 640 && c1.getP1().getSalud() <= 800) {

			Vista.barraVida100();

		} else if (c1.getP1().getSalud() > 480 && c1.getP1().getSalud() <= 640) {

			Vista.barraVida80();

		} else if (c1.getP1().getSalud() > 320 && c1.getP1().getSalud() <= 480) {

			Vista.barraVida60();

		} else if (c1.getP1().getSalud() > 160 && c1.getP1().getSalud() <= 320) {

			Vista.barraVida40();

		} else if (c1.getP1().getSalud() > 80 && c1.getP1().getSalud() <= 160) {

			Vista.barraVida20();

		} else if (c1.getP1().getSalud() > 0 && c1.getP1().getSalud() <= 80) {

			Vista.barraVida10();

		}
	}

	public static void mostrarVidaP2(Combate c1) {

		if (c1.getP2().isMuerte()) {

			Vista.personajeMuerto();
		}

		if (c1.getP2().getSalud() > 160 && c1.getP2().getSalud() <= 200) {

			Vista.barraVida100();

		} else if (c1.getP2().getSalud() > 120 && c1.getP2().getSalud() <= 160) {

			Vista.barraVida80();

		} else if (c1.getP2().getSalud() > 80 && c1.getP2().getSalud() <= 120) {

			Vista.barraVida60();

		} else if (c1.getP2().getSalud() > 40 && c1.getP2().getSalud() <= 80) {

			Vista.barraVida40();

		} else if (c1.getP2().getSalud() > 20 && c1.getP2().getSalud() <= 40) {

			Vista.barraVida20();

		} else if (c1.getP2().getSalud() > 0 && c1.getP2().getSalud() <= 20) {

			Vista.barraVida10();

		}
	}

	public static void mostrarManaP1(Combate c1) {

		if (c1.getP1().getMana() > 80 && c1.getP1().getMana() <= 100) {

			Vista.barraMana100();

		} else if (c1.getP1().getMana() > 60 && c1.getP1().getMana() <= 80) {

			Vista.barraMana80();

		} else if (c1.getP1().getMana() > 40 && c1.getP1().getMana() <= 60) {

			Vista.barraMana60();

		} else if (c1.getP1().getMana() > 20 && c1.getP1().getMana() <= 40) {

			Vista.barraMana40();

		} else if (c1.getP1().getMana() > 10 && c1.getP1().getMana() <= 20) {

			Vista.barraMana20();

		} else if (c1.getP1().getMana() > 0 && c1.getP1().getMana() <= 10) {

			Vista.barraMana10();

		}
	}

	public static void mostrarManaP2(Combate c1) {

		if (c1.getP2().getMana() > 80 && c1.getP2().getMana() <= 100) {

			Vista.barraMana100();

		} else if (c1.getP2().getMana() > 60 && c1.getP2().getMana() <= 80) {

			Vista.barraMana80();

		} else if (c1.getP2().getMana() > 40 && c1.getP2().getMana() <= 60) {

			Vista.barraMana60();

		} else if (c1.getP2().getMana() > 20 && c1.getP2().getMana() <= 40) {

			Vista.barraMana40();

		} else if (c1.getP2().getMana() > 10 && c1.getP2().getMana() <= 20) {

			Vista.barraMana20();

		} else if (c1.getP2().getMana() > 0 && c1.getP2().getMana() <= 10) {

			Vista.barraMana10();

		}
	}

	public static void comprobarCura(Personaje p1) {
		if (p1.getContCurar() > 2) {
			Vista.errorCura();
		}
	}

	public static Combate actualizarMapa(Combate c, int contCombate) {
		int posJ1 = c.getP1().getPosicion();
		int posJ2 = c.getP2().getPosicion();
		int xD = 1;

		switch (contCombate) {

		case 0:

			for (int i = 1; i < c.getCampoBatalla()[xD].length - 1; i++) {
				c.getCampoBatalla()[11][i] = "      ";
				c.getCampoBatalla()[12][i] = "      ";
				c.getCampoBatalla()[13][i] = "      ";
			}
			c.getCampoBatalla()[11][posJ1] = "******";
			c.getCampoBatalla()[12][posJ1] = "|    |";
			c.getCampoBatalla()[13][posJ1] = "******";

			c.getCampoBatalla()[11][posJ2] = "******";
			c.getCampoBatalla()[12][posJ2] = "|    |";
			c.getCampoBatalla()[13][posJ2] = "******";
			break;
		case 1:

			for (int i = 1; i < c.getCampoBatalla()[xD].length - 1; i++) {
				c.getCampoBatalla()[9][i] = "      ";
				c.getCampoBatalla()[10][i] = "      ";
				c.getCampoBatalla()[11][i] = "      ";
			}
			c.getCampoBatalla()[9][posJ1] = "******";
			c.getCampoBatalla()[10][posJ1] = "|    |";
			c.getCampoBatalla()[11][posJ1] = "******";

			c.getCampoBatalla()[9][posJ2] = "******";
			c.getCampoBatalla()[10][posJ2] = "|    |";
			c.getCampoBatalla()[11][posJ2] = "******";
			break;
		case 2:

			for (int i = 1; i < c.getCampoBatalla()[xD].length - 1; i++) {
				c.getCampoBatalla()[6][i] = "      ";
				c.getCampoBatalla()[7][i] = "      ";
				c.getCampoBatalla()[8][i] = "      ";
			}
			c.getCampoBatalla()[6][posJ1] = "******";
			c.getCampoBatalla()[7][posJ1] = "|    |";
			c.getCampoBatalla()[8][posJ1] = "******";

			c.getCampoBatalla()[6][posJ2] = "******";
			c.getCampoBatalla()[7][posJ2] = "|    |";
			c.getCampoBatalla()[8][posJ2] = "******";
			break;
		case 3:

			for (int i = 1; i < c.getCampoBatalla()[xD].length - 1; i++) {
				c.getCampoBatalla()[4][i] = "      ";
				c.getCampoBatalla()[5][i] = "      ";
				c.getCampoBatalla()[6][i] = "      ";
			}
			c.getCampoBatalla()[4][posJ1] = "******";
			c.getCampoBatalla()[5][posJ1] = "|    |";
			c.getCampoBatalla()[6][posJ1] = "******";

			c.getCampoBatalla()[4][posJ2] = "******";
			c.getCampoBatalla()[5][posJ2] = "|    |";
			c.getCampoBatalla()[6][posJ2] = "******";
			break;

		default:
			break;
		}

		return c;
	}

}
