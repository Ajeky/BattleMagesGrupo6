package model;

public class Habilidad {

	private String nombre;
	int potencia;
	int costeMana;

	public Habilidad(String nombre, int potencia, int costeMana) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
		this.costeMana = costeMana;
	}

	public Habilidad() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getCosteMana() {
		return costeMana;
	}

	public void setCosteMana(int costeMana) {
		this.costeMana = costeMana;
	}

	@Override
	public String toString() {
		return "Habilidad [nombre=" + nombre + ", potencia=" + potencia + ", costeMana=" + costeMana + "]";
	}

}
