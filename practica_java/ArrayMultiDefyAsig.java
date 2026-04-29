
package arrays;

public class ArrayMultiDefyAsig {
    
     public static void main(String[] args){
         
         //crear array 2 dimensiones, donde habrá 2 filas y 3 columnas
         
         int[][] x = new int[2][3];
         
         //fila 1 - columna 1
         x[0][0]=1;
         //fila 1 - columna 2
         x[0][1]=2;
         //fila 1 - columna 3
         x[0][2]=3;
         
         //fila 2 - columna 1
         x[1][0]=4;
         //fila 2 - columna 2
         x[1][1]=5;
         //fila 2 - columna 3
         x[1][2]=6;
         
         //iterar
         //primero array y luego los datos
         //for each - recuperar matrizInterna desde x, de forma unidimensional
         for(int[] matrizInterna: x){
             //iterar cada dato
             for(int dato: matrizInterna){
                 System.out.println(dato);
             }    
         }
     }
}
