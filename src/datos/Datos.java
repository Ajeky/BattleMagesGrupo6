
package datos;

import model.Elemento;
import model.Habilidad;

public class Datos {

	private static String[][] batalla4 = {
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "***   " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " ***  " },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " **** " },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " *****" },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " **** " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", " ***  " },
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "***   " } };

	private static String[][] batalla3 = {
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "***   " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " ***  ", },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " **** " },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " **** " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " ***  " },
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "***   " } };
	private static String[][] batalla2 = {
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "******", "******", "******", "******", "******",
					"***   " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" ***  ", },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" **** " },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" *****" },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" **** " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					" ***  " },
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "******", "******", "******", "******", "******",
					"***   " } };
	private static String[][] batalla1 = {
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "***   " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " ***  ", },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " **** " },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ "***** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " *****" },
			{ " **** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " **** " },
			{ "  *** ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ", "      ",
					"      ", "      ", "      ", "      ", " ***  " },
			{ "   ***", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "******", "******", "******", "******", "******", "******",
					"******", "******", "******", "******", "***   " } };

	private static Habilidad[] HabilidadesFuego = { new Habilidad("Bola de Fuego", 25, 20, 1),
			new Habilidad("Fogonazo", 60, 50, 2), new Habilidad("Barrera napalm", 40, 20, 3),
			new Habilidad("Curar", 30, 40, 4)};
	private static Habilidad[] HabilidadesTierra = { new Habilidad("Roca afilada", 17, 15, 1),
			new Habilidad("Avalancha", 60, 80, 2), new Habilidad("Muro Sísmico", 60, 25, 3),
			new Habilidad("Curar", 30, 60, 4)};
	private static Habilidad[] HabilidadesHielo = { new Habilidad("Escarcha selecta", 35, 25, 1),
			new Habilidad("Cero Absoluto", 45, 45, 2), new Habilidad("Iceberg", 40, 25, 3),
			new Habilidad("Curar", 30, 50, 4)};
	private static Habilidad[] HabilidadesElec = { new Habilidad("Sobrecarga", 13, 5, 1),
			new Habilidad("Tormenta Eléctrica", 30, 30, 2), new Habilidad("Muralla Volátil", 25, 10, 3),
			new Habilidad("Curar", 30, 35, 4)};
	private static Habilidad[] HabilidadesVen = { new Habilidad("Dardo Envenenado", 30, 25, 1),
			new Habilidad("Intoxicación", 500, 0, 2), new Habilidad("Trampa de Agujas", 17, 5, 3),
			new Habilidad("Curar", 30, 40, 4)};
	private static Habilidad[] HabilidadesAgua = { new Habilidad("Rayo Burbuja", 15, 10, 1),
			new Habilidad("Maremoto", 63, 60, 2), new Habilidad("Torrente Cascada", 37, 20, 3),
			new Habilidad("Curar", 30, 35, 4)};
	private static Habilidad[] HabilidadesAire = { new Habilidad("Viento Cortante", 13, 5, 1),
			new Habilidad("Huracán", 55, 55, 2), new Habilidad("Desviación Aérea", 23, 5, 3),
			new Habilidad("Curar", 30, 10, 4)};
	private static Habilidad[] HabilidadesComunes = { new Habilidad("MoverseIzquierda", 0, 0, 5), new Habilidad("MoverseDerecha", 1, 0, 5), new Habilidad ("Descansar", 50, 0, 6) };

	private static Elemento Fuego = new Elemento(HabilidadesFuego, "Fuego");
	private static Elemento Agua = new Elemento(HabilidadesAgua, "Agua");
	private static Elemento Tierra = new Elemento(HabilidadesTierra, "Tierra");

	private static Elemento Hielo = new Elemento(HabilidadesHielo, "Hielo");
	private static Elemento Aire = new Elemento(HabilidadesAire, "Aire");
	private static Elemento Electrico = new Elemento(HabilidadesElec, "Electrico");
	private static Elemento Veneno = new Elemento(HabilidadesVen, "Veneno");

	private static Elemento[] listaElementos = { Fuego, Agua, Tierra, Hielo, Aire, Electrico, Veneno };

	public Datos(String[][] batalla4, String[][] batalla3, String[][] batalla2, String[][] batalla1, Elemento fuego,
			Elemento agua, Elemento tierra, Elemento hielo, Elemento aire, Elemento electrico, Elemento veneno) {
		super();
		this.batalla4 = batalla4;
		this.batalla3 = batalla3;
		this.batalla2 = batalla2;
		this.batalla1 = batalla1;
		Fuego = fuego;
		Agua = agua;
		Tierra = tierra;
		Hielo = hielo;
		Aire = aire;
		Electrico = electrico;
		Veneno = veneno;
	}

	public Datos() {
		super();
	}

	public Habilidad[] getHabilidadesFuego() {
		return HabilidadesFuego;
	}

	public void setHabilidadesFuego(Habilidad[] habilidadesFuego) {
		HabilidadesFuego = habilidadesFuego;
	}

	public Habilidad[] getHabilidadesTierra() {
		return HabilidadesTierra;
	}

	public void setHabilidadesTierra(Habilidad[] habilidadesTierra) {
		HabilidadesTierra = habilidadesTierra;
	}

	public Habilidad[] getHabilidadesHielo() {
		return HabilidadesHielo;
	}

	public void setHabilidadesHielo(Habilidad[] habilidadesHielo) {
		HabilidadesHielo = habilidadesHielo;
	}

	public Habilidad[] getHabilidadesElec() {
		return HabilidadesElec;
	}

	public void setHabilidadesElec(Habilidad[] habilidadesElec) {
		HabilidadesElec = habilidadesElec;
	}

	public Habilidad[] getHabilidadesVen() {
		return HabilidadesVen;
	}

	public void setHabilidadesVen(Habilidad[] habilidadesVen) {
		HabilidadesVen = habilidadesVen;
	}

	public Habilidad[] getHabilidadesAgua() {
		return HabilidadesAgua;
	}

	public void setHabilidadesAgua(Habilidad[] habilidadesAgua) {
		HabilidadesAgua = habilidadesAgua;
	}

	public Habilidad[] getHabilidadesAire() {
		return HabilidadesAire;
	}

	public void setHabilidadesAire(Habilidad[] habilidadesAire) {
		HabilidadesAire = habilidadesAire;
	}		

	public Habilidad[] getHabilidadesComunes() {
		return HabilidadesComunes;
	}

	public void setHabilidadesComunes(Habilidad[] habilidadesComunes) {
		HabilidadesComunes = habilidadesComunes;
	}

	public Elemento getFuego() {
		return Fuego;
	}

	public Elemento getAgua() {
		return Agua;
	}

	public Elemento getTierra() {
		return Tierra;
	}

	public Elemento getHielo() {
		return Hielo;
	}

	public Elemento getAire() {
		return Aire;
	}

	public Elemento getElectrico() {
		return Electrico;
	}

	public Elemento getVeneno() {
		return Veneno;
	}

	public String[][] getBatalla1() {
		return batalla1;
	}

	public void setBatalla1(String[][] batalla1) {
		this.batalla1 = batalla1;
	}

	public String[][] getBatalla2() {
		return batalla2;
	}

	public void setBatalla2(String[][] batalla2) {
		this.batalla2 = batalla2;
	}

	public String[][] getBatalla3() {
		return batalla3;
	}

	public void setBatalla3(String[][] batalla3) {
		this.batalla3 = batalla3;
	}

	public String[][] getBatalla4() {
		return batalla4;
	}

	public void setBatalla4(String[][] batalla4) {
		this.batalla4 = batalla4;
	}

	public Elemento[] getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(Elemento[] listaElementos) {
		this.listaElementos = listaElementos;
	}

}
