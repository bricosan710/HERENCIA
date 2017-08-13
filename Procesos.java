
/**
 * Write a description of class Procesos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Procesos
{
    public void iniciar () {
        Persona profesor = new Persona ();
        profesor.setNombre ("William");
        profesor.Dormir(profesor.getNombre());
        profesor.Comer();
        profesor.setEdad ("William");
        
              
    System.out.println ();
    
        Estudiante Ingeniero = new Estudiante ();
        Ingeniero.setNombre ("Jesus");
        Ingeniero.setEdad ("Jesus");
        Ingeniero.Dormir (Ingeniero.getNombre());
        Ingeniero.Comer ();
        Ingeniero.setCarrera ("Jesus");
        Ingeniero.setMatricula ("Jesus");
        Ingeniero.Estudiar (Ingeniero.getNombre());
        Ingeniero.Hacer_examen (Ingeniero.getNombre());
        
      
    }
}

