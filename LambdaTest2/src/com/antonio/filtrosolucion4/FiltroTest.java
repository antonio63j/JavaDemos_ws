package com.antonio.filtrosolucion4;

import java.util.ArrayList;
import java.util.List;

import com.antonio.articulos.*;
import com.antonio.articulosinterfaces.CamisaPredicate;

public class FiltroTest {
	
	public static List<Camisa> filtrar (List<Camisa>  inv,
		     CamisaPredicate predicado) {  List<Camisa> sub = new ArrayList<>();
		     for(Camisa camisa:  inv){
		     if( predicado.test(camisa) )  { 
		sub.add(camisa); 
		} 
		     } 
		     return sub;
		     } 
	

	public static void main(String[] args) {
		Camisa c1 = new Camisa ("rojo", "XL");
		Camisa c2= new Camisa ("verde", "XXL");
		Camisa c3 = new Camisa ("rojo", "XXL");
		Camisa c4 = new Camisa ("rojo", "XL");


		List<Camisa> lc = new ArrayList<>();
		lc.add(c1);
		lc.add(c2);
		lc.add(c3);
		lc.add(c4);
		
        
		List<Camisa> lcr = filtrar(lc,
				(Camisa camisa) -> "rojo".equals(camisa.getColor())
	    );			
		

		List<Camisa> camisasRojasXL  = filtrar(lcr,  
				(Camisa camisa) -> "XL".equals(camisa.getTalla())
		);	
		
		for (Camisa c : camisasRojasXL) {
				System.out.println(c.toString());
		}
			

	}

}
