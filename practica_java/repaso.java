






public class repaso {
/**
 * @param args
 */
    public static void main(String[] args) {

    /*
    ================================================
    TEMA 1: CONCATENER Y SUMA 
    ================================================
     --------------------------------------------
    // MISION:
    String nombreHerrero = "Laurat";
    String herramienta = "Martillo";
    String mensaje = "¡A forjar!";
    System.out.println(nombreHerrero.length());
    System.out.println(herramienta.length());
    System.out.println(mensaje.length());
    System.out.println(nombreHerrero);
    System.out.println(herramienta);
    System.out.println(mensaje);

    System.out.println(10 + 20 + " es el total");  // "30 es el total" (suma primero)
    System.out.println("Total: " + 10 + 20);       // "Total: 1020" (concatena todo)
    ================================================
    // TEMA 2:  CONCATENAR
    ================================================
     --------------------------------------------
    // MISION:
    String nombre = "Laurat";
    int nivel = 3;
    String forja = "Forja Estelar";

    System.out.println("Herrero: " + nombre);
    System.out.println("Nivel: " + nivel);
    System.out.println("Bienvenido a " + forja + ", " + "nivel " + nivel);
    System.out.println("Tu nivel es " + nivel + " y tu nombre es " + nombre)
    ================================================
    // TEMA 3 METODOS BASICOS DE STRING
    ================================================
     --------------------------------------------
    // MISION:
    String forja = "  Forja de acero  ";
    String herrero = "Ferrum";
    String arma = "Espada";

    System.out.println(forja.trim().toUpperCase()); //sin espacios y en mayuscula
    System.out.println(herrero.toLowerCase()); //en miniscula
    System.out.println(arma.charAt(0)); //extraer primer letra de la palabra
    System.out.println("'" + forja.trim() + "'"); //imprimir sin espacios
    System.out.println(arma.equals("FERRUM")); //ver si la palabra es igual a

    ================================================
    // TEMA 4 COMPARACIÓN DE CADENAS
    ================================================
     --------------------------------------------
    // MISION:
    String comando = "forjar";
    String entrada = "FORJAR";
    String vacio = null;
    String material = "Hierro";

    System.out.println("");    
    System.out.println("forjar".equals(comando));   
    // 1️⃣ Compara si comando es exactamente "forjar" → true

    System.out.println(entrada.equalsIgnoreCase("forjar"));    
    // 2️⃣ Compara si entrada es igual a "forjar" ignorando mayúsculas → true

    System.out.println(material.equals("Acero"));   
    // 3️⃣ Compara si material NO es igual a "Acero" → false

    System.out.println("hola".equals(vacio));   
    // 4️⃣ Compara de forma segura si vacio es igual a "hola" → false (sin que explote)

    //TENER EN CUENTA LA NEGACION DE ! ANTES DE LA VARIABLE A EVALUAR:
    //String material = "Hierro";
    // Sin negación
    System.out.println(material.equals("Acero"));   // false
    // Con negación
    System.out.println(!material.equals("Acero"));  // true (¡es lo contrario!)

    ================================================
    //TEMA 5 BUSQUEDA DENTRO DE TEXTOS 
    ================================================
    /* metodos:
    contains() : contiene el texto? 
    String frase = "La forja estelar está activa";
    System.out.println(frase.contains("forja"));     // true
    
    startsWith() :  empieza con? 
    String comando = "forjar espada";
    System.out.println(comando.startsWith("forjar"));  // true
    
    endWith() : termina con? 
    String archivo = "diseño_forja.pdf";
    System.out.println(archivo.endsWith(".pdf"));     // true

    indexOf() : en que posicion está? 
    String palabra = "martillo";
    System.out.println(palabra.indexOf('m'));   // 0 (primera posición)
    System.out.println(palabra.indexOf('t'));   // 2
    // Buscar texto completo
    System.out.println(palabra.indexOf("ill")); // 3
     --------------------------------------------
    // MISION:
    String receta = "Para forjar una espada necesitas hierro y carbón";
    String material = "hierro";

    System.out.println(receta.contains("espada"));
    System.out.println(receta.startsWith("Para"));
    System.out.println( receta.endsWith("carbón"));
    System.out.println(material.indexOf('h'));
    System.out.println(receta.indexOf("carbón"));
    ================================================
    //TEMA 6 EXTRACCION DE SUBCADENAS
    ================================================
    METODO substring() (subcadena) te permite extraer una parte de un String.
    String texto = "ForjaEstelar";
    System.out.println(texto.substring(0, 5));  // "Forja" (posiciones 0,1,2,3,4)
    System.out.println(texto.substring(5, 10)); // "Estel" (5,6,7,8,9)
    System.out.println(texto.substring(2, 6));  // "rjaE"
    
    incluye la posicion inicial puesta, pero el segundo numero se resta 1  
    --------------------------------------------
    // MISION:
    String herramienta = "MartilloPesado";
    String receta = "Forja:Espada:Hierro";
        
    System.out.println(herramienta.substring(0,8));    
    // 1️⃣ Extrae "Martillo" (primeros 8 caracteres)
    
    System.out.println(herramienta.substring(8));
    // 2️⃣ Extrae "Pesado" (desde posición 8 hasta el final)
    
    System.out.println(receta.substring(6,12));
    // 3️⃣ Extrae "Espada" de la variable receta (posiciones 6 a 12)
    
    System.out.println(receta.substring(13,19));
    // 4️⃣ Extrae "Hierro" de la variable receta (desde posición 13)
    // Versión más flexible (recomendada)
    System.out.println(receta.substring(13));  // "Hierro"

    ================================================
    TEMA 7 REEMPLAZO EN CADENAS
    ================================================
    --------------------------------------------
    replace() - reemplazar caracteres o textos
    replaceAll() - reemplazar usando patrones
    
    String frase = "El hierro es duro, hierro forjado";

    // Reemplazar caracteres
    System.out.println(frase.replace('e', 'a'));   // "El hiarr... viste"

    // Reemplazar textos completos
    System.out.println(frase.replace("hierro", "acero"));  
    // "El acero es duro, acero forjado"

    // Reemplazar espacios
    System.out.println(frase.replace(" ", "_"));   
    // "El_hierro_es_duro,_hierro_forjado"

    replaceAll(regex, nuevo) - Reemplaza con patrones
    String codigo = "Precio: 100, Descuento: 20";

    Reemplazar todos los números
    System.out.println(codigo.replaceAll("\\d+", "XXX_"));
    // "Precio: XXX_, Descuento: XXX_"

    String texto = "   Espacio   ";
    System.out.println(texto.replace(" ", ""));  // "Espacio" (elimina espacios)
    System.out.println(texto.trim());            // "Espacio" (solo extremos)
    --------------------------------------------
    // MISION:
    String mensaje = "La espada de hierro es buena, pero hierro se oxida";
    String inventario = "Martillo,Espada,Yunque,Pico";
        
    System.out.println(mensaje.replace("hierro", "acero"));    
    // 1️⃣ Reemplaza "hierro" por "acero"
        
    System.out.println(mensaje.replace("e", "3"));
    // 2️⃣ Reemplaza todas las 'e' por '3' (número tres)
      
    System.out.println(inventario.replace("," , "-"));
    // 3️⃣ Reemplaza las comas ',' por guiones '-' en inventario
       
    System.out.println(mensaje.replace(" buena ", ""));
    // 4️⃣ Elimina la palabra "buena" del mensaje (reemplázala por "")
    //aca se pone con el espacio la palabra buena, para que elimine tambien los espacios en el print

    ||------------------------------------- ||
    replace() no modifica la cadena original:
    String original = "Hola mundo";
    original.replace("mundo", "Java");
    System.out.println(original); // ¡Sigue siendo "Hola mundo"!

    // Hay que asignar el resultado a una variable o imprimirlo directamente
    String modificado = original.replace("mundo", "Java");
    System.out.println(modificado); // "Hola Java"
    ||------------------------------------- ||

    ================================================
    TEMA 7. DIVISION DE CADENAS 
    ================================================
    split() - dividir un texto en partes usando un separador
    *Convertir un String en un array de Strings*

    SINTAXIS
    String[] partes = texto.split(separador);

    // DIVIDIR POR COMAS:
    String inventario = "Martillo,Espada,Yunque,Pico";
    String[] items = inventario.split(",");
    System.out.println(items[0]);  // "Martillo"
    // DIVIDIR POR ESPACIOS: 
    String frase = "Java es genial";
    String[] palabras = frase.split(" ");
    System.out.println(palabras[0]);  // "Java"
    // Dividir por dos puntos
    String datos = "nombre:Laurat:nivel:3";
    String[] campos = datos.split(":");
    System.out.println(campos[0]);  // "nombre"
    System.out.println(campos[1]);  // "Laurat"
       
    eL ORIGINAL NO cambia, split() crea nueva variable
    Separadores especiales	. | * + necesitan \\ (ej: split("\\."))

    --------------------------------------------
    // MISION:
    String receta = "hierro:4,carbón:2,acero:1";
    String comandos = "forjar calentar enfriar";
    String ruta = "carpeta.subcarpeta.archivo";
        
    String[] items = receta.split(",");
    System.out.println(items[1]); 
    // 1️⃣ Divide receta por "," y muestra el segundo elemento (índice 1)
    
    String[] items_2 = (comandos.split(" "));
    System.out.println(items_2[0]);
    // 2️⃣ Divide comandos por " " y muestra el primer elemento
    
    String[] items_3 = (receta.split("[:,]\\d+[,]?"));
        /*explicacion (receta.split("[:,]\\d+[,]?"));
        [:,]  // Significa: UN carácter que puede ser : o , -> dividira en : y ,
            [:]	Un carácter que es :
            [,]	Un carácter que es ,
            [:,]	Un carácter que es : O , (cualquiera de los dos)

        \\d+ - Dígitos
            \\d   // Cualquier dígito (0-9)
            \\d+  // UNO O MÁS dígitos seguidos

        [,]? - Coma opcional
            [,]	Una coma
            [,]?	Una coma o nada (opcional)
        
        ENTONCES: LA "Un separador que puede ser : o ,, 
        seguido de uno o más números, seguido opcionalmente de una coma"
       

    System.out.println(items_3[0]);
    System.out.println(items_3[1]);
    System.out.println(items_3[2]);
    // 3️⃣ Divide receta por ":" y muestra "hierro", "carbón", "acero"
        
    String[] items_4 = (ruta.split("\\."));
    System.out.println(items_4[2]);
    // 4️⃣ Divide ruta por "\\." y muestra "archivo" (último elemento)

    //ver ejercicio resuelto con multiples split() en notion 
    // : https://www.notion.so/multiples-split-366c634ddb5f80548081df8266da891b


    ================================
    TEMA 8 METODO SCANNER
    ================================
    
    import java.util.Scanner;
    abrir main
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();
        
        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();
        
        System.out.println("Hola " + nombre + ", tienes " + edad + " años");
        
        scanner.close();
    --------------------------------------------
    // MISION:    
    Scanner leer = new Scanner(System.in);
    // 1️⃣ Crear Scanner
    
    System.out.println("¿Cual es tu nombre, herrero?");
    // 2️⃣ Preguntar "¿Cuál es tu nombre, herrero?"
    String nombre = leer.nextLine();    
    // 3️⃣ Guardar la respuesta en variable String nombre
    System.out.println("¿Cuantos martillos has forjado?");    
    // 4️⃣ Preguntar "¿Cuántos martillos has forjado?"
    int martillos = leer.nextInt();     
    // 5️⃣ Guardar la respuesta en variable int martillos
    System.out.println("\n¡Bienvenid@ " + nombre + "!" + ", has forjado " + martillos + " martillos.");    
    // 6️⃣ Mostrar "Bienvenido [nombre], has forjado [martillos] martillos"
    
    leer.close();   
    // 7️⃣ Cerrar Scanner


    ================================
    TEMA 9 OPERADORES DE COMPARACION
    ================================
    int martillos = 7;
    int nivel = 3;

    System.out.println(martillos == 7);   // true (es igual)
    System.out.println(martillos != 5);   // true (no es igual)
    System.out.println(martillos > 10);   // false (7 no es mayor que 10)
    System.out.println(nivel >= 3);       // true (3 es mayor o igual que 3)
    System.out.println(nivel <= 2);       // false (3 no es menor o igual que 2)

    String nombre1 = "Laurat";
    String nombre2 = "laurat";
    System.out.println(nombre1.equals(nombre2));   // ✅ false (diferente mayúscula)
    System.out.println(nombre1.equalsIgnoreCase(nombre2)); // ✅ true   

    --------------------------------------------
    // MISION:
    int acero = 15;
    int hierro = 10;
    int nivel = 5;
    int temperatura = 1200;
        
       
    // 1️⃣ ¿Es acero mayor que hierro?
    System.out.println(acero > hierro);   
   
    // 2️⃣ ¿Es nivel diferente de 3?   
    System.out.println(nivel != 3); 

    // 3️⃣ ¿Es temperatura igual a 1200?
    System.out.println(temperatura == 1200);   
    
    // 4️⃣ ¿Es hierro menor o igual que 10?
    System.out.println(hierro <= 10);    
    
    // 5️⃣ Guarda en una variable booleana "puedeForjar" si acero >= 10 Y nivel >= 3
    boolean puedeForjar = (acero >= 10 && nivel >= 3);        
    System.out.println(puedeForjar);


 ================================
 TEMA 10 ESTRUCTURA IF BASICA
 ================================
Sintaxis

 if (condición) {
    // Código que se ejecuta SOLO si condición es true
}

ejm 
int temperatura = 1200;

if (temperatura >= 1000) {
    System.out.println("¡La forja está lista para trabajar!");
}
System.out.println("Fin del programa");

// Salida: "¡La forja está lista para trabajar!" -> SI ES TRUE
//         "Fin del programa" -> SI ES FALSE

    --------------------------------------------
    // MISION:
    int martillos = 5;
    int nivel = 3;
    int acero = 12;
        
        
    if (martillos > 3){
        System.out.println("Eres un herrero experimentado");
    }
    // 1️⃣ Si martillos es mayor que 3, muestra "Eres un herrero experimentado"
        
    if (nivel == 3){
        System.out.println("Nivel intermedio alcanzado");
    }
    // 2️⃣ Si nivel es igual a 3, muestra "Nivel intermedio alcanzado"
        
    if(acero >= 10){
        System.out.println("Material suficiente para forjar");
    }
    // 3️⃣ Si acero es mayor o igual a 10, muestra "Material suficiente para forjar"
        
    if(martillos + acero > 15){
        System.out.println("Recursos abundantes");
    }
    // 4️⃣ Si martillos + acero es mayor que 15, muestra "Recursos abundantes"


 ================================
 TEMA 12 ESTRUCTURA IF-ELSE
 ================================

Sintaxis: 

if (condición) {
    // Se ejecuta si condición es true
    System.out.println("imprime esta linea");
} else {
    // Se ejecuta si condición es false
    System.out.println("imprime esta otra linea");
}

ej 
int temperatura = 800;

if (temperatura >= 1000) {
    System.out.println("¡La forja está lista!");
} else {
    System.out.println("La forja necesita más calor. Temperatura actual: " + temperatura);
}
// Salida: "La forja necesita más calor. Temperatura actual: 800"

    --------------------------------------------
    // MISION:
    int nivel = 3;
    int energia = 85;
    int piezasForjadas = 4;    

    // 1️⃣ Si nivel es mayor o igual a 5, muestra "Maestro herrero"
    //   Sino, muestra "Aprendiz en formación"
      
    if(nivel >= 5){
        System.out.println("Maestro herrero");
    } else {
        System.out.println("Aprendiz en formación");
    }
        
    // 2️⃣ Si energia es mayor a 50, muestra "Suficiente energía para forjar"
    //   Sino, muestra "Energía baja, descansar necesario"
    if(energia > 50){
        System.out.println("Suficiente energia para forjar");
    } else {
        System.out.println("Energía baja, descansar necesario");
    }    
        
    // 3️⃣ Si piezasForjadas >= 5, muestra "¡Objetivo cumplido!"
    //   Sino, muestra "Faltan " + (5 - piezasForjadas) + " piezas"
    if(piezasForjadas >= 5){
        System.out.println("¡Objetivo cumplido!");
    } else {
        System.out.println("Faltan " + (5 - piezasForjadas) + " piezas");
    }

 ================================
 TEMA 13 ESTRUCTURA IF-ELSE IF-ELSE
 ================================
//permite evaluar varias condiciones en orden. Solo se ejecuta el primer bloque cuya condición sea true.
SINTAXIS
    if (condición1) {
        // Se ejecuta si condición1 es true
    } else if (condición2) {
        // Se ejecuta si condición1 es false Y condición2 es true
    } else if (condición3) {
        // Se ejecuta si condición1 y condición2 son false Y condición3 es true
    } else {
        // Se ejecuta si TODAS las condiciones anteriores son false
    }

    EJM
    int puntaje = 85;

    if (puntaje >= 90) {
        System.out.println("Excelente! Eres un maestro herrero");
    } else if (puntaje >= 70) {
        System.out.println("Muy bien! Buen herrero");
    } else if (puntaje >= 50) {
        System.out.println("Aprobado, pero puedes mejorar");
    } else {
        System.out.println("Necesitas más práctica en la forja");
    }

    // Salida: "Muy bien! Buen herrero" (porque 85 >= 70 es true)
    // NOTA: No evalúa puntaje >= 90 porque ya encontró uno true 

    ------------------------
    MISION

    int temperatura = 850;
    int calidad = 7;  // escala 1-10
    int nivel = 4;
        
        
    // 1️⃣ Clasifica la temperatura:
    //    > 1200: "Metal fundido"
    //    entre 1000 y 1200: "Temperatura ideal"
    //    entre 700 y 999: "Calentando"
    //    < 700: "Demasiado frío"
    if (temperatura >= 1200){
        System.out.println("metal fundido");
    } else if (temperatura >= 1000 &&  temperatura <= 1200){ // se puede solo temperatura >= 1000, ya que la siguiente es desde 1200
        System.out.println("Temperatura ideal");
    } else if (temperatura >= 700 && temperatura <= 999){
        System.out.println("Calentando");
    } else {
        System.out.println("Demasiado Frío");
    }

    // 2️⃣ Clasifica la calidad del arma:
    //    >= 9: "Legendaria"
    //    >= 7: "Excelente"
    //    >= 5: "Aceptable"
    //    < 5: "Defectuosa"
     if (calidad >= 9){
        System.out.println("Legendaria");
    } else if (calidad >= 7){
        System.out.println("Excelente");
    } else if (calidad >= 5){
        System.out.println("Aceptable");
    } else {
        System.out.println("Defectuosa");
    }
    
    // 3️⃣ Determina el título del herrero según nivel:
    //    nivel >= 8: "Maestro Supremo"
    //    nivel >= 5: "Maestro Herrero"
    //    nivel >= 3: "Herrero Experto"
    //    nivel >= 1: "Aprendiz"
    //    nivel < 1: "Sin rango"
    if(nivel >= 8){
        System.out.println("Maestro supremo");
    }else if (nivel >= 5){
        System.out.println("Maestro herrero");
    }else if (nivel >= 3){
        System.out.println("Herrero experto");
    }else if (nivel >= 1){
        System.out.println("Aprendiz");
    }else {
        System.out.println("Sin rango");
    }
*/

    } 
}

