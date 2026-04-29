
//package arrays;

public class ArrayMulti2 {
      public static void main(String[] args){
          
        //crear matriz bidimensioonal, donde habrá 3filas 
        //cada una con sus datos definidos
         System.out.println("BIDIMENSIONAL");
         int[][] x = {
             {1,2,3},
             {4,5,6},
             {7,8},
         };           
                 
        //iterar las filas, y luego iterar los datos almacenados         
         for(int[] matrizInterna: x){
             //iterar cada dato
             for(int dato: matrizInterna){
                 System.out.println(dato);
             }    
         }
         
         //array tridimensional
        System.out.println("");
        System.out.println("TRIDIMENSIONAL");
        
        int [][][] y = {//array principal 2 filas 1 columna
            {
                {1,2,3}, //otro array de dos filas 3 columnas
                {4,5,6},
            }, 
            {
               {-1,-2,-3}, //otro array de dos filas 3 columnas
               {-4,-5,-6},
            },
        };
        //iterar las filas, y luego iterar los datos almacenados de 2 dimensiones         
        for(int[][] matriz2D: y){
             //iterar cada dato de la matriz de 1 dimension, recuperada de matriz2D
            for(int []matriz1D: matriz2D){
                //otro for para recuperar los datos
                for (int dato:matriz1D){
                    System.out.println(dato);
                }
            }
      
        }
    }
}
