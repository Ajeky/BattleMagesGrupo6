package datos;

import model.Habilidad;

public class DatosHabilidad {
	
	private static Habilidad[] HabilidadesFuego = {new Habilidad("Bola de Fuego", 40, 20), new Habilidad("Fogonazo", 100, 50), new Habilidad("Barrera napalm", 60, 20), new Habilidad("Propulsión Ígnea", 0, 40)};
	private static Habilidad[] HabilidadesTierra = {new Habilidad("Roca afilada", 30, 15), new Habilidad("Avalancha", 100, 80), new Habilidad("Muro Sísmico", 100, 25), new Habilidad("Desprendimiento Forzoso", 0, 60)};
	private static Habilidad[] HabilidadesHielo = {new Habilidad("Escarcha selecta", 60, 25), new Habilidad("Cero Absoluto", 80, 45), new Habilidad("Iceberg", 75, 25), new Habilidad("Deslizamiento Nevado", 0, 50)}; 
	private static Habilidad[] HabilidadesElec = {new Habilidad("Sobrecarga", 20, 5), new Habilidad("Tormenta Eléctrica", 50, 30), new Habilidad("Muralla Volátil", 40, 10), new Habilidad("Desplazamiento Estático", 0, 35)};
	private static Habilidad[] HabilidadesVen = {new Habilidad("Dardo Envenenado", 50, 25), new Habilidad("Intoxicación", 120, 65), new Habilidad("Trampa de Agujas", 30, 5), new Habilidad("Bomba de Humo", 0, 40)};
	private static Habilidad[] HabilidadesAgua = {new Habilidad("Rayo Burbuja", 25, 10), new Habilidad("Maremoto", 110, 60), new Habilidad("Torrente Cascada", 70, 20), new Habilidad("Escape Resbaloso", 0, 35)};
	private static Habilidad[] HabilidadesAire = {new Habilidad("Viento Cortante", 15, 5), new Habilidad("Huracán", 100, 55), new Habilidad("Desviación Aérea", 35, 5), new Habilidad("Viento a Favor", 0, 10)};
	
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
	
	
	
}
