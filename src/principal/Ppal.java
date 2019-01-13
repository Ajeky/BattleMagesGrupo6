package principal;

import utilidades.Leer;
import vista.Vista;
import model.Combate;
import crud.CrudPersonaje;
import model.Personaje;
import controller.ControllerCombate;
import crud.CrudCombate;
import datos.Datos;
import model.Habilidad;

/*
--------------------------------------------------------------------------Antonio Durán Falero---------------------------------------------------------------------------------------
Creado todas las clases de combate (tanto model datos como crud)
Introducción de los distintos mapas a la base de datos  creacion de todos los métodos que este relacionado como acciones sobre el mapa.(controller actualizar mapa)
Controller.moverp1 y moverp2
Crud(Crearcombate)
Datos entre yo y alvaro
MODEL(combate, personaje)



----------------------------------------------------------------------------Daniel Troncoso Rubio------------------------------------------------------------------------------

-Creada la clase Habilidad
-Array habilidades añadido a DatosHabilidad (Movido a Datos.java)
-Creado el paquete utilidades con la clase Leer
-Creada la estructura de Ppal de inicio (Luego modificada por Álvaro)
-Creado los métodos de la vista (barra de mana , barra de vida, game over, magical victory,
-menú, título del juego, los menús de lasd habilidades,erroresCura, erroresMovimiento, todos los métodos de habilidades de fuego,viento,tierra, hielo, electrico..)
-Rellenado las habilidades de los elementos en DatosHabilidad con el nombre , potencia y daño. (Modificada por Álvaro y movidas a Datos.java)
-Creado métodos de delete y update en CrudCombate.
-Tutorial en la clase Ppal (Terminado y modificado por Álvaro)
-Creado métodos en ControllerCombate para mostrarvida y mostrarmaná de ambos personajes.





---------------------------------------------------------------------Alejandro Díaz Santos--------------------------------------------------------------------
- Model elemento
- despuesAlex()
- Intento de método en el cual haya una probabilidad para el método atacar y esquivar. 
Si la probabilidad del método de atacar p1 es mayor que la de esquivar de P2, P1 atacará a P2. (No implementado) 
- Clase crudPersonaje actualizar salud y maná, actualizar lista de lo que se ha hecho
- Corrección de caracteres
- Creación clase Vista
- Ppal sysos "Te enfrentaras a..",
- Método imagenFight con syso "FIGHT!" 
- Cambio de título de "Battle Royale Spell Break" a "Battle Mages: Battle Royale"




--------------------------------------------------------------------Álvaro Márquez Mata------------------------------------------------------------------------------
12/12/2018
-Creadas clases:	ControllerElemento, ControllerHabilidad, ControllerPersonaje
			CrudHabilidad, DatosElemento, DatosHabilidad, Habilidad
13/12/2018
-Creados métodos:	CrudElemento: anadir, eliminar
			CrudPersonaje: actualizarposicion
			DatosElemento: Elemento[] listaElementos
			DatosHabilidad: Habilidad[] HabilidadesFuego, Habilidad[] HabilidadesTierra, HabilidadesHielo, HabilidadesElec,
					y creados getters&setters
			Personaje: Constructor, nuevo atributo "posicion", getter&setter.
14/12/2018
#Añadido array listaElementos a la clase DatosElemento. Getter&Setter.
#Añadidos arrays de Habilidades a la clase DatosHabilidad. Getter&Setter.
#Creada clase ControllerCombate, creados los objetos Elemento en DatosElemento.
#Añadidos constructores, Getters&Setters y toString.

17/12/2018
#Creado método atacar en ControllerCombate. Posteriormente eliminado.
#Añadidos tipos de habilidad a DatosHabilidad.
#Añadido atributo tipo a model.Habilidad. Getter&Setter creado.
#Añadido método habilidadIncorrecta a la clase Vista.
#Añadido método crearCombate a CrudCombate
#Añadidos Getters&Setters a la clase DatosCombate


7/1/2018
#Comenzado el trabajo de la clase principal. Creados los personajes y el primer combate.
#Añadido método borrarCombate a la clase CrudCombate

9/1/2018
#Añadido atributo muerte a model.Personaje, además de isMuerte y setMuerte.
#Creados Getter&Setter para contCombate en la clase model.Combate.
#Convertidos en static algunos métodos que no lo eran.
#Terminadas de juntar todas las clases del paquete "datos" en una sola
#Avanzado el desarrollo de la clase principal

11/1/2018
#Añadido coste de maná al método curar de ControllerCombate (más tarde simplificado en otro método)
#Corrección de errores
#Añadidas las habilidades Curar a la clase Datos
#Avanzado el desarrollo del tutorial de la clase principal (estructura creada por Dani, finalmente hecho por mí)
#Cambiado el método atacar de CrudCombate (modificado más aún posteriormente)
#Aumentada cantidad de vida de los jugadores y reducido el daño de las habilidades para balancear el juego
#Corrección de algunos métodos de la clase Vista

12/1/2018
#Avanzado desarrollo de la clase Principal
#Corregidos algunos métodos de la clase Vista
#Balanceo de maná, devuelto a 100 puntos por personaje
#Añadido el coste y la potencia al syso de Fuego de clase Vista en que se muestran al jugador las habilidades disponibles. (Resto de elementos hechos por Antonio)
#Eliminada clase CrudHabilidad
#Reformada la clase CrudCombate para el método actualizarCombate; ahora hace muchas cosas que antes se hacían en ControllerCombate
#Dividido el macrométodo atacar en otros más pequeños, llamados luegos por el método actualizarCombate de la clase CrudCombate
#Creado array HabilidadesComunes en Datos
#Crado método actualizarMuerte en CrudPersonaje, convertidos en static unos métodos que no lo eran.
#Más correcciones de la clase Vista
#Desarrollo del tutorial de la clase Principal
#Terminado método actualizarCombate de la clase CrudCombate
#Terminado el tutorial
#Clase principal casi terminada, faltando solo sysos y corrección de errores
#Corregido el movimiento de los personajes, tanto los métodos moverse como la posición inicial del jugador 2 (hecho entre todos)
#Añadido que se impriman los iconos de las habilidades al usarlas con la ayuda de Daniel
#Movido parte del método actualizarCombate de CrudCombate a ControllerCombate, creando otro método llamado actualizarMapa.
#Corrección de errores de la clase Ppal.
#Añadido método vista "despuesAlvaro()"
#Añadido cartel de Game Over (craedo por Dani) a la clase Ppal
#Correcciones gramaticales de algunos métodos de la clase Vista
#Terminado por completo el desarrollo de la clase Ppal.

Documentación ofrecida por Alejandro.
Si quieres mirar los cambios de forma más exhaustiva, en nuestro repositorio de GitHub están todos los cambios
realizados por cada uno de nosotros: https://github.com/Ajeky/BattleMagesGrupo6



*/

