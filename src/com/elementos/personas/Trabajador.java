package com.elementos.personas;

import java.util.ArrayList;

import com.elementos.objetos.Amuleto;
import com.elementos.objetos.DecoradorObjetos;

public class Trabajador extends DecoradorPersonas{

	public Trabajador() {
		listaEquipo = new ArrayList<DecoradorObjetos>();
		this.vida = 25;
		this.ataque = 10;
		this.defensa =10;
		this.magia = 10;
		this.nombre = "Trabajador";
	}

	@Override
	public void calcularStats() {
		for (DecoradorObjetos objeto : listaEquipo) {
			ataqueEquipo += objeto.getAtaque();
			vidaEquipo += objeto.getVida();
			defensaEquipo += objeto.getDefensa();
			if(!(objeto instanceof Amuleto)) {
				magiaEquipo += objeto.getMagia();
			}
			
			equipo += " con " + objeto.getNombre() + ", ";
		}
	}

}
