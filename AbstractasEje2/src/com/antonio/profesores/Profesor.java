package com.antonio.profesores;



public abstract class Profesor extends Persona {
	
    // Campo de la clase ejemplo aprenderaprogramar.com
   private String IdProfesor; 
   
   public abstract String sitLaboral ();
   
   // Constructores
   public Profesor () { super();         IdProfesor = "Unknown";   } 
   public Profesor (String nombre, String apellidos, int edad, String id) { super(nombre, apellidos, edad);   IdProfesor = id; }
   // Métodos
   public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;   }
   public String getIdProfesor () { return IdProfesor;   }
   public String getDatos() {
       return (super.toString() + " -IdProfesor: " + IdProfesor + 
               " -sit. laboral: " + sitLaboral () );
   }
   
  
   abstract public float importeNomina ();  // Método abstracto
}
