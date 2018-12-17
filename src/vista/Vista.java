package vista;

import model.Habilidad;
import model.Personaje;

public class Vista {
	private Habilidad habilidad1;
	private Personaje personaje1;
	private Personaje personaje2;

//	Falta public Integer MostrarDistanciaComabte(){}
	public String MostrarNombreHabilidades() {
		return habilidad1.getNombre();
	}

	public Integer MostrarVidaPersonaje() {
		return personaje1.getSalud();
	}

	public Integer MostrarManaPersonaje() {
		return personaje1.getMana();
	}

	public Integer MostrarVidaEnemigo() {
		return personaje2.getSalud();
	}

	public Integer MostrarManaEnemigo() {
		return personaje2.getMana();
	}

	public void barraVida100() {

		System.out.println("Vida ████████████████████████████████████████");

	}

	public void barraVida80() {

		System.out.println("Vida ████████████████████████████████");
	}

	public void barraVida60() {

		System.out.println("Vida ████████████████████████");
	}

	public void barraVida40() {

		System.out.println("Vida ███████████████████");
	}

	public void barraVida20() {

		System.out.println("Vida ██████████");
	}

	public void barraVida10() {

		System.out.println("Vida █████");
	}
	
	public void barraMana100() {

		System.out.println("Maná ████████████████████████████████████████");

	}

	public void barraMana80() {

		System.out.println("Maná ████████████████████████████████");
	}

	public void barraMana60() {

		System.out.println("Maná ████████████████████████");
	}

	public void barraMana40() {

		System.out.println("Maná ███████████████████");
	}

	public void barraMana20() {

		System.out.println("Maná ██████████");
	}

	public void barraMana10() {

		System.out.println("Maná █████");
	}
	
	public void habilidadIncorrecta() {
		System.out.println("No se puede atacar usando una habilidad defensiva o evasiva.");
	}
}
