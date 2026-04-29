
import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese numero entero: ");
        int numero = leer.nextInt();
        
        //verificar si es true la clase esPrimo
        if(esPrimo(numero)){
            System.out.println("================");
            System.out.println("es numero primo");
            System.out.println("================");
        }else{
            System.out.println("================");
            System.out.println("no es numero primo");
            System.out.println("================");
        }
    }
    
    static boolean esPrimo(int numero){
        int contador = 0; //por cuantos numeros puede ser dividido el numero ingresado
        
        //Array contenedor de numeros
        int[] numeros = new int[numero];//array con espacio definido
        //
        for(int i = 0; i <numeros.length; i++){
            numeros[i] = i+1;
        }
        //iterar para recuperar los numeros
        for(int i : numeros){
            if (i == 1 || i == numero){                        
                continue; 
            }
            if (numero % i == 0){
                contador++;
            }
        }
        return contador == 0;  //devolvera true si se cumple
    }
}
