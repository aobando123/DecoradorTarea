package com.elementos.personas;

import java.util.List;

import com.elementos.Elemento;
import com.elementos.objetos.Amuleto;
import com.elementos.objetos.DecoradorObjetos;

public abstract class DecoradorPersonas extends Elemento{
	
	protected List<DecoradorObjetos> listaEquipo;
	
	protected int ataqueEquipo = 0;
	protected int vidaEquipo =0;
	protected int defensaEquipo = 0;
	protected int magiaEquipo = 0;
	protected String equipo = "";
	
	public abstract void calcularStats ();
	
	
	
	@Override
	public String toString() {
		
		calcularStats();
		int sVida = this.vida + vidaEquipo ;
		int sAtaque = this.ataque + ataqueEquipo;
		int sDefensa = this.defensa + defensaEquipo;
		int sMagia = this.magia + magiaEquipo;
		return getNombre() + "\n" + "Stats: \n" +"-------------- \n" +
				"Vida: " + sVida + ", \n" +
				"Ataque: " + sAtaque  + ", \n" +
				"Defensa: " + sDefensa + ", \n" +
				"Magia : " + sMagia + ", \n" + 
				"Equipo: \n" +  "-------------- \n" +
				equipo;
	}



	public  void agregarEquipo(DecoradorObjetos objeto) {
		boolean isAmuletoEquipado = false;
		for (DecoradorObjetos objetos : listaEquipo) {
			if(objeto instanceof Amuleto) {
				isAmuletoEquipado = true;
			}
			
		}
		if(!isAmuletoEquipado) {
			listaEquipo.add(objeto);
		}
		
	};
	

}
