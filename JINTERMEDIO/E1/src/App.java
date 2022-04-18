public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Las variables vistas fueron estas!");
        Persona personita = new Persona(100, "Hola", 100000000, 12.15d, false);
        personita.Imprimir();

    }
    
}

class Persona {

    int numeroInt;
    String palabra;
    long larguito;
    double doble;
    boolean binaria;

    public Persona (){
        // Constructor sin dar cosas
    }
    
    public Persona (int numeroInt, String palabra, long larguito, double doble, boolean binario){
        this.numeroInt = numeroInt;
        this.palabra = palabra;
        this.larguito = larguito;
        this.doble = doble;
        this.binaria = binario;
    }

    public void Imprimir(){
        System.out.println("La variable del tipo int son numeros enteros por ejemplo: " + this.numeroInt);
        System.out.println("La variable del tipo long son numeros enteros pero mas grandes por ejemplo: " + this.larguito);
        System.out.println("La variable del tipo doble son numeros decimales por ejemplo: " + this.doble);
        System.out.println("La variable del tipo boolean son solo true o false por ejemplo: " + this.binaria);
        System.out.println("La variable del tipo String son cadenas de caracteres o palabras por ejemplo: " + this.palabra);
    }

    
}