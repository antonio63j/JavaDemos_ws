package com.antonio.genericos;

import java.util.ArrayList;
import java.util.Iterator;
public class Bolsa <T> implements Iterable<T>{

	private ArrayList<T> lista= new ArrayList<T>();
	private Integer tope;
	 
	public Bolsa(int tope) {
		super();
		this.tope = new Integer (tope);
	}
	
	public Bolsa() {
		super();
		this.tope = null;
	}
	
	public void add(T objeto ) {
		if (tope != null){
		  if (lista.size()<=tope) {
		  	lista.add(objeto);
	      }else {
		    	throw new RuntimeException("no caben mas");
		        }
		} 
		else {
			lista.add(objeto);
		}	 
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println( "finalize() of " + this.getClass().getName());
		super.finalize();
	}
	
}
