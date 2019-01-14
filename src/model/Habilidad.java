package model;

public class Habilidad {

	private String nombre;
	private int potencia;
	private int costeMana;
	private int tipo;
	private String icono;

	public Habilidad(String nombre, int potencia, int costeMana, int tipo) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
		this.costeMana = costeMana;
		this.tipo = tipo;
	}

	public Habilidad(String nombre, int potencia, int costeMana, int tipo, String icono) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
		this.costeMana = costeMana;
		this.tipo = tipo;
		this.icono = icono;
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

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	@Override
	public String toString() {
		return "Habilidad [Nombre = " + nombre + ", Potencia = " + potencia + ", Coste de Maná = " + costeMana + "]";
	}

}
