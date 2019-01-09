package principal;

import utilidades.Leer;
import vista.Vista;
import model.Combate;
import crud.CrudPersonaje;
import model.Personaje;
import controller.ControllerCombate;
import crud.CrudCombate;
import datos.DatosElemento;
import datos.DatosHabilidad;
import datos.Datos;
import datos.DatosCombate;

//�                                12/12/2018                                                               �
//�---------------------------------------------------------------------------------------------------------�
//�	  # Creaci�n de la clase model "Elemento"                       # - Alejandro D�az Santos               �
//�   # Creaci�n de la clase model "Personaje"                      # - Antonio Dur�n Falero                �
//�	  # Organizaci�n del juego, se�alar requisitos funcionales      # - �lvaro M�rquez Mata                 �
//�   # Creaci�n de la clase model "Habilidad"                      # - Daniel Troncoso Rubio	            �
//�---------------------------------------------------------------------------------------------------------�
//�                                                                                                         �
//�	                              13/12/2018                                                                �
//�---------------------------------------------------------------------------------------------------------�
//�   # Creaci�n de la clase vista "Vista"                          # - Alejandro D�az Santos               �
//�   # Creaci�n de la clase datos "DatosElemento"                  # - Antonio Dur�n Falero                �
//�   # Creaci�n de las clases CRUD "Personaje, Elemento, Habilidad"# - �lvaro M�rques Mata                 �
//�   # Creaci�n de la clase datos"DatosHabilidad"                  # - Daniel Troncoso Rubio			    �
//�---------------------------------------------------------------------------------------------------------�
//�_________________________________________________________________________________________________________�	

public class Ppal {

