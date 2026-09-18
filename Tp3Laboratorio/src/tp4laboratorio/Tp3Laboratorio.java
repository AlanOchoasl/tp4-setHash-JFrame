//
package tp4laboratorio;

import GUI.Screen;

public class Tp3Laboratorio {

    public static void main(String[] args) {
        
        //interface
        Screen pantalla = new Screen ();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        
        //materias
        Materia materia1  = new Materia (101, "Web 2", 2);
        Materia materia2  = new Materia (102, "Matematicas", 1);
        Materia materia3  = new Materia (103, "Laboratorio 1", 1);
        
        //alumnos
        Alumno alumno1 = new Alumno (1001, "Lopez", "Martin");
        Alumno alumno2 = new Alumno (1002, "Martinez", "Brenda");
        
        alumno1.agregarMateria(materia1);
        alumno1.agregarMateria(materia2);
        alumno1.agregarMateria(materia3);
        
        alumno2.agregarMateria(materia1);
        alumno2.agregarMateria(materia2);
        alumno2.agregarMateria(materia3);
        alumno2.agregarMateria(materia3);
        
        System.out.println("Cantidad de materias de " + alumno1.getApellido() + ": " + alumno1.cantidadMaterias());
         System.out.println("Cantidad de materias de " + alumno2.getApellido() + ": " + alumno2.cantidadMaterias());
                
        
        
    }

}

