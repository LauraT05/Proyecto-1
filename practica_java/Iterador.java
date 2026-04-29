
package arrays;


public class Iterador {
    
    public static void main(String[] args){
    
    String[] nombres = { "Laura", "Rocio", "Traslaviña", "Castellanos"};
    
        System.out.println("");
        
        //iterar
        
        int c = 0; // iterar desde indice cero
        System.out.println("con estructura while");
        System.out.println("");
        while(c < nombres.length){ //iterar segun la longitud del array
            System.out.println(nombres[c]);
            c++;
        }
//iterar de cero (int c = 0) hasta 3 que es la longitud del array
//el c++ debe increementarse para que se cumpla el bucle  
        System.out.println("");
        System.out.println("Con estructura for");
        System.out.println("");
        for(int i = 0; i < nombres.length; i++){ //iterar lo mismo en una pequeña estructura
            System.out.println(nombres[i]);
        }
        System.out.println("");
        System.out.println("con estructura for each");
        System.out.println("");
        
        for(String dato:nombres){ //datos a recuperar en string dato
            System.out.println(dato);
        }

    }
}