package com.elementos.objetos;

import com.elementos.Elemento;

public abstract class DecoradorObjetos extends Elemento{

	 @Override
	public abstract String getNombre();
	public abstract int getVida();
	public abstract int getAtaque();
	public abstract int getDefensa();
	public abstract int getMagia();
	

}
