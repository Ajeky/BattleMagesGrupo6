package model;

public class Personaje {

	private Elemento e;
	private String nombre;
	private int salud;
	private int mana;
	private int posicion;
	private boolean muerte;
	private int contCurar;

	public Personaje(Elemento e, String nombre, int salud, int mana, int posicion, boolean muerte, int contCurar) {

		this.e = e;
		this.nombre = nombre;
		this.salud = salud;
		this.mana = mana;
		this.posicion = posicion;
		this.muerte = muerte;
		this.contCurar = contCurar;
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

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public boolean isMuerte() {
		return muerte;
	}

	public void setMuerte(boolean muerte) {
		this.muerte = muerte;
	}

	public int getContCurar() {
		return contCurar;
	}

	public void setContCurar(int contCurar) {
		this.contCurar = contCurar;
	}

	public String toString() {
		return "Personaje [e=" + e + ", Nombre = " + nombre + ", Salud = " + salud + ", Maná = " + mana + "]";
	}

}
