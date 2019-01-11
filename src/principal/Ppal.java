package principal;

import utilidades.Leer;
import vista.Vista;
import model.Combate;
import crud.CrudPersonaje;
import model.Personaje;
import controller.ControllerCombate;
import crud.CrudCombate;
import datos.Datos;

//�                                12/12/2018                                                               �
//�---------------------------------------------------------------------------------------------------------�
//�	  # Creación de la clase model "Elemento"                     # - Alejandro Díaz Santos               �
//�   # Creación de la clase model "Personaje"                      # - Antonio Durán Falero                �
//�	  # Organización del juego, señalar requisitos funcionales    # - Álvaro Márquez Mata                 �
//�   # Creación de la clase model "Habilidad"                      # - Daniel Troncoso Rubio	            �
//�---------------------------------------------------------------------------------------------------------�
//�                                                                                                         �
//�	                              13/12/2018                                                                �
//�---------------------------------------------------------------------------------------------------------�
//�   # Creación de la clase vista "Vista"                          # - Alejandro Díaz Santos               �
//�   # Creación de la clase datos "DatosElemento"                  # - Antonio Durán Falero                �
//�   # Creación de las clases CRUD "Personaje, Elemento, Habilidad"# - Álvaro Márquez Mata                 �
//�   # Creación de la clase datos"DatosHabilidad"                  # - Daniel Troncoso Rubio			    �
//�---------------------------------------------------------------------------------------------------------�
//�_________________________________________________________________________________________________________�	

public class Ppal {

