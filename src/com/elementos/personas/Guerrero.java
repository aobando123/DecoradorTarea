package com.elementos.personas;

import java.util.ArrayList;

import com.elementos.objetos.DecoradorObjetos;

public class Guerrero extends DecoradorPersonas{

	public Guerrero() {
		listaEquipo = new ArrayList<DecoradorObjetos>();
		this.vida = 20;
		this.ataque = 30;
		this.defensa =30;
		this.magia = 20;
		this.nombre = "Guerrero";
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
