package datos;

import model.Elemento;



public class DatosElemento {
	private Elemento[] listaElementos = {new Elemento(DatosHabilidad.getHabilidadesFuego(), "Fuego"), 
			new Elemento(DatosHabilidad.getHabilidadesHielo(), "Hielo"), new Elemento(DatosHabilidad.getHabilidadesTierra(), "Tierra"), 
			new Elemento(DatosHabilidad.getHabilidadesElec(), "Electricidad")};
	
	Elemento Fuego = new Elemento(DatosHabilidad.getHabilidadesFuego(), "Fuego");
	Elemento Agua = new Elemento(DatosHabilidad.getHabilidadesAgua(), "Agua");
	Elemento Tierra = new Elemento(DatosHabilidad.getHabilidadesTierra(), "Tierra");
	Elemento Hielo = new Elemento(DatosHabilidad.getHabilidadesHielo(), "Hielo");
	Elemento Aire = new Elemento(DatosHabilidad.getHabilidadesAire(), "Aire");
	Elemento Electrico = new Elemento(DatosHabilidad.getHabilidadesElec(), "Electrico");
	Elemento Veneno = new Elemento(DatosHabilidad.getHabilidadesVen(), "Veneno");

	public Elemento[] getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(Elemento[] listaElementos) {
		this.listaElementos = listaElementos;
	}
	


}
