package principal;
//�___MANTENIMIENTO_________________________________________________________________________________________

import utilidades.Leer;
import model.Combate;
import crud.CrudPersonaje;
import model.Personaje;
import crud.CrudCombate;

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
		int opcion, opcExit = 3, contCombate =0 ;
		Combate c1;
		Personaje p1, p2;
		
		System.out.println("██████╗  █████╗ ████████╗████████╗██╗     ███████╗    ██████╗  ██████╗ ██╗   ██╗ █████╗ ██╗     \r\n" + 
				"██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝    ██╔══██╗██╔═══██╗╚██╗ ██╔╝██╔══██╗██║     \r\n" + 
				"██████╔╝███████║   ██║      ██║   ██║     █████╗      ██████╔╝██║   ██║ ╚████╔╝ ███████║██║     \r\n" + 
				"██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝      ██╔══██╗██║   ██║  ╚██╔╝  ██╔══██║██║     \r\n" + 
				"██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗    ██║  ██║╚██████╔╝   ██║   ██║  ██║███████╗\r\n" + 
				"╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝    ╚═╝  ╚═╝ ╚═════╝    ╚═╝   ╚═╝  ╚═╝╚══════╝\r\n" + 
				"                                                                                                \r\n" + 
				"    ███████╗██████╗ ███████╗██╗     ██╗         ██████╗ ██████╗ ███████╗ █████╗ ██╗  ██╗        \r\n" + 
				"    ██╔════╝██╔══██╗██╔════╝██║     ██║         ██╔══██╗██╔══██╗██╔════╝██╔══██╗██║ ██╔╝        \r\n" + 
				"    ███████╗██████╔╝█████╗  ██║     ██║         ██████╔╝██████╔╝█████╗  ███████║█████╔╝         \r\n" + 
				"    ╚════██║██╔═══╝ ██╔══╝  ██║     ██║         ██╔══██╗██╔══██╗██╔══╝  ██╔══██║██╔═██╗         \r\n" + 
				"    ███████║██║     ███████╗███████╗███████╗    ██████╔╝██║  ██║███████╗██║  ██║██║  ██╗        \r\n" + 
				"    ╚══════╝╚═╝     ╚══════╝╚══════╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝");
		
		System.out.println("            \\                                           ___/________\r\n" + 
				"\t       ___   )                    ,  @                    /    \\  \\\r\n" + 
				"\t    @___, \\ /                  @__\\  /\\              @___/      \\@/\r\n" + 
				"\t   /\\__,   |                  /\\_, \\/ /             /\\__/        |\r\n" + 
				"\t  / \\    / @\\                / \\   (               / \\ /        / \\\r\n" + 
				"\t_/__|___/___/_______________/__|____\\_____________/__/__________|__\\__\n\n");
		
		System.out.println("================================================================================================\n\n");
		
		System.out.println("Bienvenido , introduzca su nick de jugador : ");
		
		nickName = Leer.dato();
		
		
		do {
			
			System.out.println(" ██╗       ████████╗██╗   ██╗████████╗ ██████╗ ██████╗ ██╗ █████╗ ██╗     \r\n" + 
					"███║       ╚══██╔══╝██║   ██║╚══██╔══╝██╔═══██╗██╔══██╗██║██╔══██╗██║     \r\n" + 
					"╚██║          ██║   ██║   ██║   ██║   ██║   ██║██████╔╝██║███████║██║     \r\n" + 
					" ██║          ██║   ██║   ██║   ██║   ██║   ██║██╔══██╗██║██╔══██║██║     \r\n" + 
					" ██║██╗       ██║   ╚██████╔╝   ██║   ╚██████╔╝██║  ██║██║██║  ██║███████╗\r\n" + 
					" ╚═╝╚═╝       ╚═╝    ╚═════╝    ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝╚═╝  ╚═╝╚══════╝\r\n" + 
					"                                                                          \r\n" + 
					"██████╗             ██╗██╗   ██╗ ██████╗  █████╗ ██████╗                  \r\n" + 
					"╚════██╗            ██║██║   ██║██╔════╝ ██╔══██╗██╔══██╗                 \r\n" + 
					" █████╔╝            ██║██║   ██║██║  ███╗███████║██████╔╝                 \r\n" + 
					"██╔═══╝        ██   ██║██║   ██║██║   ██║██╔══██║██╔══██╗                 \r\n" + 
					"███████╗██╗    ╚█████╔╝╚██████╔╝╚██████╔╝██║  ██║██║  ██║                 \r\n" + 
					"╚══════╝╚═╝     ╚════╝  ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝                 \r\n" + 
					"                                                                          \r\n" + 
					"██████╗        ███████╗ █████╗ ██╗     ██╗██████╗                         \r\n" + 
					"╚════██╗       ██╔════╝██╔══██╗██║     ██║██╔══██╗                        \r\n" + 
					" █████╔╝       ███████╗███████║██║     ██║██████╔╝                        \r\n" + 
					" ╚═══██╗       ╚════██║██╔══██║██║     ██║██╔══██╗                        \r\n" + 
					"██████╔╝██╗    ███████║██║  ██║███████╗██║██║  ██║                        \r\n" + 
					"╚═════╝ ╚═╝    ╚══════╝╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝\n\n");
			
			System.out.println("================================================================================================\n\n");
			
			System.out.println("¿Qué desea hacer?");
			
			System.out.println("================================================================================================\n\n");
			
			opcion = Leer.datoInt();
			
			
			switch(opcion) {
			
			case 1 :
				
				System.out.println("Bienvenido al Tutorial , aquí podrás aprender las técnicas y habilidades de combate básicos para defenderte en"
						+ "el campo de batalla.\n");
				
				System.out.printf("Primero de todo , te presento a %s, es algo tímido pero cuando coge confianza ¡se vuelve loco! ."
						+ "Tu primer combate será contra él, un objetivo sencillo para coger la técnica, ¡que comience la pelea!.\n\n",iaName);
				
				
				break;
				
				
			case 2 :
				
				
				CrudCombate.crearCombate(p1, p2, contCombate);
				contCombate++;
								
				break;
				
			case 3 :
				
				
					System.out.printf("Gracias por utilizar nuestra app %s, hasta luego.\n\n",nickName);
				
				break;
			
			
			}
			
			
			
		}while(opcion != opcExit);
		

	}

}
