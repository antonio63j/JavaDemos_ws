package com.antonio.test;

import com.antonio.genericos.Bolsa;

public class ClienteBolsa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Bolsa <Number> bolsaint = new Bolsa<>();
			bolsaint.add(new Integer(3));
			bolsaint.add(new Double(2.55));
			bolsaint.add(new Integer(1));
			
			for (Number p : bolsaint){
				System.out.println(p.toString());
			}
		}
		System.out.println ("fin ClienteBolsa");
        Runtime garbage = Runtime.getRuntime();
        garbage.gc();
	}

}
