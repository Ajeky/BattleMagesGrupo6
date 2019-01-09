package model;

public class Habilidad {

	private String nombre;
	int potencia;
	int costeMana;
	int tipo;

	public Habilidad(String nombre, int potencia, int costeMana, int tipo) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
		this.costeMana = costeMana;
		this.tipo = tipo;
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

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Habilidad [nombre=" + nombre + ", potencia=" + potencia + ", costeMana=" + costeMana + "]";
	}

}
