package com.antonio.test;

import com.antonio.genericos.CajonNumeros;

public class ClienteCajonNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			CajonNumeros <Number> cajonNumeros = new CajonNumeros<Number>(10);
            cajonNumeros.add(new Integer(3));
			
            CajonNumeros<Integer> cajonNumeros2 = new CajonNumeros<Integer>(4);
            cajonNumeros2.add(new Integer(4));
            cajonNumeros2.add(new Integer(5));
            
            CajonNumeros<Double> cajonNumeros3 = new CajonNumeros<Double>(4);
            cajonNumeros3.add(new Double(6.5));
            
           
            cajonNumeros.addCajon(cajonNumeros2);
            cajonNumeros.addCajon(cajonNumeros3);
			
			for (Number p : cajonNumeros){
				System.out.println(p.toString());
			}
		}

        Runtime garbage = Runtime.getRuntime();
        garbage.gc();
	}

}
