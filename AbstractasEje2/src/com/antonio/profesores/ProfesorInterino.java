/**
 * 
 */
package com.antonio.profesores;

import java.util.Calendar;

/**
 * @author aflucena
 *
 */
public class ProfesorInterino extends Profesor {

	/* (non-Javadoc)
	 * @see com.antonio.profesores.Profesor#sitLaboral()
	 */
	
	private Calendar fechaComienzoInterinidad;
	
	// Constructores
    public ProfesorInterino (Calendar fechaInicioInterinidad) {
        super();      fechaComienzoInterinidad = fechaInicioInterinidad; }
    
    public ProfesorInterino (String nombre, String apellidos, int edad, String id, Calendar fechaInicioInterinidad) {
                super(nombre, apellidos, edad, id);
        fechaComienzoInterinidad = fechaInicioInterinidad; 
    }
    
    @Override
    public String getDatos() {
        return (super.getDatos() + " -fecha: " + fechaComienzoInterinidad.getTime().toString());
    }
	
    @Override
	public String sitLaboral() {
		// TODO Auto-generated method stub
		return "Interino";
	}

	/* (non-Javadoc)
	 * @see com.antonio.profesores.Profesor#importeNomina()
	 */


    public Calendar getFechaComienzoInterinidad () { return fechaComienzoInterinidad; } //Método
    public String toString () { // Sobreescritura del método
       return super.toString().concat (" Fecha comienzo interinidad: ").concat (fechaComienzoInterinidad.getTime().toString()); }
    public float importeNomina () { return 100f ; } //Método abstracto sobreescrito en esta clase
}
