package com.antonio.figuras;

public class Triangulo extends FiguraAbstracta{
	private long base;
	private long altura;
	
	public Triangulo (long b, long a ){
		super();
		this.base = b;
		this.altura = a;
	}
	
	public double area (){
		return base * altura / 2;
	}

}
