public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Cliente cliente1 = new Cliente();
        cliente1.edad = 100;
        cliente1.nombre = "Juanito el viejo";
        cliente1.telefono = 123456789;
        cliente1.credito =  1;
        System.out.println(cliente1.nombre);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);
        System.out.println(cliente1.edad);

        System.out.println("--------------------Cambio a ejercicio 2 -----------");

        Trabajador trabajador1 = new Trabajador();
        trabajador1.sueldo = 100;
        System.out.println(trabajador1.sueldo);







    }
}

class Persona{
    public int edad;
    public String nombre;
    public long telefono;
}


class Cliente extends Persona{
    public int credito;   
}

class Trabajador extends Persona{
    public int sueldo;
}












