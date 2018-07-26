package creacionPersonajes;

import com.elementos.objetos.*;
import com.elementos.personas.*;

public class CreacionPersonajes {

	public CreacionPersonajes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//No se puede llevar mas de un amuleto
		Mago mage = new Mago();
		Amuleto furiaDeSindragosa = new Amuleto();
		System.out.println("Los stats del "+ mage.getNombre()+" actual son: \n" + mage.toString());
		
		mage.agregarEquipo(furiaDeSindragosa);
		mage.agregarEquipo(furiaDeSindragosa);
		System.out.println("Los stats del "+ mage.getNombre()+" con "+ furiaDeSindragosa.getNombre() +  " son: \n" + mage.toString());
		//Trabajador no le afecta amuleto
		Trabajador peon = new Trabajador();
		Armadura antifu = new Armadura();
		System.out.println("Los stats del "+ peon.getNombre()+" actual son: \n" + peon.toString());
		peon.agregarEquipo(furiaDeSindragosa);
		peon.agregarEquipo(antifu);
		System.out.println("Los stats del "+ peon.getNombre()+" con objetos son: \n" + peon.toString());
		
	}

}
