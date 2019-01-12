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

		String nickName, iaName = "BOT Francisco";
		String[][] campoBatalla;
		int opcion = 0, opcExit = 3, contCombate = 0, opcElemento, p2SaludBase = 200, p2ManaBase = 200, p1SaludBase = 800, p1ManaBase = 100, posInicial = 0,
				opcHabilidad = 0, uno = 1, comprobacion = 0, p1Mover = 2, p2Mover = 2, p1Descansar = 0, p2Descansar = 0;
		Combate c1;
		Personaje p1 = null, p2 = null;
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

			//Menú principal
			Vista.menuPrincipal();

			System.out.println(
					"================================================================================================\n");

			opcion = Leer.datoInt();
			System.out.println("");

			System.out.println(
					"================================================================================================\n\n");

			switch (opcion) {

			case 1:
				//Explicación de los elementos
				Vista.tutorial();

				//Elección del elemento
				Vista.opcionElementos();

				opcElemento = Leer.datoInt() - 1;

				// Creamos el primer jugador

				p1 = new Personaje(bd.getListaElementos()[opcElemento], nickName, p1SaludBase, p1ManaBase, posInicial, false, 0);

				// Segundo jugador

				p2 = new Personaje(bd.getListaElementos()[0], iaName, p2SaludBase, p2ManaBase, posInicial, false, 0);
				
				//Explicación combate y presentación del Bot Francisco
				Vista.tutorial2(p2);
				
				comprobacion = Leer.datoInt();

				// Creamos combate
				c1 = CrudCombate.crearCombate(p1, p2, bd, contCombate);

				// Ataque del primer jugador

				do {
					
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
					System.out.println("¿Qué deseas hacer?: \n1. Lanzar una habilidad\n2. Moverse\n3. Descansar");
					
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
						//TODO Comprobacion de limite de mapa? Demasiado complicado? Preguntar a Antonio
						break;
						
					case 3:
						h1 = bd.getHabilidadesComunes()[2];
						break;

					default:
						Vista.numero1al3();
						break;
					}
					}while(comprobacion == 1);

					h2 = bd.getHabilidadesFuego()[0];

					c1 = CrudCombate.actualizarCombate(c1, contCombate, h1, h2);
					
					if(p1.getSalud() <= 0) {
						p1 = CrudPersonaje.actualizarMuerte(c1.getP1());
					}
					
					if(p2.getSalud() <= 0) {
						p2 = CrudPersonaje.actualizarMuerte(c1.getP2());
					}
					
					

				} while (p2.isMuerte() == false && p1.isMuerte() == false);
				
				p1.setContCurar(0);
				p2.setContCurar(0);
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
