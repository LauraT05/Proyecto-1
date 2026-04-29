
import static java.lang.System.exit;
import java.util.Scanner;


public class conversorMonedas {
    public static void main(String[] args){
        while(true){
        
            System.out.println("CONVERSOR DE MONEDAS");
            //MENU
            System.out.println("");
            System.out.println("""
                               1. Soles peruanos a dolares
                               2. Pesos mexicanos a dolares 
                               3. Pesos Colombianos a dolares 
                               4. Salir""");
            System.out.println("");
            System.out.print("Ingrese una opcion 1-4: ");
            //crear objeto scanner
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);
            
            //multiples
            switch(opcion){
                case '1':
                    convertir(3.58, "Soles peruanos");
                    break;
                case '2':
                    convertir(22.15, "Peso mexicano");
                    break;
                case '3':
                    convertir(3951.9, "Peso colombiano");
                    break;
                case '4':
                    System.out.println("cerrando programa");
                    exit(0);
                    //break; -> se podria  break EXTERNA; para cerrar
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
  
    }
    
    static void convertir(double valorDolar, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.printf("Ingrese el valor a convertir %s ", pais);
        double cantidadMoneda = leer.nextDouble();
        
        //convertir
        double dolares = cantidadMoneda / valorDolar;
        //redondear
        dolares = (double) Math.round(dolares * 100d)/100;
        
        System.out.println("===================================");
        System.out.println("| Tienes $" + dolares + " " + "dolares  |");
        System.out.println("===================================");
    } 
}
