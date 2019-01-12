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
   
   public static int curarP2(Combate c1, Habilidad h1) {
	   c1.getP2().setMana(c1.getP2().getMana() - h1.getCosteMana());
	   c1.getP2().setContCurar(c1.getP2().getContCurar() + 1);
	   return h1.getPotencia();
   }   
   
   public static Combate descansarP1(Combate c1, Habilidad h1) {
	   c1.getP1().setMana(c1.getP1().getMana() + h1.getPotencia());
	   return c1;
   }
   
   public static Combate descansarP2(Combate c1, Habilidad h1) {
	   c1.getP2().setMana(c1.getP2().getMana() + h1.getPotencia());
	   return c1;
   }
   
   public static Combate danarP1(Combate c1, int dano) {
	   c1.getP1().setSalud(c1.getP1().getSalud() - dano);
	   return c1;
   }
   
   public static Combate danarP2(Combate c1, int dano) {
	   c1.getP2().setSalud(c1.getP2().getSalud() - dano);
	   return c1;
   }
   
   

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

		if (c1.getP1().getSalud() > 640 && c1.getP1().getSalud() <= 800) {

			Vista.barraVida100();

		} else if (c1.getP1().getSalud() > 480 && c1.getP1().getSalud() <= 640) {

			Vista.barraVida80();

		} else if (c1.getP1().getSalud() > 320 && c1.getP1().getSalud() <= 480) {

			Vista.barraVida60();

		} else if (c1.getP1().getSalud() > 160 && c1.getP1().getSalud() <= 320) {

			Vista.barraVida40();

		} else if (c1.getP1().getSalud() > 80 && c1.getP1().getSalud() <= 160) {

			Vista.barraVida20();

		} else if (c1.getP1().getSalud() > 0 && c1.getP1().getSalud() <= 80) {

			Vista.barraVida10();

		}
	}

	public static void mostrarVidaP2(Combate c1) {

		if (c1.getP2().isMuerte()) {

			Vista.personajeMuerto();
		}

		if (c1.getP2().getSalud() > 160 && c1.getP2().getSalud() <= 200) {

			Vista.barraVida100();

		} else if (c1.getP2().getSalud() > 120 && c1.getP2().getSalud() <= 160) {

			Vista.barraVida80();

		} else if (c1.getP2().getSalud() > 80 && c1.getP2().getSalud() <= 120) {

			Vista.barraVida60();

		} else if (c1.getP2().getSalud() > 40 && c1.getP2().getSalud() <= 80) {

			Vista.barraVida40();

		} else if (c1.getP2().getSalud() > 20 && c1.getP2().getSalud() <= 40) {

			Vista.barraVida20();

		} else if (c1.getP2().getSalud() > 0 && c1.getP2().getSalud() <= 20) {

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
