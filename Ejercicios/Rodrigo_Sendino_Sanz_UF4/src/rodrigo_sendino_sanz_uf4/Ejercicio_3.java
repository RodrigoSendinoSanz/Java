/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo_sendino_sanz_uf4;
/**Ejercicio 3
Escribe un programa Java que funcione de acuerdo a las siguientes esp ecificaciones:
Debe permitir al usuario introducir varios textos terminando cuando escriba la palabra FIN. Cada texto debe guardarse en un objeto de tipo String.
Por cada texto introducido (menos la palabra FIN) el programa debe informar del número de caracteres.
Se deben ir concatenando todos los textos introducidos convertidos a mayúsculas (menos la palabra FIN) en un objeto de tipo StringBuilder.
Dentro del objeto StringBuilder cada texto nuevo debe terminar con el carácter punto y coma.
Por último, debemos utilizar un objeto de la clase StringTokenizer para volver a mostrar los textos introducidos en líneas separadas.*/


import java.util.StringTokenizer;
import java.util.Scanner;

/**
 *
 * @author Rodri
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        String n ="";
        StringBuilder b = new StringBuilder(n);
        Scanner sn = new Scanner(System.in);
 
        boolean f=false;
        
        
        System.out.println("Escribe los nombres");
        n=sn.next().toUpperCase();
                        
        while(!f){
            if(n.equals("FIN")){
                    f=true;
            }
            else{
            System.out.println("Longitud: "+n.length());
            //Sumar los nombres y el ; a la cadena
            b.append(n);
            b.append(";");

            //muestra cadena
            System.out.println("Escribe los nombres");
            n=sn.next().toUpperCase();
            }
        }
        String token = b.toString();
        StringTokenizer texto = new StringTokenizer(token,";");
		while (texto.hasMoreTokens()) {
			System.out.println(texto.nextToken());
        }
     }
}

