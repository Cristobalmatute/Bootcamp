import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Persona persona1 = new Persona();
        persona1.setEdad(15);
        persona1.setNombre("Carlitos");
        persona1.setTelefono(12345678);
        System.out.println(persona1.getEdad()); 
        System.out.println(persona1.getNombre()); 
        System.out.println(persona1.getTelefono()); 



    }


}
class Persona{
    private int edad;
    private String nombre;
    private long telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(long telefono){
        this.telefono = telefono;
    }

    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public long getTelefono(){
        return this.telefono;
    }

}