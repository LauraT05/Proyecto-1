
import java.util.Scanner;
public class palindromo {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("ES PALINDROMO?");        
        System.out.println("Ingrese palabra o frase : ");
        String cadenaOriginal = leer.nextLine(); //1. recibir cadena

        // Limpiar espacios y convertir a minúsculas
        String cadenaMinus = cadenaOriginal.toLowerCase(); // 2. pasar a minus
        String cadenaOriEspacios = cadenaMinus.replaceAll("\\s+", ""); //3. quitar espacios
        //revertir la cadena
        String reversedString = reverseString(cadenaOriEspacios); // 4. llamar metodo reverseString
        
        // comprobacion interna codigo
        //System.out.println(cadenaOriEspacios);
        //System.out.println(reversedString);
                
        System.out.println("");
        //validacion cadenas y mensaje final:
        if (reversedString.equals(cadenaOriEspacios)){
            System.out.printf("La cadena %s es palindromo\n", cadenaOriginal);
        }else{
            System.out.printf("La cadena %s NO es palindromo\n", cadenaOriginal);
        }     
    }
    
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder(str); // 1. Convertir el String a StringBuilder
        sb.reverse(); // 2. Invertir el contenido
        return sb.toString(); // 3. Devolver el resultado como String
    }
}
