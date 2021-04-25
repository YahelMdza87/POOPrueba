package Ejemplos;

import java.util.Scanner;

public class Figuras {
    Scanner sc = new Scanner(System.in);
    String figura =" ";
    public void figuras() {
        
        do{
            System.out.println("::::::::Menu principal:::::::::"+"\nA.Circulo"
            +"\nB.Cuadrado"
            +"\nC.Rectangulo"
            +"\nD.Triangulo");
            System.out.println("Que figura deseas efectuar?");
        figura = sc.nextLine();
        figura = figura.toUpperCase();
            if ((figura.equals("A") || figura.equals("B")|| figura.equals("C")|| figura.equals("D"))) {
               switch (figura){
            case "A": circulo(); break;
            case "B": cuadrado();break;
            case "C": rectangulo(); break;
            case "D": triangulo(); break;
        } 
            }
            else {
                System.out.println("Favor de poner una de las letras indicadas");
            }
           
            System.out.println("_____________________________");
            System.out.println("Deseas realizar ver el menu de nuevo?");
            System.out.println("E.Sí"
                            +"\nCualquier tecla para salir");
            sc.nextLine();
            figura = sc.nextLine();
            figura = figura.toUpperCase();
        }while(figura.equals("E"));
}
    //operaciones encesarias para un circulo
    public void circulo(){
        double radio,area,circunferencia,diametro;
        System.out.println("Cuál es el radio?");
        radio = sc.nextDouble();
        area = Math.PI*(Math.pow(radio, 2));
        diametro = (radio*2);
        circunferencia = Math.PI*diametro;
        System.out.println("_____________________________");
        System.out.println("Los datos de tu circulo son: "
        +"\nArea= "+area
        +"\nCircunferencia= "+circunferencia
        +"\nDiametro= "+diametro);
        
        
    }
    //Operaciones necesarias para un cuadrado
    public void cuadrado(){
        double lado, area, perimetro,diagonal;
        System.out.println("Cuanto mide un lado de tu cuadrado? ");
        lado = sc.nextDouble();
        area = lado*lado;
        perimetro = lado*4;
        diagonal = Math.sqrt((2*(Math.pow(lado, 2))));
        System.out.println("______________________________");
        System.out.println("Los datos de tu cuadrado son: "
        +"\nArea = "+area
        +"\nPerimetro = "+perimetro
        +"\nDiagonal = "+diagonal);        
    }
    public void rectangulo(){
          double base, altura, area, perimetro,diagonal;
        System.out.println("Cuanto mide la base de tu rectangulo? ");
        base = sc.nextDouble();
        System.out.println("Cuanto mide la altura de tu rectangulo? ");
        altura = sc.nextDouble();
        area = base*altura;
        perimetro = (2*base)+(2*altura);
        diagonal = Math.sqrt(((Math.pow(base, 2))+(Math.pow(altura, 2))));
        System.out.println("______________________________");
        System.out.println("Los datos de tu rectangulo son: "
        +"\nArea = "+area
        +"\nPerimetro = "+perimetro
        +"\nDiagonal = "+diagonal);     
    }
    public void triangulo(){
        String tipo = "";
        double altura=0.0, area, perimetro;
        int [] lados = new int[10];
        /*Para guardar de una forma mas eficiente los datos del arreglo
          se usa (como en este caso) un ciclo for*/
        for (int x = 1; x <= 3; x++) {
            System.out.println("Cuanto mide el lado "+x);
            lados[x] = sc.nextInt();
        }
        if (lados[1]>=lados[2] && lados[1]>=lados[3]) {
            if ((lados[2]+lados[3])>lados[1]) {
                if (lados[1]==lados[2] && lados[1]==lados[3]) {
            tipo = "equilatero";
            altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[2]/2), 2)));
            area = (lados[1]*altura)/2;
            perimetro = (lados[1]+lados[2]+lados[3]);
        }
        //Aquí para ver si es isosceles
        else if (lados[1]==lados[3] || lados[2]==lados[3] || lados[1]==lados[2]) {
            tipo = "isosceles";
            if (lados[1]==lados[3]) {
                altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[2]/2), 2)));
                area = (lados[2]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
            else if (lados[2]==lados[3]) {
                altura = Math.sqrt((Math.pow(lados[2], 2))-(Math.pow((lados[1]/2), 2)));
                area = (lados[1]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
            else {
                altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[3]/2), 2)));
                area = (lados[3]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
        }
        
        //Ya por descarte, la unica opción que nos queda es que sea escaleno
        else {
            tipo = "escaleno";
            perimetro = (lados[1]+lados[2]+lados[3])/2;
            area = Math.sqrt((perimetro*(perimetro-lados[1])*(perimetro-lados[2])*(perimetro-lados[3])));
            perimetro *=2;
        }
         System.out.println("______________________________");
        System.out.println("Los datos de tu triangulo son: "
        +"\nArea = "+area
        +"\nPerimetro = "+perimetro
        +"\nTipo de triangulo = "+tipo);     
        
        
    
            }
            else {
                System.out.println("No existe ese triangulo");
            }
        }
        else if (lados[2]>=lados[1] && lados[2]>=lados[3]) {
             if ((lados[1]+lados[3])>lados[2]) {
                if (lados[1]==lados[2] && lados[1]==lados[3]) {
            tipo = "equilatero";
            altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[2]/2), 2)));
            area = (lados[1]*altura)/2;
            perimetro = (lados[1]+lados[2]+lados[3]);
        }
        //Aquí para ver si es isosceles
        else if (lados[1]==lados[3] || lados[2]==lados[3] || lados[1]==lados[2]) {
            tipo = "isosceles";
            if (lados[1]==lados[3]) {
                altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[2]/2), 2)));
                area = (lados[2]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
            else if (lados[2]==lados[3]) {
                altura = Math.sqrt((Math.pow(lados[2], 2))-(Math.pow((lados[1]/2), 2)));
                area = (lados[1]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
            else {
                altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[3]/2), 2)));
                area = (lados[3]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
        }
        
        //Ya por descarte, la unica opción que nos queda es que sea escaleno
        else {
            tipo = "escaleno";
            perimetro = (lados[1]+lados[2]+lados[3])/2;
            area = Math.sqrt((perimetro*(perimetro-lados[1])*(perimetro-lados[2])*(perimetro-lados[3])));
            perimetro *=2;
        }
         System.out.println("______________________________");
        System.out.println("Los datos de tu triangulo son: "
        +"\nArea = "+area
        +"\nPerimetro = "+perimetro
        +"\nTipo de triangulo = "+tipo);     
        
        
    
            }
            else {
                System.out.println("No existe ese triangulo");
            }
        }
        else {
            if ((lados[1]+lados[2])>lados[3]) {
                  if (lados[1]==lados[2] && lados[1]==lados[3]) {
            tipo = "equilatero";
            altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[2]/2), 2)));
            area = (lados[1]*altura)/2;
            perimetro = (lados[1]+lados[2]+lados[3]);
        }
        //Aquí para ver si es isosceles
        else if (lados[1]==lados[3] || lados[2]==lados[3] || lados[1]==lados[2]) {
            tipo = "isosceles";
            if (lados[1]==lados[3]) {
                altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[2]/2), 2)));
                area = (lados[2]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
            else if (lados[2]==lados[3]) {
                altura = Math.sqrt((Math.pow(lados[2], 2))-(Math.pow((lados[1]/2), 2)));
                area = (lados[1]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
            else {
                altura = Math.sqrt((Math.pow(lados[1], 2))-(Math.pow((lados[3]/2), 2)));
                area = (lados[3]*altura)/2;
                perimetro = lados[1]+lados[2]+lados[3];
            }
        }
        
        //Ya por descarte, la unica opción que nos queda es que sea escaleno
        else {
            tipo = "escaleno";
            perimetro = (lados[1]+lados[2]+lados[3])/2;
            area = Math.sqrt((perimetro*(perimetro-lados[1])*(perimetro-lados[2])*(perimetro-lados[3])));
            perimetro *=2;
        }
         System.out.println("______________________________");
        System.out.println("Los datos de tu triangulo son: "
        +"\nArea = "+area
        +"\nPerimetro = "+perimetro
        +"\nTipo de triangulo = "+tipo);     
        
        
    }
            else {
                System.out.println("No existe ese triangulo");
            }
            
        }
    }
}
