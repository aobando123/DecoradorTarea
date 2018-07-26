package com.elementos.personas;

import java.util.ArrayList;

import com.elementos.objetos.DecoradorObjetos;

public class Mago extends DecoradorPersonas{

	public Mago() {
		listaEquipo = new ArrayList<DecoradorObjetos>();
		this.vida = 8;
		this.ataque = 15;
		this.defensa =15;
		this.magia = 40;
		this.nombre = "Mago";
	}

	

	@Override
	public void calcularStats() {
		for (DecoradorObjetos objeto : listaEquipo) {
			ataqueEquipo += objeto.getAtaque();
			vidaEquipo += objeto.getVida();
			defensaEquipo += objeto.getDefensa();
			magiaEquipo += objeto.getMagia();
			equipo += " con " + objeto.getNombre() + ", ";
		}
		
		
	}

}
