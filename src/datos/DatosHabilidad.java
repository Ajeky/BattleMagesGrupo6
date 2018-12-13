package datos;

import model.Habilidad;

public class DatosHabilidad {
	
	private int tamanyo = 12;
	private static Habilidad[] HabilidadesFuego = {new Habilidad("Disparo de Fuego", 55, 20), new Habilidad("Llamarada Ardiente", 85, 45), new Habilidad("Barrera napalm", 0, 30)};
	private static Habilidad[] HabilidadesTierra = {new Habilidad("Lanzar roca", 55, 20), new Habilidad("Avalancha rocosa", 85, 45), new Habilidad("Muro rocoso", 0, 30)};
	private static Habilidad[] HabilidadesHielo = {new Habilidad("Escarchada selecta", 55, 20), new Habilidad("Bola nevada", 85, 45), new Habilidad("Iceberg", 0, 30)}; 
	private static Habilidad[] HabilidadesElec = {new Habilidad("Rayo francotirador", 55, 20), new Habilidad("Alterar protones", 85, 45), new Habilidad("Campo electroestático", 0, 30)};
	
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
	
	
	
}
