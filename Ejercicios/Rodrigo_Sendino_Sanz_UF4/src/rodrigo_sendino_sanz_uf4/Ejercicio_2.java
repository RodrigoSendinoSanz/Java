/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo_sendino_sanz_uf4;
/**Ejercicio 2
Escribe un programa Java que funcione de acuerdo a las siguientes especificaciones:

Crea un array de String con distintas frases.
Ordena el array de menor a mayor. Y ahora por cada frase:
Se mostrará en pantalla la longitud del texto (número de caracteres).
Se mostrará el texto en mayúsculas.
Se mostrará el texto separado por palabras (cada palabra en una línea) usando el método split().
Se contará el número de letras minúsculas.
Se mostrará un triángulo con el texto introducido. */
import java.util.Scanner;

/**
 *
 * @author Rodri
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                 Scanner sn=new Scanner(System.in);
                System.out.println("Escribe un texto:");
                String texto = sn.nextLine(); 
                int cont=0;
                
		System.out.println("Longitud: "+texto.length());
                
                System.out.println(texto.toUpperCase());
                
                System.out.println("Palabra a palabra");
                String[] subcadenas = texto.split(" ");
                for (String subcadena : subcadenas) {
                System.out.println(subcadena);
                }
                System.out.println(texto.toLowerCase());
                
                for (int j=0; j < texto.length() ;j++){
                    char letra=texto.charAt(j);
                    if(Character.isLowerCase(letra)){
                    cont++;}
                }
                System.out.println("Hay "+cont+" letras minúsulas");
                System.out.println("El triangulo");
                System.out.println(texto);
                StringBuilder buildertexto = new StringBuilder(texto);
                for (int k=buildertexto.length()-1; k > 0;k--){
                    buildertexto.deleteCharAt(k);
                System.out.println(buildertexto);    
                }                 
    }

}



    
