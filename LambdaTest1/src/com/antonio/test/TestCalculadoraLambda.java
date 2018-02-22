package com.antonio.test;

public class TestCalculadoraLambda {
	ICalculadoraLambda iSuma = (x, y) -> x + y;
	ICalculadoraLambda iMultiplica = (x, y) -> x * y;
	
	public void test1 () {
		System.out.println("suma=" + iSuma.operacion (2, 2));
		System.out.println("multiplicacion=" + iMultiplica.operacion (2, 3));
	}
	
	
	public static void main(String[] args) {
      TestCalculadoraLambda c = new TestCalculadoraLambda();
	  c.test1();
	}
}
