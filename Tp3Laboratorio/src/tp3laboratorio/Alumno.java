
package tp3laboratorio;

import java.util.HashSet;
import java.util.HashMap;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <String> materias = new HashSet <> ();
    
    public Alumno (){
        
    }
    
    public Alumno (int legajo, String apellido, String nombre){
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }
    
    //Getters 
    public int getLegajo (int legajo){return legajo;}
    public String getApellido (String apellido){return apellido;}
    public String getNombre (String nombre){return nombre;}
    
    //Setters
    public void setLegajo (){this.legajo = legajo;}
    public void setApellido (){this.apellido = apellido;}
    public void setNombre (){this.nombre = nombre;}
    
    public void agregarMateria (){
        
    }
    
    public void cantidadMaterias (){
        
    }
}