public class Ppal {

	public static void main(String[] args) {

		String nickName, iaName = "BOT Francisco";
		String[][] campoBatalla;
		int opcion = 0, opcExit = 3, contCombate = 0, opcElemento, p2SaludBase = 200, p2ManaBase = 100,
				p1SaludBase = 800, p1ManaBase = 100, posInicial = 1, posInicialP2 = 0, opcHabilidad = 0, uno = 1,
				comprobacion = 0, p1Mover = 2, p2Mover = 2, p1Descansar = 0, p2Descansar = 0;
		Combate c1;
		Personaje p1 = null, p2 = null, alvaro, antonio, alex, dani;
		Datos bd = new Datos();
		Habilidad h1 = null, h2 = null;

		Vista.tituloJuego();

		Vista.imagenTitulo();

		System.out.println(
				"================================================================================================\n\n");

		System.out.println("Bienvenido , introduzca su nick de jugador : ");

		nickName = Leer.dato();

		System.out.println("\n\n");

		do {

			// Menú principal
			Vista.menuPrincipal();

			System.out.println(
					"================================================================================================\n");

			opcion = Leer.datoInt();
			System.out.println("");

			System.out.println(
					"================================================================================================\n\n");

			switch (opcion) {

			// Tutorial
			case 1:
				contCombate = 0;

				// Explicación de los elementos
				Vista.tutorial();

				// Elección del elemento
				Vista.opcionElementos();

				opcElemento = Leer.datoInt() - 1;

				// Creamos el primer jugador

				p1 = new Personaje(bd.getListaElementos()[opcElemento], nickName, p1SaludBase, p1ManaBase, posInicial,
						false, 0);

				// Segundo jugador

				posInicialP2 = bd.getBatalla1()[0].length - 2;
				p2 = new Personaje(bd.getListaElementos()[0], iaName, p2SaludBase, p2ManaBase, posInicialP2, false, 0);

				// Explicación combate y presentación del Bot Francisco
				Vista.tutorial2(p2);

				comprobacion = Leer.datoInt();
				comprobacion = 0;

				Vista.imagenFight();

				// Creamos combate
				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				// Ataque del primer jugador

				do {

					ControllerCombate.actualizarMapa(c1, contCombate);
					Vista.mostrarMapa(c1);

					System.out.println(c1.getP1().getNombre());
					ControllerCombate.mostrarVidaP1(c1);
					Vista.mostrarVidaPersonaje(c1.getP1());
					System.out.println(" ");
					ControllerCombate.mostrarManaP1(c1);
					Vista.mostrarManaPersonaje(c1.getP1());
					System.out.println(" ");

					System.out.println(c1.getP2().getNombre());
					ControllerCombate.mostrarVidaP2(c1);
					Vista.mostrarVidaEnemigo(c1.getP2());
					System.out.println(" ");
					ControllerCombate.mostrarManaP2(c1);
					Vista.mostrarManaEnemigo(c1.getP2());
					System.out.println(" ");

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p1);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p1.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h1 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h1 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h1 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}
					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					h2 = bd.getHabilidadesFuego()[0];

					c1 = CrudCombate.actualizarCombate(c1, contCombate, h1, h2);

					if (p1.getSalud() <= 0) {
						p1 = CrudPersonaje.actualizarMuerte(c1.getP1());
					}

					if (p2.getSalud() <= 0) {
						p2 = CrudPersonaje.actualizarMuerte(c1.getP2());
					}

				} while (p2.isMuerte() == false && p1.isMuerte() == false);

				opcion = 0;

				if (p1.isMuerte() == true) {
					Vista.gameOver();
					Vista.introduceNumero();
					comprobacion = Leer.datoInt();
					comprobacion = 0;
				}

				p1.setContCurar(0);
				p2.setContCurar(0);

				if (p1.isMuerte() == false) {
					Vista.finTutorial();
					comprobacion = Leer.datoInt();
					comprobacion = 0;
				}

				break;

			case 2:

				contCombate = 0;

				Vista.introduccionJuego();

				// Elección del elemento
				Vista.opcionElementos();

				opcElemento = Leer.datoInt() - 1;

				// Creamos el primer jugador

				p1 = new Personaje(bd.getListaElementos()[opcElemento], nickName, p1SaludBase, p1ManaBase, posInicial,
						false, 0);

				Vista.descripcionJugadores();

				Vista.antesDani();

				posInicialP2 = bd.getBatalla1()[0].length - 2;
				dani = new Personaje(bd.getHielo(), "Dani", p2SaludBase, p2ManaBase, posInicialP2, false, 0);
				p2 = dani;

				System.out.println("¡Te enfrentarás contra Dani!\n");

				Vista.introduceNumero();
				comprobacion = Leer.datoInt();
				comprobacion = 0;

				Vista.imagenFight();

				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				do {

					ControllerCombate.actualizarMapa(c1, contCombate);
					Vista.mostrarMapa(c1);

					System.out.println(c1.getP1().getNombre());
					ControllerCombate.mostrarVidaP1(c1);
					Vista.mostrarVidaPersonaje(c1.getP1());
					System.out.println(" ");
					ControllerCombate.mostrarManaP1(c1);
					Vista.mostrarManaPersonaje(c1.getP1());
					System.out.println(" ");

					System.out.println(c1.getP2().getNombre());
					ControllerCombate.mostrarVidaP2(c1);
					Vista.mostrarVidaEnemigo(c1.getP2());
					System.out.println(" ");
					ControllerCombate.mostrarManaP2(c1);
					Vista.mostrarManaEnemigo(c1.getP2());
					System.out.println(" ");

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p1);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p1.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h1 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h1 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h1 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}
					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p2);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p2.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h2 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h2 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h2 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}

					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					CrudCombate.actualizarCombate(c1, contCombate, h1, h2);

					if (p1.getSalud() <= 0) {
						p1 = CrudPersonaje.actualizarMuerte(c1.getP1());
					}

					if (p2.getSalud() <= 0) {
						p2 = CrudPersonaje.actualizarMuerte(c1.getP2());
					}

				} while (p1.isMuerte() == false && p2.isMuerte() == false);

				opcion = 0;

				if (p1.isMuerte() == true) {
					Vista.gameOver();
					Vista.introduceNumero();
					comprobacion = Leer.datoInt();
					comprobacion = 0;
					break;
				}

				p1.setContCurar(0);
				p2.setContCurar(0);
				contCombate++;

				Vista.despuesDani();
				Vista.introduceNumero();
				comprobacion = Leer.datoInt();

				posInicialP2 = bd.getBatalla2()[0].length - 2;
				alex = new Personaje(bd.getTierra(), "Alejandro", p2SaludBase, p2ManaBase, posInicialP2, false, 0);
				p2 = alex;
				System.out.println("¡Te enfrentarás contra Alex!\n");
				Vista.imagenFight();
				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				do {

					ControllerCombate.actualizarMapa(c1, contCombate);
					Vista.mostrarMapa(c1);

					System.out.println(c1.getP1().getNombre());
					ControllerCombate.mostrarVidaP1(c1);
					Vista.mostrarVidaPersonaje(c1.getP1());
					System.out.println(" ");
					ControllerCombate.mostrarManaP1(c1);
					Vista.mostrarManaPersonaje(c1.getP1());
					System.out.println(" ");

					System.out.println(c1.getP2().getNombre());
					ControllerCombate.mostrarVidaP2(c1);
					Vista.mostrarVidaEnemigo(c1.getP2());
					System.out.println(" ");
					ControllerCombate.mostrarManaP2(c1);
					Vista.mostrarManaEnemigo(c1.getP2());
					System.out.println(" ");

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p1);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p1.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h1 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h1 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h1 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}
					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p2);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p2.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h2 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h2 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h2 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}

					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					CrudCombate.actualizarCombate(c1, contCombate, h1, h2);

					if (p1.getSalud() <= 0) {
						p1 = CrudPersonaje.actualizarMuerte(c1.getP1());
					}

					if (p2.getSalud() <= 0) {
						p2 = CrudPersonaje.actualizarMuerte(c1.getP2());
					}

				} while (p1.isMuerte() == false && p2.isMuerte() == false);

				opcion = 0;

				if (p1.isMuerte() == true) {
					Vista.gameOver();
					Vista.introduceNumero();
					comprobacion = Leer.datoInt();
					comprobacion = 0;
					break;
				}

				p1.setContCurar(0);
				p2.setContCurar(0);
				contCombate++;

				Vista.despuesAlex();
				Vista.introduceNumero();
				comprobacion = Leer.datoInt();
				comprobacion = 0;

				posInicialP2 = bd.getBatalla3()[0].length - 2;
				antonio = new Personaje(bd.getAgua(), "Antonio", p2SaludBase, p2ManaBase, posInicialP2, false, 0);
				p2 = antonio;
				System.out.println("¡Te enfrentarás contra Antonio!\n");
				Vista.imagenFight();
				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				do {

					ControllerCombate.actualizarMapa(c1, contCombate);
					Vista.mostrarMapa(c1);

					System.out.println(c1.getP1().getNombre());
					ControllerCombate.mostrarVidaP1(c1);
					Vista.mostrarVidaPersonaje(c1.getP1());
					System.out.println(" ");
					ControllerCombate.mostrarManaP1(c1);
					Vista.mostrarManaPersonaje(c1.getP1());
					System.out.println(" ");

					System.out.println(c1.getP2().getNombre());
					ControllerCombate.mostrarVidaP2(c1);
					Vista.mostrarVidaEnemigo(c1.getP2());
					System.out.println(" ");
					ControllerCombate.mostrarManaP2(c1);
					Vista.mostrarManaEnemigo(c1.getP2());
					System.out.println(" ");

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p1);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p1.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h1 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h1 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h1 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}
					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p2);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p2.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h2 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h2 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h2 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}

					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					CrudCombate.actualizarCombate(c1, contCombate, h1, h2);

					if (p1.getSalud() <= 0) {
						p1 = CrudPersonaje.actualizarMuerte(c1.getP1());
					}

					if (p2.getSalud() <= 0) {
						p2 = CrudPersonaje.actualizarMuerte(c1.getP2());
					}

				} while (p1.isMuerte() == false && p2.isMuerte() == false);

				opcion = 0;

				if (p1.isMuerte() == true) {
					Vista.gameOver();
					Vista.introduceNumero();
					comprobacion = Leer.datoInt();
					comprobacion = 0;
					break;
				}

				p1.setContCurar(0);
				p2.setContCurar(0);
				contCombate++;

				Vista.despuesAntonio();
				Vista.introduceNumero();
				comprobacion = Leer.datoInt();
				comprobacion = 0;

				posInicialP2 = bd.getBatalla4()[0].length - 2;
				alvaro = new Personaje(bd.getFuego(), "Álvaro", p2SaludBase, p2ManaBase, posInicialP2, false, 0);
				p2 = alvaro;
				System.out.println("Te enfrentarás contra Álvaro\n");
				Vista.imagenFight();
				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				do {

					ControllerCombate.actualizarMapa(c1, contCombate);
					Vista.mostrarMapa(c1);

					System.out.println(c1.getP1().getNombre());
					ControllerCombate.mostrarVidaP1(c1);
					Vista.mostrarVidaPersonaje(c1.getP1());
					System.out.println(" ");
					ControllerCombate.mostrarManaP1(c1);
					Vista.mostrarManaPersonaje(c1.getP1());
					System.out.println(" ");

					System.out.println(c1.getP2().getNombre());
					ControllerCombate.mostrarVidaP2(c1);
					Vista.mostrarVidaEnemigo(c1.getP2());
					System.out.println(" ");
					ControllerCombate.mostrarManaP2(c1);
					Vista.mostrarManaEnemigo(c1.getP2());
					System.out.println(" ");

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p1);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p1.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p1.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h1 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p1.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h1.getCosteMana() > p1.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h1 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h1 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h1 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}
					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					do {
						comprobacion = 0;

						Vista.opcionesCombate(p2);

						opcion = Leer.datoInt();

						switch (opcion) {
						case 1:

							if (p2.getE().getNombreElemento().equals("Fuego")) {
								Vista.fuegoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesFuego()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Agua")) {
								Vista.aguaHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAgua()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Tierra")) {
								Vista.tierraHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesTierra()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Hielo")) {
								Vista.hieloHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesHielo()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Aire")) {
								Vista.aireHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesAire()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Electrico")) {
								Vista.electHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesElec()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							} else if (p2.getE().getNombreElemento().equals("Veneno")) {
								Vista.venenoHabilidad();

								opcHabilidad = Leer.datoInt() - 1;
								// Sacar habilidad con la posición de opcHabilidad.
								h2 = bd.getHabilidadesVen()[opcHabilidad];

								if (opcHabilidad == 3 && p2.getContCurar() >= 2) {
									Vista.errorCura();
									comprobacion = 1;
								}
								if (h2.getCosteMana() > p2.getMana()) {
									Vista.errorMana();
									comprobacion = 1;
								}

							}

							break;

						case 2:
							Vista.direccion();
							opcion = Leer.datoInt();
							if (opcion == 0) {
								h2 = bd.getHabilidadesComunes()[0];
							} else if (opcion == 1) {
								h2 = bd.getHabilidadesComunes()[1];
							}
							opcion = 1;
							// TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a
							// Antonio
							break;

						case 3:
							h2 = bd.getHabilidadesComunes()[2];
							break;

						default:
							Vista.numero1al3();
							break;
						}

					} while (comprobacion == 1 || opcion > 3 || opcion < 1);
					comprobacion = 0;

					CrudCombate.actualizarCombate(c1, contCombate, h1, h2);

					if (p1.getSalud() <= 0) {
						p1 = CrudPersonaje.actualizarMuerte(c1.getP1());
					}

					if (p2.getSalud() <= 0) {
						p2 = CrudPersonaje.actualizarMuerte(c1.getP2());
					}

				} while (p1.isMuerte() == false && p2.isMuerte() == false);

				opcion = 0;

				if (p1.isMuerte() == true) {
					Vista.gameOver();
					Vista.introduceNumero();
					comprobacion = Leer.datoInt();
					comprobacion = 0;
					break;
				}

				Vista.despuesAlvaro();
				Vista.victoria();
				Vista.introduceNumero();
				comprobacion = Leer.datoInt();
				comprobacion = 0;

				// Break del case 2 (Jugar)
				break;

			case 3:

				Vista.despedida(nickName);

				break;

			}

		} while (opcion != opcExit);

	}

}
