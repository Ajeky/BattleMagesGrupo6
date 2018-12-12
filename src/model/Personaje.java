package model;

public class Personaje {

	private Elemento e;
	private String nombre;
	private int salud;
	private int mana;
	
	
	public Personaje(Elemento e, String nombre, int salud, int mana) {
		
		this.e = e;
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
	}


	public Personaje() {
		
	}


	public Elemento getE() {
		return e;
	}


	public void setE(Elemento e) {
		this.e = e;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getSalud() {
		return salud;
	}


	public void setSalud(int salud) {
		this.salud = salud;
	}


	public int getMana() {
		return mana;
	}


	public void setMana(int mana) {
		this.mana = mana;
	}



	public String toString() {
		return "Personaje [e=" + e + ", nombre=" + nombre + ", salud=" + salud + ", mana=" + mana + "]";
	}
	
	
	
	
	
	
}