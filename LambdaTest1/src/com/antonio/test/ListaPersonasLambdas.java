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

public class ListaPersonasLambdas {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   ArrayList<Persona> milista = new ArrayList <Persona>();
	   milista.add(new Persona ("Ana"));
	   milista.add(new Persona ("Luis David"));
	   milista.add(new Persona ("Carlos"));
	   
	   Collections.sort(milista, 
			           (Persona p1, Persona p2) -> p1.getName().compareTo(p2.getName())
			           );
	   // equivalente a :
/*	   Collections.sort(milista, new Comparator<Persona> () {
		   public int compare(Persona p1, Persona p2){
			   return p1.getName().compareTo(p2.getName());
		   }
	   });*/
	   
	
	   for (Persona p : milista) {
		   System.out.println(p.getName());
	   }
	}

}
