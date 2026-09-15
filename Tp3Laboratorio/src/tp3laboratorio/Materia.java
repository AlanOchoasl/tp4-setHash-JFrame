
package tp3laboratorio;

public class Materia {

    private int idMateria;
    private String nombre;
    private int anio;
    
    public Materia (){
        
    }
    
    public Materia (int idMateria, String nombre, int anio){
        
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
        
    }
    
    //getters
    public int getIdMateria (){return idMateria;}
    public String getNombre (){return nombre;}
    public int getAnio (){return anio;}
    
    //setters
    public void setIdMateria (int idMateria){this.idMateria = idMateria;}
    public void setNombre (String nombre){this.nombre = nombre;}
    public void setAnio (int anio){this.anio = anio;}
    
    
    
}
