
//package arrays;

public class Arrays {

    public static void main(String[] args) {
        
        String nombres []; // definir un array
        
        nombres = new String[3]; //generando 3 datos para 
                                 //almacenar en el array
        
        //asignar valor al array, por indice del 0 al 2, 
        //que habria 3 espacios de memoria
        nombres[0] = "Alex";
        nombres[1] = "Felix";
        nombres[2] = "Lt";
       
        System.out.println(nombres[2]);
        
        nombres[2] = "Maria";
        
        System.out.println("");
        System.out.println(nombres[2]);
        System.out.println("");
        
        System.out.println(nombres);
        System.out.println("");
        System.out.println(nombres.length);
        System.out.println("");
        
        //definir con datos
        int[ ] array1 = {1,2,3,4,5};
        
        System.out.println(array1[0]);
        array1[0] = 100;
        System.out.println("");
        System.out.println(array1[0]);
        System.out.println(array1.length);
        System.out.println("");
        //definir un array con cantidad de datos a almacenar en una linea
        
        int[] array2 = new int[6];
        System.out.println(array2.length);
    }
    
}
