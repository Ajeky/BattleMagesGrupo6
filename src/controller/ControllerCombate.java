package controller;

import model.Combate;
import model.Personaje;

import com.sun.media.jfxmedia.control.VideoDataBuffer;

import datos.DatosElemento;
import model.Habilidad;
import vista.Vista;

public class ControllerCombate {
	
	//Atributos
	private Combate c1;
	private Personaje p1, p2;
	
	//Métodos

	Vista v1 = new Vista();
	
	//p1 ataca, p2 recibe el daño
	public void atacar(Personaje p1, Habilidad h1, Personaje p2, Habilidad h2) {
				
		int manaP1 = p1.getMana(), potenciaH1 = h1.getPotencia(), tipoH1 = h1.getTipo(), manaH1 = h1.getCosteMana(), saludP2 = p2.getSalud(), manaP2 = p2.getMana(), 
				potenciaH2 = h2.getPotencia(), tipoH2 = h2.getTipo(), manaH2 = h2.getCosteMana(), dano = 0;
		
		manaP1 -= manaH1;
		p1.setMana(manaP1);
		
		if (tipoH1 == 1 || tipoH1 == 2) {
			
			if (tipoH2 == 3) {

				manaP2 -= manaH2;
				p1.setMana(manaP2);
				
				dano = potenciaH1 - potenciaH2;
				
				if (dano < 0) {
					dano = 0;
				}
			} else {
				dano = potenciaH1;
			}
		} else {
			v1.habilidadIncorrecta();
		}
		saludP2 -= dano;
		p2.setSalud(saludP2);
		
	}

}
