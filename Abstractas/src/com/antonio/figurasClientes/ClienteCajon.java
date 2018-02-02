package com.antonio.figurasClientes;
import java.util.Iterator;

import com.antonio.figuras.containers.FiguraCajon;
import com.antonio.figuras.*;

public class ClienteCajon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangulo r1 = new Rectangulo (2,5);
		Rectangulo r2 = new Rectangulo (2,15);
		Triangulo t1 = new Triangulo (3,10);
        
		FiguraCajon<FiguraAbstracta> fc = new FiguraCajon<FiguraAbstracta>();
		fc.add(r1);
		fc.add(r2);
		fc.add(t1);
		
		System.out.println("inicio =" + FiguraAbstracta.inicio + " promedio =" +  fc.promedio());
		
		double areatotal = 0;
		Iterator<FiguraAbstracta> it = fc.iterator();
		while (it.hasNext()){
			areatotal = areatotal + it.next().area();
			
		}
		System.out.println("Total area = "+ areatotal );
		
		
	}
}
