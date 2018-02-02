/**
 * 
 */
package com.antonio.profesores;

/**
 * @author aflucena
 *
 */
public class ProfesorTitular extends Profesor {

	/* (non-Javadoc)
	 * @see com.antonio.profesores.Profesor#sitLaboral()
	 */
    // Constructor ejemplo aprenderaprogramar.com
    public ProfesorTitular(String nombre, String apellidos, int edad, String id) {
     super(nombre, apellidos, edad, id); }
    public float importeNomina () { return 1000f; }  //Método abstracto sobreescrito en esta clase	
	
	@Override
	public String sitLaboral() {
		// TODO Auto-generated method stub
		return "Titular";
	}



}
