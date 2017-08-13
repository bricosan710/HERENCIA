
/**
 * Write a description of class Persona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persona
{
   private String Nombre;
   private String Edad;
    
    public Persona () {
    }
    
    public void setNombre (String Nombre){
        this.Nombre = Nombre;
    }
    public void setEdad (String Edad) {
        this.Edad = Edad;
        System.out.println ( Nombre + " Tiene 27 de años") ;;
    }
    
    public void Dormir ( String Nombre ) {
        System.out.println ( Nombre+" Esta dormido en clase") ;;
    }
    public void Comer () {
        System.out.println ( Nombre+" Esta comiendo en clase") ;;
    }
        
    public String getNombre () {
       return Nombre;
    }
    public String getEdad () {
        return Edad;
    }
       
    }
