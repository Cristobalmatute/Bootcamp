public class App {
    static int Suma(int a, int b, int c){
        int result;
        result = a + b + c;
        return result;
    }

    

    public static void main(String[] args) throws Exception {


        int resultado = Suma(10, 30, 60);
        System.out.println(resultado);

        System.out.println("-----------Nuevo Ejercicio --------------------");

        Coche mycoche = new Coche();
        mycoche.AñadirPuerta();
        mycoche.AñadirPuerta();
        System.out.println(mycoche.numeroPuertas);
    }
}

class Coche{
    public int numeroPuertas = 0;

    public void AñadirPuerta(){
        numeroPuertas++;
    }
}