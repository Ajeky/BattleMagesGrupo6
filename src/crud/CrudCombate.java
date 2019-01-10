package crud;

import model.Combate;
import model.Personaje;
import datos.Datos;

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

	public static Combate eliminarCombate(Combate c1) {

		c1 = null;

		return c1;
	}

	public static Combate actualizarCombate(Combate c, int contCombate) {

		// Personaje p1 = new Personaje();
		// Personaje p2 = new Personaje();

		// Personaje player1 = new Personaje(p1.getE(), p1.getNombre(), p1.getSalud(),
		// p1.getMana(), p1.getPosicion());
		// Personaje player2 = new Personaje(p2.getE(), p2.getNombre(), p2.getSalud(),
		// p2.getMana(), p2.getPosicion());

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
