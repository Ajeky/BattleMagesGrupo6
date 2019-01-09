package model;

import java.util.Arrays;

public class Combate {
	private Personaje p1;
	private Personaje p2;
	private String[][] campoBatalla;
	private static int contCombate = 0;

	public Combate(Personaje p1, Personaje p2, String[][] campoBatalla) {
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.campoBatalla = campoBatalla;
	}

	public Combate() {
		super();
	}

	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}

	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}

	public String[][] getCampoBatalla() {
		return campoBatalla;
	}

	public void setCampoBatalla(String[][] campoBatalla) {
		this.campoBatalla = campoBatalla;
	}

	public static int getContCombate() {
		return contCombate;
	}

	public static void setContCombate(int contCombate) {
		Combate.contCombate = contCombate;
	}

	@Override
	public String toString() {
		return "Combate [p1=" + p1 + ", p2=" + p2 + ", campoBatalla=" + Arrays.toString(campoBatalla) + "]";
	}

}
