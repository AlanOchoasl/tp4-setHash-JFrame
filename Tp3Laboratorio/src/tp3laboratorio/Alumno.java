
package tp3laboratorio;

import java.util.HashSet;
import java.util.HashMap;

public class Alumno {

    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet <Materia> materias = new HashSet <> ();
    
    public Alumno (){
        
    }
    
    public Alumno (int legajo, String apellido, String nombre){
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        
    }
    
    //Getters 
    public int getLegajo (){return legajo;}
    public String getApellido (){return apellido;}
    public String getNombre (){return nombre;}
    
    //Setters
    public void setLegajo (int legajo){this.legajo = legajo;}
    public void setApellido (String apellido){this.apellido = apellido;}
    public void setNombre (String nombre){this.nombre = nombre;}
    
    public void agregarMateria (Materia materia){
        
       materias.add(materia);
        
    }
    
    public int cantidadMaterias (){
        
        int cantMaterias = materias.size();
        
        return cantMaterias;
        
        
    }
}