	public static void main(String[] args) {

		String nombre, nickName, iaName = "BOT Francisco";
		String[][] campoBatalla;
		int opcion, opcExit = 3, contCombate = 0, opcMano, saludBase = 100, manaBase = 100, pocBase = 0, opcHabilidad;
		Combate c1;
		Personaje p1 = null, p2 = null;
		DatosElemento dEl = new DatosElemento();
		Datos dbMapa = new Datos();
		ControllerCombate cb = new ControllerCombate();

		System.out.println(
				"██████╗  █████╗ ████████╗████████╗██╗     ███████╗    ██████╗  ██████╗ ██╗   ██╗ █████╗ ██╗     \r\n"
						+ "██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝    ██╔══██╗██╔═══██╗╚██╗ ██╔╝██╔══██╗██║     \r\n"
						+ "██████╔╝███████║   ██║      ██║   ██║     █████╗      ██████╔╝██║   ██║ ╚████╔╝ ███████║██║     \r\n"
						+ "██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝      ██╔══██╗██║   ██║  ╚██╔╝  ██╔══██║██║     \r\n"
						+ "██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗    ██║  ██║╚██████╔╝   ██║   ██║  ██║███████╗\r\n"
						+ "╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝    ╚═╝  ╚═╝ ╚═════╝    ╚═╝   ╚═╝  ╚═╝╚══════╝\r\n"
						+ "                                                                                                \r\n"
						+ "    ███████╗██████╗ ███████╗██╗     ██╗         ██████╗ ██████╗ ███████╗ █████╗ ██╗  ██╗        \r\n"
						+ "    ██╔════╝██╔══██╗██╔════╝██║     ██║         ██╔══██╗██╔══██╗██╔════╝██╔══██╗██║ ██╔╝        \r\n"
						+ "    ███████╗██████╔╝█████╗  ██║     ██║         ██████╔╝██████╔╝█████╗  ███████║█████╔╝         \r\n"
						+ "    ╚════██║██╔═══╝ ██╔══╝  ██║     ██║         ██╔══██╗██╔══██╗██╔══╝  ██╔══██║██╔═██╗         \r\n"
						+ "    ███████║██║     ███████╗███████╗███████╗    ██████╔╝██║  ██║███████╗██║  ██║██║  ██╗        \r\n"
						+ "    ╚══════╝╚═╝     ╚══════╝╚══════╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝");

		System.out.println("            \\                                           ___/________\r\n"
				+ "\t       ___   )                    ,  @                    /    \\  \\\r\n"
				+ "\t    @___, \\ /                  @__\\  /\\              @___/      \\@/\r\n"
				+ "\t   /\\__,   |                  /\\_, \\/ /             /\\__/        |\r\n"
				+ "\t  / \\    / @\\                / \\   (               / \\ /        / \\\r\n"
				+ "\t_/__|___/___/_______________/__|____\\_____________/__/__________|__\\__\n\n");

		System.out.println(
				"================================================================================================\n\n");

		System.out.println("Bienvenido , introduzca su nick de jugador : ");

		nickName = Leer.dato();

		do {

			System.out.println(" ██╗       ████████╗██╗   ██╗████████╗ ██████╗ ██████╗ ██╗ █████╗ ██╗     \r\n"
					+ "███║       ╚══██╔══╝██║   ██║╚══██╔══╝██╔═══██╗██╔══██╗██║██╔══██╗██║     \r\n"
					+ "╚██║          ██║   ██║   ██║   ██║   ██║   ██║██████╔╝██║███████║██║     \r\n"
					+ " ██║          ██║   ██║   ██║   ██║   ██║   ██║██╔══██╗██║██╔══██║██║     \r\n"
					+ " ██║██╗       ██║   ╚██████╔╝   ██║   ╚██████╔╝██║  ██║██║██║  ██║███████╗\r\n"
					+ " ╚═╝╚═╝       ╚═╝    ╚═════╝    ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚══════╝\r\n"
					+ "                                                                          \r\n"
					+ "██████╗             ██╗██╗   ██╗ ██████╗  █████╗ ██████╗                  \r\n"
					+ "╚════██╗            ██║██║   ██║██╔════╝ ██╔══██╗██╔══██╗                 \r\n"
					+ " █████╔╝            ██║██║   ██║██║  ███╗███████║██████╔╝                 \r\n"
					+ "██╔═══╝        ██   ██║██║   ██║██║   ██║██╔══██║██╔══██╗                 \r\n"
					+ "███████╗██╗    ╚█████╔╝╚██████╔╝╚██████╔╝██║  ██║██║  ██║                 \r\n"
					+ "╚══════╝╚═╝     ╚════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝                 \r\n"
					+ "                                                                          \r\n"
					+ "██████╗        ███████╗ █████╗ ██╗     ██╗██████╗                         \r\n"
					+ "╚════██╗       ██╔════╝██╔══██╗██║     ██║██╔══██╗                        \r\n"
					+ " █████╔╝       ███████╗███████║██║     ██║██████╔╝                        \r\n"
					+ " ╚═══██╗       ╚════██║██╔══██║██║     ██║██╔══██╗                        \r\n"
					+ "██████╔╝██╗    ███████║██║  ██║███████╗██║██║  ██║                        \r\n"
					+ "╚═════╝ ╚═╝    ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝\n\n");

			System.out.println(
					"================================================================================================\n\n");

			System.out.println("¿Qué deseas hacer?");

			opcion = Leer.datoInt();

			System.out.println(
					"================================================================================================\n\n");

			switch (opcion) {

			case 1:

				System.out.println(
						"Bienvenido al Tutorial , aquí podrás aprender las técnicas y habilidades de combate básicos para defenderte en"
								+ "el campo de batalla.\n");

				System.out.printf(
						"Primero de todo , te presento a %s, es algo tímido pero cuando coge confianza, ¡ Se vuelve loco ! ."
								+ "Tu primer combate seá contra él, un objetivo sencillo para coger la técnica. ¡ Qué comience la pelea !.\n\n",
						iaName);

				System.out.printf("%s es tu turno , ¿qué mano deseas elegir? : ", nickName);

				Vista.opcionManos();

				opcMano = Leer.datoInt()-1;

				// No recuerdo como coger la posición del array cuando hay un get.
				// Este get va dentro de p1 reemplazando -> DatosElemento.Fuego.
				dEl.getListaElementos()[0].getNombreElemento("Fuego");

				// Creamos el primer jugador

				p1 = new Personaje(DatosElemento.Fuego, nickName, saludBase, manaBase, pocBase);

				// Segundo jugador

				p2 = new Personaje(DatosElemento.Hielo, iaName, saludBase, manaBase, pocBase);

				// Creamos combate
				
				c1 = new Combate(p1, p2, dbMapa.getBatalla1());
				
				// Da error porque es tipo String [][].

				CrudCombate.crearCombate(p1, p2, dbMapa.getBatalla1(), contCombate);
				
				//Ataque del primer jugador
				
				do {
				
				System.out.printf("%s es tu turno , ¿qué habilidad deseas lanzar? : ",nickName);
				
				Vista.fuegoHabilidad();
				
				opcHabilidad = Leer.datoInt();			
				
				//Sacar habilidad con la posición de opcHabilidad.
				
				cb.atacar(c1, DatosHabilidad.getHabilidadesFuego(), DatosHabilidad.getHabilidadesHielo());
				
				System.out.printf("%s ha utilizado %s",iaName, DatosHabilidad.getHabilidadesHielo()); //Coger posicion y nombre habilidad
				
				//Actualiza el combate
				
				CrudCombate.actualizarCombate(c1, contCombate);
				
				contCombate++;
				
				}while(p2.getSalud() == 0);
				
				
				
				
				break;

			case 2:

				// Syso en construcción
				System.out.println(
						"[Breve introducción a la historia del juego. Descripción del paisaje que ve el jugador. Descripción de los 4 "
								+ "enemigos a los que se puede enfrentar, dando a entender que los está viendo a los 4 y que están a una distancia similar.]");

				// Syso provisional
				System.out.println("¿A por qué enemigo deseas ir primero?" + "1. Álvaro (Fuego)" + "2. Antonio (Agua)"
						+ "3. Alejandro (Tierra)" + "4. Dani (Aire)");
				opcion = Leer.datoInt();

				switch (opcion) {
				// No estoy seguro de que la posición de los personajes deba ser inicializada a
				// 0. Provisional.
				case 1:
					p2 = new Personaje(DatosElemento.Fuego, "Álvaro", saludBase, manaBase, pocBase);
					break;

				case 2:
					p2 = new Personaje(DatosElemento.Agua, "Antonio", saludBase, manaBase, pocBase);
					break;

				case 3:
					p2 = new Personaje(DatosElemento.Tierra, "Alejandro", saludBase, manaBase, pocBase);
					break;

				case 4:
					p2 = new Personaje(DatosElemento.Hielo, "Dani", saludBase, manaBase, pocBase);
					break;

				default:
					break;
				}

				campoBatalla = DatosCombate.batalla1;
				c1 = new Combate(p1, p2, campoBatalla);
				/*
				 * CrudCombate.crearCombate(p1, p2, contCombate); contCombate++;
				 */

				break;

			case 3:

				System.out.printf("Gracias por utilizar nuestra app %s, hasta luego.\n\n", nickName);

				break;

			}

		} while (opcion != opcExit);

	}

}
