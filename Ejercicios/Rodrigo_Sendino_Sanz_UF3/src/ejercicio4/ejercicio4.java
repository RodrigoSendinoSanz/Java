/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Rodri
 */
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    
    
  public static void main(String[] args)  {
    Scanner sn = new Scanner(System.in);
    //Declaracion de variables
    int num1 = (int) (Math.random()*10+1);
    int num2 = (int) (Math.random()*10+1);
    boolean salir =false;
    int opcion;

    System.out.println("Realiza un programa en Java que vaya generando 2 numeros al azar entre 1 y 10. \n" +
    "Escribe un numero con el siguiente contenido:\n" +
    "1. Sumar\n" +
    "2. Restar\n" +
    "3. Multiplicar\n" +
    "4. Dividir\n" +
    "5. Resto de la division\n" +
    "6. Terminar\n" +
    "Pide por teclado la opcion deseada, y generas un metodo por cada opcion, que reciba los numeros obtenidos al azar y devuelva el resultado de la opcion requerida.\n" +
    "Cuando la opcion sea 6, terminas el proceso.\n"+
    "Si la opcion es incorrecta, muestras el mensaje, opcion incorrecta y pides otro numero\n \n");
    
    while (!salir){
    	
    System.out.println("Numero 1 = "+num1);
    System.out.println("Nuemro 2 = "+num2);  
    System.out.println("\n");
        System.out.println("[Menu de operaciones]");
        System.out.println("Escriba el numero para realizar la operacion:");
        System.out.println("1. Suma");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Resto de la division");
        System.out.println("6. Terminar");
    opcion = sn.nextInt();
    // Creo un menu switch con cada operacion donde la realiza y la imprime, en la opcion 6 convierto salir a true y salgo del while
    switch(opcion){
        case 1 -> {
            int suma = num1 + num2;
            System.out.println("La suma de "+num1+" y numero "+num2+" es "+suma);
            }
        case 2 -> {
            int resta = num1 - num2;
            System.out.println("La resta de "+num1+" y "+num2+" es "+resta);
            }
        case 3 -> {
                        int multiplicacion = num1*num2;
                        System.out.println("La multiplicaci??n de "+num1+" y "+num2+" es "+multiplicacion);
            }
        case 4 -> {
                       double division=(double)num1/num2;
                       System.out.println("La divisi??n de "+num1+" y "+num2+" es "+division);
           }
        case 5 -> {
                        int resto= num1%num2;
                        System.out.println("La resto de "+num1+" y "+num2+" es "+resto);
            }
        case 6 -> {
                        salir=true;
                        System.out.println("Saliendo del sistema");   
            }
                    default -> System.out.println("La opcion no es valida vuelve a elegir");
     }
    }
   }              
}