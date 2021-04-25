package Ejemplos;

import java.util.Scanner;
public class Triangulos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creamos un arreglo para guardar los lados del triangulo en él
        int [] lados = new int[10];
        /*Para guardar de una forma mas eficiente los datos del arreglo
          se usa (como en este caso) un ciclo for*/
        for (int x = 1; x <= 3; x++) {
            System.out.println("Cuanto mide el lado "+x);
            lados[x] = sc.nextInt();
        }
        //Aquí comprobaremos si el triangulo es equilatero
        if (lados[1]==lados[2] && lados[1]==lados[3]) {
            System.out.println("El triangulo es equilatero");
        }
        //Aquí para ver si es isosceles
        else if (lados[1]==lados[3] || lados[2]==lados[3]) {
            System.out.println("El triangulo es isosceles");
        }
        //Ya por descarte, la unica opción que nos queda es que sea escaleno
        else {
            System.out.println("El triangulo es escaleno");
        }
    }
}
