/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Rodri
 */
public class ejercicio3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       System.out.println("Necesitamos contar los numeros, en orden inverso de 10 en 10 desde 100 hasta 10 (100, 90, 80, 10) \n Realiza dos programas en Java, cada uno de ellos con dos estructuras de control distintas, que realicen la tarea indicada.");
        //Codigo: primero ejecuta el bloque de accion con el do y luego evalúa la condician con el while respando 10 hasta llegar a 10
      System.out.println("Los numeros del 10 al 100 en orden inverso son: ");
      int i=110;
        do {
        i=i-10;
        System.out.println(i);
        }
        while (i>10);
        }
}