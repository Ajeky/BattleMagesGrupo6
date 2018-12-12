package model;

public class Elemento {

	private Habilidad[] habilidades;
	private String nombreElemento;
	
	public Elemento() {
	
	}
		
	public Elemento(Habilidad[] habilidades, String nombreElemento) {
		super();
		this.habilidades = habilidades;
		this.nombreElemento = nombreElemento;
	}

	public Habilidad[] getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Habilidad[] habilidades) {
		this.habilidades = habilidades;
	}

	public String getNombreElemento() {
		return nombreElemento;
	}

	public void setNombreElemento(String nombreElemento) {
		this.nombreElemento = nombreElemento;
	}

	@Override
	public String toString() {
		return "Elemento [Elemento = " + nombreElemento + "Habilidades = " + habilidades+"]";
	}
	
	
	
}