/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author laura
 */
public class generadorContraseña {
     public static void main(String[] args) {
        System.out.println(generaConsena());
    }
    
    static String generaConsena(){
        char[] mayusculas = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] minusculas = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] numeros = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        char[] simbolos = {'#', '%' , '/', '?', '!'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(mayusculas);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        caracteres.append(simbolos);
        
        StringBuilder contrasena = new StringBuilder();
        
        for(int i = 0; i <= 7; i++){
            int cantidadCaracteres = caracteres.length();
            int numeroRandom = (int)(Math.random()*cantidadCaracteres);
            
            contrasena.append((caracteres.toString()).charAt(numeroRandom));
        }
        
        return contrasena.toString();
    }
}
