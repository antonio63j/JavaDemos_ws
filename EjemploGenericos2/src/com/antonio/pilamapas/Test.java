package com.antonio.pilamapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.antonio.genericos.Pila;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	

    public void test1(){
    	Pila<Map<Integer,String>> p = new Pila<>();
    	
    	Map<Integer, String> m0 = new HashMap<>();
    	m0.put(1, "Cadena1dem0");
    	m0.put(2, "Cadena2dem0");
    	m0.put(3, "Cadena2dem0");
    	
    	Map<Integer, String> m1 = new HashMap<>();
    	m1.put(1, "Cadena1dem1");
    	m1.put(2, "Cadena2dem1");
    	
    	Map<Integer, String> m2 = new HashMap<>();
    	m2.put(1, "Cadena1dem2");
    	
    	p.add(m0);
    	p.add(m1);
    	p.add(m2);
    	for(Map<Integer, String> m : p){
    		System.out.println( " mapa:" + m);
    	}
    	
    	for(Map<Integer, String> m : p){
        	for (Entry<Integer,String> entry : m.entrySet())
        	{
        	    System.out.println(entry.getKey() + "/" + entry.getValue());
        	}

    	}
    	
		Comparator<Map<Integer,String>> comparator = new Comparator<Map<Integer,String>>(){
			@Override
			public int compare(Map<Integer, String> o1, Map<Integer, String> o2) {
				return o1.size() - o2.size();
			}
	  	};
	  	
	  	Pila<Map<Integer,String>> pila = p;
	  	List<Map<Integer,String>> lista = pila.getLista();
	  	Collections.sort(lista, comparator); 
	  	for(Map<Integer, String> m : lista ){
	  		System.out.println("Mapa =" + m );
	  	}
    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.test1();

	}

}
