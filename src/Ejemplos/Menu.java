/*
Hacer uso de una estructura de control do/while
 */

package Ejemplos;

import java.util.Scanner;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Menu {
Scanner sc = new Scanner(System.in);
//Aquí declaramos los dos numeros que vamos a usar el dia de hoy 
int x=0,y=0;

public void menu(){
    //Declaramos la variable opc que nos servirá para saber que elegirá el usuario
    String opc=" ";
    //Creamos un Do While para que se corra en todo momento, solo hasta que el usuario lo ordene
    do{
        //Aquí le pedimos las variables "x" y "y" para poder hacer las operaciones
        System.out.println("Ingrese el numero 1");
        x=sc.nextInt();
        System.out.println("Ingrese el numero 2");
        y=sc.nextInt();
        System.out.println();
        //Mostramos el menu, donde el usuario verá todo lo que puede realizar con este programa
        System.out.print("---Menu principal---"+"\nA.Sumar los numeros ingresados"
        +"\nB.Restar los numeros ingresados"
        +"\nC.Multiplicar los numeros ingresados"
        +"\nD.Dividir los numeros ingresados"
        +"\nIngrese opcion: "        
        );
        sc.nextLine();
        //Después de que el usuario haya leído el menu, aquí pondra lo que querra realizar
        opc=sc.nextLine();
        /*Abrimos un switch con el metodo "toUpperCase()" para que al momento de que el usuario (por 
        ejemplo) elijá la opción "a", el metodo "toUpperCase()" nos ayudará a convertir esa "a" minuscula
        en mayuscula para nosotros ahorrarnos lineas de codigo
        */
        opc=opc.toUpperCase();
        if (opc.equals("A") || opc.equals("B") || opc.equals("C") || opc.equals("D") ) {
             switch(opc){
             case"A":System.out.println("El resultado de la suma es: "+Suma(x,y)); 
                 break;
             case"B":System.out.println("El resultado de la resta es: "+Resta(x,y)); 
             break;
             case"C":System.out.println("El resultado de la multiplicación es: "+Multiplicacion(x,y)); 
             break;
             case"D":System.out.println("El resultado de la división es: "+Division(x,y)); 
             break;
        }
        }
        else {
            System.err.println("*********FAVOR DE PONER ALGUNA DE LAS OPCIONES INDICADAS**************");
        }
       
        /*Después de realizar la operación que el usuario pidió, aquí le volveremos a preguntar
        por si quiere realizar otra
        */
        
        System.out.println("__________________________________");
        System.out.println("Quieres hacer otra operación?");
        System.out.println("E.Sí");
        System.out.println("Cualquier tecla para salir");
        System.out.println("Ingrese una opción:");
        opc = sc.nextLine();
            opc = opc.toUpperCase();
        }while(opc.equals("E"));
}
/*Por ultimo, los metodos return en los cuales hacemos las operaciones necesarias y nos devolverá
el resultado dependiendo de lo que el usuario requierá
*/
public int Suma(int n1, int n2){
    int suma;
    suma=n1+n2;
    System.out.println("_____________________________________");
    return suma;
}
public int Resta(int n1, int n2){
    int resta=0;
    resta=n1-n2;
    System.out.println("_____________________________________");
    return resta;
}
public int Multiplicacion(int n1, int n2){
    int multi;
    multi = n1*n2;
    System.out.println("_____________________________________");
    return multi;
}
public double Division(int n1, int n2){
    double div;
    div=n1/n2;
    System.out.println("_____________________________________");
    return div;
}
}