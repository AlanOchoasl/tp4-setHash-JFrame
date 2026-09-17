
package tp4laboratorio;

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
    
    @Override
   public boolean equals(Object o){
       if(this==o) return true;
       if(o==null || getClass() != o.getClass())return false;
       Materia materia=(Materia)o;
       return idMateria== materia.idMateria;
   }
    @Override
   public int hashCode(){
       return java.util.Objects.hash(idMateria);
       
   }
    
    
    
    
}

