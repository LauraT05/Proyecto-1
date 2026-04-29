
package funciones;

public class factorialFunciones {
    public static void main(String[] args){
        
        System.out.println(factorial(5));  //iteracion 1: empieza acá   
        
    }
    //factorial 
    static int factorial(int numero){ //iteracion 1, recibe el valor 5
        if(numero > 1){ // como 5 > 1, se ejecuta la formula
            numero = numero * factorial(numero - 1); 
            //iteracion 1 numero = numero * factorial( 5 - 1)
            //iteracion 1 numero = 5 * 4
            //iteracion 1 numero = 20
            
            //iteracion 2 numero = 20 *f actorial( 4 - 1)
            //iteracion 2 numero = 20 * 3
            //iteracion 2 numero = 60
            
            //iteracion 3 numero = 60 *f actorial( 2 - 1)
            //iteracion 3 numero = 60 * 2
            //iteracion 3 numero = 120
            
            //iteracion 4 -> numero > 1 : false
            // iteracion 4, termina e imprime el numero
            
        }
        return numero;
    }
}
