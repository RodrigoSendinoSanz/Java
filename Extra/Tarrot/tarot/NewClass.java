/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarot;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Rodri
 */
public class NewClass {
    public static String[] subArray (int maxSize,String[] cartas ){
    String[] newArray=null;
        if ( maxSize > 0 && maxSize <= cartas.length ) {
            /*Ordenamos el array original de forma aleatoria*/
            Collections.shuffle(Arrays.asList(cartas));
            /*Creamos el nuevo array extrayendo únicamente maxSize elementos*/
            newArray = Arrays.copyOfRange(cartas, 0, maxSize);
            

        }
    return newArray;
}
    public static String[] orien (int maxSize,String[] orientacion ){
    String[] newArray=null;
        if ( maxSize > 0 && maxSize <= orientacion.length ) {
            /*Ordenamos el array original de forma aleatoria*/
            Collections.shuffle(Arrays.asList(orientacion));
            /*Creamos el nuevo array extrayendo únicamente maxSize elementos*/
            newArray = Arrays.copyOfRange(orientacion, 0, maxSize);
        }
    return newArray;
    }   
}