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

	private static Habilidad[] HabilidadesFuego = {new Habilidad("Bola de Fuego", 40, 20, 1), new Habilidad("Fogonazo", 100, 50, 2), new Habilidad("Barrera napalm", 60, 20, 3), new Habilidad("Propulsión Ígnea", 0, 40, 4)};
	private static Habilidad[] HabilidadesTierra = {new Habilidad("Roca afilada", 30, 15, 1), new Habilidad("Avalancha", 100, 80, 2), new Habilidad("Muro Sísmico", 100, 25, 3), new Habilidad("Desprendimiento Forzoso", 0, 60, 4)};
	private static Habilidad[] HabilidadesHielo = {new Habilidad("Escarcha selecta", 60, 25, 1), new Habilidad("Cero Absoluto", 80, 45, 2), new Habilidad("Iceberg", 75, 25, 3), new Habilidad("Deslizamiento Nevado", 0, 50, 4)}; 
	private static Habilidad[] HabilidadesElec = {new Habilidad("Sobrecarga", 20, 5, 1), new Habilidad("Tormenta Eléctrica", 50, 30, 2), new Habilidad("Muralla Volátil", 40, 10, 3), new Habilidad("Desplazamiento Estático", 0, 35, 4)};
	private static Habilidad[] HabilidadesVen = {new Habilidad("Dardo Envenenado", 50, 25, 1), new Habilidad("Intoxicación", 120, 65, 2), new Habilidad("Trampa de Agujas", 30, 5, 3), new Habilidad("Bomba de Humo", 0, 40, 4)};
	private static Habilidad[] HabilidadesAgua = {new Habilidad("Rayo Burbuja", 25, 10, 1), new Habilidad("Maremoto", 110, 60, 2), new Habilidad("Torrente Cascada", 70, 20, 3), new Habilidad("Escape Resbaloso", 0, 35, 4)};
	private static Habilidad[] HabilidadesAire = {new Habilidad("Viento Cortante", 15, 5, 1), new Habilidad("Huracán", 100, 55, 2), new Habilidad("Desviación Aérea", 35, 5, 3), new Habilidad("Viento a Favor", 0, 10, 4)};
	

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
	
	public static Habilidad[] getHabilidadesFuego() {
		return HabilidadesFuego;
	}
	public static void setHabilidadesFuego(Habilidad[] habilidadesFuego) {
		HabilidadesFuego = habilidadesFuego;
	}
	public static Habilidad[] getHabilidadesTierra() {
		return HabilidadesTierra;
	}
	public static void setHabilidadesTierra(Habilidad[] habilidadesTierra) {
		HabilidadesTierra = habilidadesTierra;
	}
	public static Habilidad[] getHabilidadesHielo() {
		return HabilidadesHielo;
	}
	public static void setHabilidadesHielo(Habilidad[] habilidadesHielo) {
		HabilidadesHielo = habilidadesHielo;
	}
	public static Habilidad[] getHabilidadesElec() {
		return HabilidadesElec;
	}
	public static void setHabilidadesElec(Habilidad[] habilidadesElec) {
		HabilidadesElec = habilidadesElec;
	}
	public static Habilidad[] getHabilidadesVen() {
		return HabilidadesVen;
	}
	public static void setHabilidadesVen(Habilidad[] habilidadesVen) {
		HabilidadesVen = habilidadesVen;
	}
	public static Habilidad[] getHabilidadesAgua() {
		return HabilidadesAgua;
	}
	public static void setHabilidadesAgua(Habilidad[] habilidadesAgua) {
		HabilidadesAgua = habilidadesAgua;
	}
	public static Habilidad[] getHabilidadesAire() {
		return HabilidadesAire;
	}
	public static void setHabilidadesAire(Habilidad[] habilidadesAire) {
		HabilidadesAire = habilidadesAire;
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
