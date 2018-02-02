package com.antonio.filtrosolucion1;

import java.util.ArrayList;
import java.util.List;

import com.antonio.articulos.*;
public class FiltroTest {
	
	public static List<Camisa> filtrar(List<Camisa>  inv, String color, String talla) {
		 List<Camisa> sub  = new ArrayList<>();
		 for(Camisa camisa:  inv){
		 if( (camisa.getColor().equals(color))  && (camisa.getTalla().equals(talla))  ) 
		{ 
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
		
		List<Camisa> lcfiltrada = filtrar(lc, "rojo", "XL");
		for (Camisa c : lcfiltrada) {
			System.out.println(c.toString());
		}
		
		

	}

}
