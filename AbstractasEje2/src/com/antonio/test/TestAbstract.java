package com.antonio.test;


import java.util.Calendar;

import com.antonio.contenedorfuncionarios.*;
import com.antonio.profesores.*;


public class TestAbstract {

	public TestAbstract() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2012,10,22); //Los meses van de 0 a 11, luego 10 representa noviembre
        ProfesorInterino pi1 = new ProfesorInterino("Jos�", "Hern�ndez L�pez", 45, "45221887-K", fecha1);
        ProfesorInterino pi2 = new ProfesorInterino("Andr�s", "Molt� Parra", 87, "72332634-L", fecha1);
        ProfesorInterino pi3 = new ProfesorInterino ("Jos�", "R�os Mesa", 76, "34998128-M", fecha1);
        ProfesorTitular pt1 = new ProfesorTitular ("Juan", "P�rez P�rez", 23, "73-K");
        ProfesorTitular pt2 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "88-L");
        ProfesorTitular pt3 = new ProfesorTitular ("Alberto", "Centa Mota", 49, "81-F");
 
        ContenedorProfesores <Profesor> fc = new ContenedorProfesores<Profesor>();
        
        fc.add(pi1); fc.add(pi2); fc.add(pi3);
        fc.add(pt1); fc.add(pt2); fc.add(pt3);
		
        fc.listaProfesores();
        
        System.out.println("- TotalNominas: " + fc.importeTotalNominaProfesorado());

	}

}