	public static void main(String[] args) {

		String nombre, nickName, iaName = "BOT Francisco";
		String[][] campoBatalla;
		int opcion = 0, opcExit = 3, contCombate = 0, opcElemento, p2SaludBase = 100, p2ManaBase = 100, p1SaludBase = 500, p1ManaBase = 200, posInicial = 0,
				opcHabilidad = 0, uno = 1;
		Combate c1;
		Personaje p1 = null, p2 = null;
		Datos bd = new Datos();

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

				System.out.println(
						"En Battle Mages, tus habilidades depende del elemento que elijas, y cada elemento tiene sus propias características.\n"
								+ "Fuego hace mucho daño a costa de peores habilidades defensivas.\nTierra es justo lo contrario, buena defensa pero un ataque pobre.\n"
								+ "Hielo está en un punto medio, pero se decanta más por el atque.\nEléctrico tiene menos potencia pero sus habilidades cuestan menos maná,\n"
								+ "algo parecido le pasa a aire pero de manera más intensa, coste de maná muy bajo y muy poca potencia.\n"
								+ "Las habilidades venenosas cuestan bastante maná, pero son muy potentes.\nFinalmente agua es el más equilibrado.\n ¿Qué elemento deseas elegir? : ");

				Vista.opcionElementos();

				opcElemento = Leer.datoInt() - 1;
				
				System.out.println("Te presento a " + iaName
						+ ", es algo tímido pero cuando coge confianza, ¡Se vuelve loco! ."
						+ "Tu primer combate seá contra él, un objetivo sencillo para coger la técnica. ¡Que comience la pelea !.\n\n");

				// Creamos el primer jugador

				p1 = new Personaje(bd.getListaElementos()[opcElemento], nickName, p1SaludBase, p1ManaBase, posInicial, false, 0);

				// Segundo jugador

				p2 = new Personaje(bd.getListaElementos()[opcElemento], iaName, p2SaludBase, p2ManaBase, posInicial, false, 0);

				// Creamos combate
				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				// Ataque del primer jugador

				do {

					System.out.println("¿Qué deseas hacer?: \n1. Lanzar una habilidad\n2. Moverse\n3. Descansar");

					if (p1.getE().getNombreElemento().equals("Fuego")) {
						Vista.fuegoHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.
						if (bd.getHabilidadesFuego()[opcHabilidad].getTipo() == 1
								|| bd.getHabilidadesFuego()[opcHabilidad].getTipo() == 2) {
							c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesFuego()[opcHabilidad],
									bd.getHabilidadesFuego()[1], contCombate);
						} else if (bd.getHabilidadesFuego()[opcHabilidad].getTipo() == 3) {
							c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesFuego()[opcHabilidad],
									bd.getHabilidadesFuego()[1], contCombate);
						}

					} else if (p1.getE().getNombreElemento().equals("Agua")) {
						Vista.aguaHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.

						c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);
						c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesAgua()[opcHabilidad],
								bd.getHabilidadesAgua()[0], contCombate);

					} else if (p1.getE().getNombreElemento().equals("Tierra")) {
						Vista.tierraHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.

						c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);
						c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesTierra()[opcHabilidad],
								bd.getHabilidadesTierra()[0], contCombate);

					} else if (p1.getE().getNombreElemento().equals("Hielo")) {
						Vista.hieloHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.

						c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);
						c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesHielo()[opcHabilidad],
								bd.getHabilidadesHielo()[0], contCombate);

					} else if (p1.getE().getNombreElemento().equals("Aire")) {
						Vista.aireHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.

						c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);
						c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesAire()[opcHabilidad],
								bd.getHabilidadesAire()[0], contCombate);

					} else if (p1.getE().getNombreElemento().equals("Electrico")) {
						Vista.electHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.

						c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);
						c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesElec()[opcHabilidad],
								bd.getHabilidadesElec()[0], contCombate);

					} else if (p1.getE().getNombreElemento().equals("Veneno")) {
						Vista.venenoHabilidad();

						opcHabilidad = Leer.datoInt() - 1;

						// Sacar habilidad con la posición de opcHabilidad.

						c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);
						c1 = ControllerCombate.atacarP1(c1, bd.getHabilidadesVen()[opcHabilidad],
								bd.getHabilidadesVen()[0], contCombate);

					}

					CrudCombate.actualizarCombate(c1, contCombate);

					

				} while (p2.isMuerte() == false);
				
				contCombate++;
				
				break;

			case 2:

				// TODO Syso en construcción
				System.out.println(
						"[Breve introducción a la historia del juego. Descripción del paisaje que ve el jugador. Descripción de los 4 "
								+ "enemigos a los que se puede enfrentar, dando a entender que los está viendo a los 4 y que están a una distancia similar.]");

				// TODO Syso provisional
				System.out.println("¿A por qué enemigo deseas ir primero?" + "1. Álvaro (Fuego)" + "2. Antonio (Agua)"
						+ "3. Alejandro (Tierra)" + "4. Dani (Aire)");
				opcion = Leer.datoInt();

				do {
					switch (opcion) {
					// TODO No estoy seguro de que la posición de los personajes deba ser
					// inicializada a
					// 0. Provisional.
					case 1:
						p2 = new Personaje(bd.getFuego(), "Álvaro", p2SaludBase, p2ManaBase, posInicial, false, 0);
						break;

					case 2:
						p2 = new Personaje(bd.getAgua(), "Antonio", p2SaludBase, p2ManaBase, posInicial, false, 0);
						break;

					case 3:
						p2 = new Personaje(bd.getTierra(), "Alejandro", p2SaludBase, p2ManaBase, posInicial, false, 0);
						break;

					case 4:
						p2 = new Personaje(bd.getHielo(), "Dani", p2SaludBase, p2ManaBase, posInicial, false, 0);
						break;

					default:
						System.out.println("Por favor introduzca un número del 1 al 4.");
						break;
					}
				} while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4);

				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				do {

				} while (p1.isMuerte() == false || p2.isMuerte() == false);

				// Es el break del case 2 (Jugar)
				break;

			case 3:

				System.out.printf("Gracias por utilizar nuestra app %s, hasta luego.\n\n", nickName);

				break;

			}

		} while (opcion != opcExit);

	}

}
