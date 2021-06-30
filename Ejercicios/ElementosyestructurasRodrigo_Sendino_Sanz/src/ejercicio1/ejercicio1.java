package ejercicio1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodri
 */
public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
   System.out.println("𝐄𝐣𝐞𝐫𝐜𝐢𝐜𝐢𝐨 𝟏"); 
   System.out.println("Declara una variable llamada num1 y asígnale un valor al azar del 1 al 20. \n Luego declara otra variable llamada num2. Si num1 está comprendido entre 5 y 15 (ambos inclusive) asigna a num2 el resultado de la operación num1+15, de lo contrario asigna a num2 el resultado de la operación num1+5.\n Al final muestra en pantalla el valor de ambas variables.");
   System.out.println(" ");
    //Declaración de variables
    int num1 = (int) (Math.random()*20+1);
    int num2=0;
    // Codigo: Con el if compurebo si num1 esta comprendido entre 5 y 15 y hacer la suma y con else le sumo los 5
        if (num1<15 || num1<5) {
        num2 = num1+15;
        }
        else{
        num2 = num1+5;
        }
        System.out.println("Los numeros son "+num1+" y "+num2); 
    }
}
    
    

