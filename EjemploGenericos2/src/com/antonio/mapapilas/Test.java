package com.antonio.mapapilas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.antonio.genericos.Pila;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
    public void test1(){
    	Map<Integer, Pila<String>> m = new HashMap<>();
    	Pila<String> p1 = new Pila();
    	p1.add("uno");
    	p1.add("dos");
    	
    	Pila<String> p2 = new Pila();
    	p2.add("123");
    	p2.add("456");
    	p2.add("789");
    	
    	m.put(1, p1);
    	m.put(2, p2);
    	m.put(3, new Pila ());
    	
    	p2.get();
    	p2.get();
    	
    	for (Entry<Integer, Pila<String>> entry : m.entrySet())
    	{
    	    System.out.println(entry.getKey() + "/" + entry.getValue());
    	}

    	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.test1();

	}

}
