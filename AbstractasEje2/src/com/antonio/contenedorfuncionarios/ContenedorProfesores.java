
package com.antonio.contenedorfuncionarios;
import com.antonio.profesores.Profesor;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * @author aflucena
 *
 */
public class ContenedorProfesores<T> implements Iterable <T>{
	
	private ArrayList<T> lista = new ArrayList <T> ();
	
    
	
	public void add (T item ){
		lista.add(item);
	}
	
	public void listaProfesores (){
        Iterator <T> it = (Iterator<T>) lista.iterator();
        while (it.hasNext() ) { 
        	System.out.println(((Profesor) it.next()).getDatos());	
        }
	}
	
	
	public float importeTotalNominaProfesorado() {
        float importeTotal = 0f; //Variable temporal que usamos como auxiliar
        Iterator <T> it = (Iterator<T>) lista.iterator();
        while (it.hasNext() ) { importeTotal = importeTotal + ((Profesor) it.next()).importeNomina(); }
        return importeTotal;         
    }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return lista.iterator();
	}

}
