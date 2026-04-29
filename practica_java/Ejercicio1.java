
package cursojava;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        var num1 = leer.nextInt();
        System.out.println("");
        System.out.print("Ingrese el segundo numero: ");
        var num2 = leer.nextInt();
        
        var s = num1 + num2;
        
        System.out.println("");
        System.out.printf("La suma %d + %d = %d\n", num1, num2, s);
    }     
        
}
