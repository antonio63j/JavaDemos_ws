/**
 * 
 */
package com.antonio.test;

/**
 * @author Antonio
 *
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public final class ListaPersonas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   ArrayList<Persona> milista = new ArrayList <Persona>();
	   milista.add(new Persona ("Ana"));
	   milista.add(new Persona ("Luis"));
	   milista.add(new Persona ("Carlos"));
	   // creacion objeto mediante clase anonima
	   Collections.sort(milista, new Comparator<Persona> () {
		   public int compare(Persona p1, Persona p2){
			   return p1.getName().compareTo(p2.getName());
		   }
	   });
	   
	   for (Persona p : milista){
		   System.out.println (p.getName());
	   }
	   
	}

}
