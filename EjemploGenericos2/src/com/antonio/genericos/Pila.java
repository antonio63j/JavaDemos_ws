package com.antonio.genericos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pila<T> implements Iterable<T> {
    
	private List<T> lista = new ArrayList<>();
	private int items = 0;
	
	public Pila() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void add (T t){
		lista.add(t);
		items++;
	}

	public T get(){
		if(items>0)
		  return lista.remove(--items);
		else return null;
    }
	
	public List<T> getLista (){
		return lista;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}

	@Override
	public String toString() {
		return "Pila [lista=" + lista + ", items=" + items + "]";
	}


}
