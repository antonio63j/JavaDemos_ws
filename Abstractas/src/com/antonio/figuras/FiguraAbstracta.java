package com.antonio.figuras;

import java.util.ArrayList;

public abstract class FiguraAbstracta {
	public static final int inicio = 1;
	
	public abstract double area();
	
	public static double promedio (ArrayList<FiguraAbstracta> arl){
		double prom = 0;
		if (arl.isEmpty()){
			return 0;
		}
		for (FiguraAbstracta f : arl){
			prom = prom + f.area();
		}
		return prom / arl.size();
	}
	
	@Override
	public String toString (){
		return "area =" + area();
	}
  
}
