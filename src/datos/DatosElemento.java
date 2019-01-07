package datos;

import model.Elemento;



public class DatosElemento {
	
	public static Elemento Fuego = new Elemento(DatosHabilidad.getHabilidadesFuego(), "Fuego");
	public static Elemento Agua = new Elemento(DatosHabilidad.getHabilidadesAgua(), "Agua");
	public static Elemento Tierra = new Elemento(DatosHabilidad.getHabilidadesTierra(), "Tierra");
	public static Elemento Hielo = new Elemento(DatosHabilidad.getHabilidadesHielo(), "Hielo");
	public static Elemento Aire = new Elemento(DatosHabilidad.getHabilidadesAire(), "Aire");
	public static Elemento Electrico = new Elemento(DatosHabilidad.getHabilidadesElec(), "Electrico");
	public static Elemento Veneno = new Elemento(DatosHabilidad.getHabilidadesVen(), "Veneno");
	
	private Elemento[] listaElementos = {Fuego, Agua, Tierra, Hielo, Aire, Electrico, Veneno};

	public Elemento[] getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(Elemento[] listaElementos) {
		this.listaElementos = listaElementos;
	}
	


}
