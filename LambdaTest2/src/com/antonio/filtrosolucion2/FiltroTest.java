package com.antonio.filtrosolucion2;

import java.util.ArrayList;
import java.util.List;

import com.antonio.articulos.*;
import com.antonio.articulosinterfaces.CamisaPredicate;

public class FiltroTest {
	
	public static List<Camisa> filtrar(List<Camisa>  inv,
		     CamisaPredicate predicado) {  List<Camisa> sub = new ArrayList<>();
		     for(Camisa camisa:  inv){
		     if( predicado.test(camisa) )  { 
		sub.add(camisa); 
		} 
		     } 
		     return sub;
		     } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camisa c1 = new Camisa ("rojo", "XL");
		Camisa c2= new Camisa ("verde", "XXL");
		Camisa c3 = new Camisa ("rojo", "XXL");

		List<Camisa> lc = new ArrayList<>();
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		
		CamisaRojaPredicate cRojaP = new CamisaRojaPredicate();
		CamisaXLPredicate cXLP = new CamisaXLPredicate();
		
		List<Camisa> lcfiltrada = filtrar(lc, cRojaP);
		List<Camisa> lcfiltrada2 = filtrar(lcfiltrada, cXLP);
		for (Camisa c : lcfiltrada2) {
			System.out.println(c.toString());
		}
		

	}

}
