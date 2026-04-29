 
//package funciones;

public class claseMath {
    public static void main(String[] args){
        
        double x = -2.5;
        double y = 3.7;
        double absX = Math.abs(x);   // absX = 2.5
        double maxXY = Math.max(x, y);  // maxXY = 3.7
        double powX = Math.pow(x, 2);  // powX = 6.25
        
        System.out.println(x);
        System.out.println(y);
        System.out.println("valor absoluto de x: " +absX);
        System.out.println("numero mas grande: " +maxXY);
        System.out.println("Eleveado:" +powX);
        
        System.out.println("Random: " + Math.random()*101);
        
        System.out.println("Random entero: " + (int)(Math.random()*101));
        
        int numero = ((int)(Math.random()*100));
        System.out.println("numero random redondeado: " + Math.round(numero));
        
        double moneda = (double)Math.round(3.33*1000d)/100;
        System.out.println("Conversion moneda: " +moneda);
    }
}
