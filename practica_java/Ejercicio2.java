
package cursojava;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de venta: ");
        double vv = leer.nextDouble();
        System.out.println("");
        //IGV 18%
        
        double igv = vv * 0.18;
        double pv = vv + igv;
        
        System.out.println("");
        System.out.println("Valor venta = "+vv);
        System.out.println("IGV = "+igv);
        System.out.println("Precio de venta = "+pv);
        System.out.println("");
    }           
}