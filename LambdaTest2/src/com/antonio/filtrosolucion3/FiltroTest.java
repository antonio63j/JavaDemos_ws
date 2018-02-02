package com.antonio.filtrosolucion3;

import java.util.ArrayList;
import java.util.List;

import com.antonio.articulos.*;
import com.antonio.articulosinterfaces.CamisaPredicate;

public class FiltroTest {
	
	public static List<Camisa> filtrar (List<Camisa>  inv,
		                                CamisaPredicate predicado) {
        List<Camisa> sub = new ArrayList<>();
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
		

		CamisaPredicate rojas  = new CamisaPredicate() {
			   public boolean test(Camisa camisa){
			   return "rojo".equals(camisa.getColor()); 
			   }
			   }; 
		CamisaPredicate camisasXL = new CamisaPredicate() {
			   public boolean test(Camisa camisa){
			   return "XL".equals(camisa.getTalla()); 
			   }
			   }; 

			List<Camisa> camisasRojasXL  = filtrar(filtrar(lc,  rojas), camisasXL);
			
			System.out.println("Camisas Rojas y XL");
			for (Camisa c : camisasRojasXL) {
				System.out.println(c.toString());
			}
			

	}

}
