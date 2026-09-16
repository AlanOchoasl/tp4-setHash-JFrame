
package tp3laboratorio;

import GUI.Screen;

public class Tp3Laboratorio {

    public static void main(String[] args) {
        
        //interface
        Screen pantalla = new Screen ();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        
        //materias
        Materia materia1  = new Materia (123, "Web 2", 2);
        Materia materia2  = new Materia (123, "Matematicas", 1);
        Materia materia3  = new Materia (123, "Laboratorio 1", 1);
        
        //alumnos
        Alumno alumno1 = new Alumno (1001, "Lopez", "Martin");
        Alumno alumno2 = new Alumno (1002, "Martinez", "Brenda");
        
        
    }

}
