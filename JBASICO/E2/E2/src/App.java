public class App {
    public static void main(String[] args) throws Exception {
        int numeroIf = 1;
        
        if (numeroIf < 0){
            System.out.println("Es negativo");
        }
        else if (numeroIf == 0){
            System.out.println("Es 0");
        }
        else {
            System.out.println("Es positivo");
        }

        int numeroWhile = 0;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        String estacion = "VERANO";

        switch (estacion) {
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Es Primavera");
                break;
            
            default:
                System.out.println("No es una estacion");
                break;
        }

    }
}
