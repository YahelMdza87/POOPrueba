/*
utilizar algunos de los metodos más comunes
 */
package ejemplos;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class MetodosString {

    public static void main(String[] args) {
     String s = "java desde Cero";
     //String s = new String("Java desde cero");
     
     //devolver la cantidad de caracteres en la cadena
        System.out.println("String lenght: " + s.length());
        
        //devolver el caracter en el indice i 
        System.out.println("Character at 3rd position= " + s.charAt(2));
        
        //devolver la subcadena del caracter indice i-esimo
        //al final de la cadena 
         System.out.println("Substring "+ s.substring(3));
         //Devuelve la subcadena del indice i a j-1
         System.out.println("Substring " + s.substring(2, 5));
         //concatenar String2 hasta el final del String 1
         String s1 = "Java";
         String s2= " desde cero";
         System.out.println("String concatenado "+s1.concat(s2));
         
         //Devuelve el indice dentro de la cadena de la primera 
         //aparicion de la cadena especificada
         
         String s4 = "java desde cero";
         
         System.out.println("indice de cero = "+s4.indexOf("Cero"));
         
         //comenzar en el indice especificado
         System.out.println("indice de a = "+s4.indexOf('a', 3));
         
         //comprobar la igualdad de cadenas
         
         boolean out="java".equalsIgnoreCase("Java");
         
         System.out.println("Comprobando la igualdad: "+out);
         
         out="java".equals("Java");
         
         System.out.println("Comprobando la igualdad: "+out);
         
         /*El metodo equalsIsIgnoreCase: Compara dos Strings 
         para ver si son iguales, ignorando las diferencias 
         entre mayuscula y minuscula
         */
        int out1=s1.compareTo(s2);
        
        System.out.println("Si s1=s2: "+ out);
        
        String palabra1="JavadesdeCero";
        
        System.out.println("Cambiando a minusculas "+ palabra1.toLowerCase());
        
        String palabra2 ="JavadesdeCero";
        
        System.out.println("Cambiando a MAYUSCULAS "+ palabra1.toUpperCase());
        
        //Recortar palabras
        
        String word="JavadesdeCero";
        
        System.out.println("Recortar palabra: "+ word.trim());
        
        //Reemplazar caracteres 
        String str1="YavadesdeCero";
        
        System.out.println("String Original: "+str1);
        
        String str2="YavadesdeCero".replace("Y", "J");
        
        System.out.println("Remplazando Y por J " + str2);
    }
    
}