package com.antonio.genericos;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class CajonNumeros <T> implements Iterable<T>{

	private List<T> lista= new ArrayList<T>();
	private int tope;
	 
	public CajonNumeros(int tope) {
		super();
		this.tope = tope;
	}
  
	public List<T> getList (){
		return this.lista;
	}

	public void add(T objeto ) {
		if (lista.size()<=tope) {
		 
			lista.add(objeto);
		}else {
		 
			throw new RuntimeException("no caben mas");
		}
		 
	}

	public void addList(List<? extends T> objetos ) {
		
		for (T t : objetos){
			this.add(t); 
			
		}
	}	
		
	public void addCajon(CajonNumeros <? extends T> cajon){
       this.addList(cajon.getList());		
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
