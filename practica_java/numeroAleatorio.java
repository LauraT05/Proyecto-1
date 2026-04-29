
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class numeroAleatorio {
    public static void main(String[] args){
        OUTER:
        while(true){
            System.out.println("   JUEGO ADIVA EL NÚMERO \n");
            System.out.println("""
                               1 - Nivel Facil
                               2 - Nivel Intermedio 
                               3 - Nivel Dificil
                               4 - Salir""");
            
            Scanner leer = new Scanner(System.in);
            System.out.print("INGRESE UNA OPCiÓN: ");
            int opcion = leer.nextInt();
            
            switch(opcion){
                case 1 -> jugar(5);
                case 2 -> jugar(3);
                case 3 -> jugar(2);
                case 4 -> {
                    System.out.println("CERRANDO PROGRAMA");
                    break OUTER;
                }
                default -> System.out.println("OPCIÓN INCORRECTA");
            }
        }
    }
    
    static void jugar(int vidas){
        //generar numero aleatorio - se debe convertir a int - *101 para numero entre 1 y 100
        int numeroRandom = (int)(Math.random()*101);
        int numeroElegido = -1;
        
        Scanner leer = new Scanner(System.in);
        
        
        //crear while para que el usuario intente adivinar el numero cierta cant de veces
        while(numeroElegido != numeroRandom){
            System.out.println("Ingrese un numero 1-100: ");
            numeroElegido = leer.nextInt();
            
            if(numeroRandom < numeroElegido){
                System.out.println("Intenta un numero mas pequeño");
                //perder vida por fallar
                vidas--;
            }else if (numeroRandom > numeroElegido){
                 System.out.println("Intenta un numero mas grande");
                //perder vida por fallar
                vidas--;
            }
            
            if (vidas == 0){
                System.out.println("-------------------");
                System.out.println("    GAME OVER¡");
                System.out.println("-------------------");
                break;
            }
            System.out.println("::::::::::::::::::");
            System.out.printf("te quedan %d vidas\n", vidas);
            System.out.println("::::::::::::::::::");
            System.out.println("");
        }
        if (numeroElegido == numeroRandom){
        System.out.println("-------------------");
        System.out.println("      GANASTE¡     ");
        System.out.println("-------------------");
        }
    }
}

