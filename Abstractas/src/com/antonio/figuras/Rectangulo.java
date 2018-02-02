package com.antonio.figuras;

public class Rectangulo extends FiguraAbstracta{
	private long base;
	private long altura;
	
	public Rectangulo (long b, long a ){
		super();
		this.base = b;
		this.altura = a;
	}
	
	public double area (){
		return base * altura;
	}

}


