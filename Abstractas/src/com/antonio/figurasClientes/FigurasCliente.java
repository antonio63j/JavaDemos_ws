package com.antonio.figurasClientes;


/*
 * Rectangulo y Triangulo extienden la clase abstracta FiguraAbstracta, que debe ser 
 * abstracta porque tiene el método area (particuar para cada instanciación de Figura)
 * 
 * 
 */
import java.util.ArrayList;
import com.antonio.figuras.*;
public class FigurasCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo (2,5);
		Rectangulo r2 = new Rectangulo (2,15);
		Triangulo t1 = new Triangulo (3,10);
        
		ArrayList <FiguraAbstracta> f = new ArrayList <FiguraAbstracta> ();
		f.add(r1);
		f.add(r2);
		f.add(t1);
		System.out.println("Promedio ="+ FiguraAbstracta.promedio(f));
		
	}

}
