/**
 * 
 */
package com.antonio.figuras.containers;

import com.antonio.figuras.*;

import java.util.Iterator;
import java.util.ArrayList;
/**
 * @author aflucena
 *
 */
public class FiguraCajon <T> implements Iterable<T>{
   
   private ArrayList<T> lista = new ArrayList <T> ();
   
   public FiguraCajon (){
	   super();
   }
   
   public void add (T item){
	   lista.add(item);   
   }
   
   public double promedio (){
		double prom = 0;
		if (lista.isEmpty()){
			return 0;
		}
		
		/*
		for test
		
		for (T item:lista){
			prom = ((FiguraAbstracta)item).area() + prom;
		}
        */
		
		Iterator <T> it = (Iterator<T>) lista.iterator();
		while (it.hasNext()){
			prom = ((FiguraAbstracta) it.next()).area() + prom;
		}
		
		return  prom / lista.size();
   }
 
	@Override
	public Iterator<T> iterator() {
		return  lista.iterator();
	}
}
