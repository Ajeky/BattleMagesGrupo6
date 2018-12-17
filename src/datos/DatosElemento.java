package datos;

import model.Elemento;



public class DatosElemento {
	
	Elemento Fuego = new Elemento(DatosHabilidad.getHabilidadesFuego(), "Fuego");
	Elemento Agua = new Elemento(DatosHabilidad.getHabilidadesAgua(), "Agua");
	Elemento Tierra = new Elemento(DatosHabilidad.getHabilidadesTierra(), "Tierra");
	Elemento Hielo = new Elemento(DatosHabilidad.getHabilidadesHielo(), "Hielo");
	Elemento Aire = new Elemento(DatosHabilidad.getHabilidadesAire(), "Aire");
	Elemento Electrico = new Elemento(DatosHabilidad.getHabilidadesElec(), "Electrico");
	Elemento Veneno = new Elemento(DatosHabilidad.getHabilidadesVen(), "Veneno");
	
	private Elemento[] listaElementos = {Fuego, Agua, Tierra, Hielo, Aire, Electrico, Veneno};

	public Elemento[] getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(Elemento[] listaElementos) {
		this.listaElementos = listaElementos;
	}
	


}
