package com.antonio.filtrosolucion2;

import com.antonio.articulos.Camisa;
import com.antonio.articulosinterfaces.CamisaPredicate;

public class CamisaRojaPredicate implements CamisaPredicate {

	@Override
	public boolean test(Camisa camisa) {
		return "rojo".equals(camisa.getColor());
	}

}
