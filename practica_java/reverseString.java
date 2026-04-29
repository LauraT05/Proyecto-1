
public class reverseString {
    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        String originalString = "Hola Mundo";
        String reversedString = reverseString(originalString);
        System.out.println("Cadena original: " + originalString);
        System.out.println("Cadena invertida: " + reversedString);
    }
}

