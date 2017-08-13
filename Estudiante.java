
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante extends Persona
{
    private String Carrera;
    private String Matricula;
    
    public Estudiante () {
    }
    
    public void setCarrera (String Carrera){
        this.Carrera = Carrera;
         System.out.println ("Esta haciendo la carrera de Ingenieria de Sistemas");;
            }
    public void setMatricula (String Matricula){
        this.Matricula = Matricula;
        System.out.println ("Se matriculo en Diplomado de Gerencia de proyectos");;
    }
        
    public void Estudiar (String Nombre) {
        System.out.println (Nombre + " Está estudiando en clase" );;
    }
    public void Hacer_examen (String Nombre) {
        System.out.println (Nombre + " Está haciendo el examen en clase" );;
    }
    
    public String getCarrera () {
       return Carrera;
    }
    public String getMatricula () {
        return Matricula;  
     
    }
}
