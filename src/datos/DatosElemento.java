package datos;

import model.Elemento;



public class DatosElemento {
	private Elemento[] listaElementos = {new Elemento(DatosHabilidad.getHabilidadesFuego(), "Fuego"), 
			new Elemento(DatosHabilidad.getHabilidadesHielo(), "Hielo"), new Elemento(DatosHabilidad.getHabilidadesTierra(), "Tierra"), 
			new Elemento(DatosHabilidad.getHabilidadesElec(), "Electricidad")};

	public Elemento[] getListaElementos() {
		return listaElementos;
	}

	public void setListaElementos(Elemento[] listaElementos) {
		this.listaElementos = listaElementos;
	}
	
	

}
