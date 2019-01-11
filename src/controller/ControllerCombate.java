package controller;

import model.Combate;
import model.Personaje;
import model.Habilidad;
import vista.Vista;

public class ControllerCombate {
   private static String Fuego ="Fuego";
   private static  String Agua = "Agua",Tierra="Tierra",Hielo="Hielo",Aire="Aire",Electrico="Electrico",Veneno="Veneno";
	// Métodos

   public static int atacarP1(Combate c1, Habilidad h1) {
	   c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());
	   return h1.getPotencia();
   }
   
   public static int atacarP2(Combate c1, Habilidad h1) {
	   c1.getP2().setMana(c1.getP2().getMana() - h1.getCosteMana());
	   return h1.getPotencia();
   }
   
   public static int defenderP1(Combate c1, Habilidad h1) {
	   c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());
	   return h1.getPotencia();
   }
   
   public static int defenderP2(Combate c1, Habilidad h1) {
	   c1.getP2().setMana(c1.getP2().getMana() - h1.getCosteMana());
	   return h1.getPotencia();
   }
   
   public static int curarP1(Combate c1, Habilidad h1) {
	   c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());
	   c1.getP1().setContCurar(c1.getP1().getContCurar() + 1);
	   return h1.getPotencia();
   }
   
   
   //TODO 
   /*public static Personaje curar(Personaje p1) {
		
		if(p1.getE().getNombreElemento().equals(Fuego)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-40);
		}
		else if(p1.getE().getNombreElemento().equals(Agua)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-35);
		}
		else if(p1.getE().getNombreElemento().equals(Tierra)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-60);
		}
		else if(p1.getE().getNombreElemento().equals(Hielo)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-50);
		}
		else if(p1.getE().getNombreElemento().equals(Aire)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-10);
		}
		else if(p1.getE().getNombreElemento().equals(Electrico)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-35);
		}
		else if(p1.getE().getNombreElemento().equals(Veneno)){
			p1.setSalud(p1.getSalud()+50);
			p1.setMana(p1.getMana()-40);
		}
		p1.setContCurar(p1.getContCurar() + 1);
		return p1;
	} */
	/*public static Combate atacarP1(Combate c1, Habilidad h1, Habilidad h2, int contCombate) {

		int dano = 0;

		
		c1.getP1().setMana(c1.getP1().getMana() - h1.getCosteMana());

		if (h1.getTipo() == 1 || h1.getTipo() == 2) {

			if (h2.getTipo() == 3) {

				c1.getP2().setMana(c1.getP2().getMana() - h2.getCosteMana());

				dano = h1.getPotencia() - h2.getPotencia();

				if (dano < 0) {
					dano = 0;
				}
			} else {
				dano = h1.getPotencia();
			}
		} else {
			Vista.habilidadIncorrecta();
		}
		c1.getP2().setSalud(c1.getP2().getSalud() - dano);

		// Comprueba si alguno de los personajes han muerto

		if (c1.getP1().getSalud() <= 0) {
			c1.getP1().setMuerte(true);

		} else if (c1.getP2().getSalud() <= 0) {
			c1.getP2().setMuerte(true);
		}

		return c1;
	}*/

	public static Combate moverp1(Combate c1 ,int direccion) {

		if(direccion ==1) {
			if((c1.getP1().getPosicion()-c1.getP2().getPosicion())!=1) {
				c1.getP1().setPosicion(c1.getP1().getPosicion()+1);
			}
			else {
				//vista no se puede realizar esa orden
			}
		}
		else if(direccion==0){
			if(c1.getP1().getPosicion()>1) {
				c1.getP1().setPosicion(c1.getP1().getPosicion()-1);
			}

		}

		return c1;
	}
	public static Combate moverp2(Combate c1 ,int direccion) {
		
		if(direccion ==0) {
			if((c1.getP1().getPosicion()-c1.getP2().getPosicion())>1) {
				c1.getP2().setPosicion(c1.getP2().getPosicion()+1);
			}
			else {
				//vista no se puede realizar esa orden
			}
		}
		
		else if(direccion==1){
			if(c1.getP1().getPosicion()<c1.getCampoBatalla().length-1) {
				c1.getP1().setPosicion(c1.getP1().getPosicion()-1);
			}
		}
		else {
			//vista error
		}
		
		return c1;
	}
	
	
	
	

	public static void mostrarVidaP1(Combate c1) {

		if (c1.getP1().isMuerte()) {

			Vista.personajeMuerto();
		}

		if (c1.getP1().getSalud() > 80 && c1.getP1().getSalud() <= 100) {

			Vista.barraVida100();

		} else if (c1.getP1().getSalud() > 60 && c1.getP1().getSalud() <= 80) {

			Vista.barraVida80();

		} else if (c1.getP1().getSalud() > 40 && c1.getP1().getSalud() <= 60) {

			Vista.barraVida60();

		} else if (c1.getP1().getSalud() > 20 && c1.getP1().getSalud() <= 40) {

			Vista.barraVida40();

		} else if (c1.getP1().getSalud() > 10 && c1.getP1().getSalud() <= 20) {

			Vista.barraVida20();

		} else if (c1.getP1().getSalud() > 0 && c1.getP1().getSalud() <= 10) {

			Vista.barraVida10();

		}
	}

	public static void mostrarVidaP2(Combate c1) {

		if (c1.getP2().isMuerte()) {

			Vista.personajeMuerto();
		}

		if (c1.getP2().getSalud() > 80 && c1.getP2().getSalud() <= 100) {

			Vista.barraVida100();

		} else if (c1.getP2().getSalud() > 60 && c1.getP2().getSalud() <= 80) {

			Vista.barraVida80();

		} else if (c1.getP2().getSalud() > 40 && c1.getP2().getSalud() <= 60) {

			Vista.barraVida60();

		} else if (c1.getP2().getSalud() > 20 && c1.getP2().getSalud() <= 40) {

			Vista.barraVida40();

		} else if (c1.getP2().getSalud() > 10 && c1.getP2().getSalud() <= 20) {

			Vista.barraVida20();

		} else if (c1.getP2().getSalud() > 0 && c1.getP2().getSalud() <= 10) {

			Vista.barraVida10();

		}
	}

	public static void mostrarManaP1(Combate c1) {

		if (c1.getP1().getMana() > 80 && c1.getP1().getMana() <= 100) {

			Vista.barraMana100();

		} else if (c1.getP1().getMana() > 60 && c1.getP1().getMana() <= 80) {

			Vista.barraMana80();

		} else if (c1.getP1().getMana() > 40 && c1.getP1().getMana() <= 60) {

			Vista.barraMana60();

		} else if (c1.getP1().getMana() > 20 && c1.getP1().getMana() <= 40) {

			Vista.barraMana40();

		} else if (c1.getP1().getMana() > 10 && c1.getP1().getMana() <= 20) {

			Vista.barraMana20();

		} else if (c1.getP1().getMana() > 0 && c1.getP1().getMana() <= 10) {

			Vista.barraMana10();

		}
	}

	public static void mostrarManaP2(Combate c1) {

		if (c1.getP2().getMana() > 80 && c1.getP2().getMana() <= 100) {

			Vista.barraMana100();

		} else if (c1.getP2().getMana() > 60 && c1.getP2().getMana() <= 80) {

			Vista.barraMana80();

		} else if (c1.getP2().getMana() > 40 && c1.getP2().getMana() <= 60) {

			Vista.barraMana60();

		} else if (c1.getP2().getMana() > 20 && c1.getP2().getMana() <= 40) {

			Vista.barraMana40();

		} else if (c1.getP2().getMana() > 10 && c1.getP2().getMana() <= 20) {

			Vista.barraMana20();

		} else if (c1.getP2().getMana() > 0 && c1.getP2().getMana() <= 10) {

			Vista.barraMana10();

		}
	}
	
	public static void comprobarCura(Personaje p1) {
		if (p1.getContCurar() > 2) {
			Vista.errorCura();
		}
	}

}
