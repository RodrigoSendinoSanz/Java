/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Rodri
 */
public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
 public static void main(String args[])
   {
        System.out.println("Introducir por teclado(clase Scanner, metodos nextInt(), tres numeros enteros correspondientes a los lados de un triangulo.\n" +
"\n" +
"a. Para que sea un triangulo valido se debe cumplir que la suma de cualquiera de dos lados sea superior al otro.\n" +
"\n" +
"b. Una vez que es válido Escribir si el triangulo es equilatero isosceles o escaleno");
        System.out.println(" \n");
       
       
      Scanner teclado = new Scanner(System.in);
      System.out.println("Introduzca los valores para los lados del triangulo:");
 
      System.out.print("Lado a: ");
      int a = teclado.nextInt();
 
      System.out.print("Lado b: ");
      int b = teclado.nextInt();
 
      System.out.print("Lado c: ");
      int c = teclado.nextInt();
            
      

        if ((a+b>c) && (b+c>a) && (a+c>b)){
            if ( a == b && b == c )
                System.out.println("Triangulo equilatero");
            else if ( a == b || b == c || a == c )
                System.out.println("Triangulo isoceles");
            else
                System.out.println("Triangulo escaleno");
        }
        else{
            System.out.println("El triangulo no es valido");
        }

    }
}