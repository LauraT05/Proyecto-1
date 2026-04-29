
//package funciones;

public class cuentaRegresiva {
    public static void main(String[] args){
        
       cuentaRegresiva(10); //se asigna el valor inicial
        
    }    
    static void cuentaRegresiva(int numero){//iteracion 1: llega acá como 10
        numero --; // iteracion 1: pasa acá y descuenta a nueve
        //se repite hasta que numero llega a cero
        if(numero > 0){ // iteracion 1: pasa aca para ver si la condicion se cumple, 
            System.out.println(numero); //iteracion 1: si es true, imprime el numero
            cuentaRegresiva(numero); //iteracion 1: guarda el numero numero, 9
        }else{ //iteracion 1: false, no hace nada, vuelve al bucle
            System.out.println("Llego a cero");
        }
    }
}
 