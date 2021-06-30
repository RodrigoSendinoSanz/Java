/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaalaetorioarray;

/**
 *
 * @author Rodri
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int min=0;
        int max=21;
        
        int longitud=3;
        
        if((max-min) >=(longitud-1)){
            int numeroelemen=0;
            int numeros[]=new int[longitud];
            
            boolean encontrado;
            int aleatorio;
            
            while (numeroelemen<longitud){

                aleatorio=gennum(max,min);
                encontrado=false;
                
                for(int i=0;i<numeros.length && !encontrado;i++){
                    if(aleatorio==numeros[i]){
                        encontrado=true;
                    }
                }
                if(encontrado){
                    System.out.println("La carta existe"+aleatorio);
                
                }else{
                    numeros[numeroelemen++]=aleatorio;
                    System.out.println("Agregado"+aleatorio);
                }
            }
            System.out.println("Mostrar Arreglo");
            for(int i=0;i<numeros.length ;i++){
                     System.out.println(numeros[i]);
                                 if (numeros[i]==0){
                                 System.out.println("El Loco");
                                 }
                                 if (numeros[i]==1){
                                 System.out.println("El Mago");
                                 }
                                 if (numeros[i]==2){
                                 System.out.println("La Sacerdotisa");
                                 }
                                 if (numeros[i]==3){
                                 System.out.println("La Emperatriz");
                                 }
                                 if (numeros[i]==4){
                                 System.out.println("El Emperador");
                                 }
                                if (numeros[i]==5){
                                 System.out.println("El Sumo Sacerdote");
                                 }
                                if (numeros[i]==6){
                                 System.out.println("Los Enamorados");
                                 }
                                if (numeros[i]==7){
                                 System.out.println("El Carro");
                                 }
                                if (numeros[i]==8){
                                 System.out.println("La Fuerza");
                                 }
                                if (numeros[i]==9){
                                 System.out.println("El Ermitaño");
                                 }
                                if (numeros[i]==10){
                                 System.out.println("La Rueda de la Fortuna");
                                 }
                                if (numeros[i]==11){
                                 System.out.println("La Justicia");
                                 }
                                if (numeros[i]==12){
                                 System.out.println("El Colgado");
                                 }
                                if (numeros[i]==13){
                                 System.out.println("La Muerte");
                                 }
                                if (numeros[i]==14){
                                 System.out.println("La Templanza");
                                 }
                                if (numeros[i]==15){
                                 System.out.println("El Diablo");
                                 }
                                if (numeros[i]==16){
                                 System.out.println("La Torre");
                                 }
                                if (numeros[i]==17){
                                 System.out.println("La Estrella");
                                 }
                                if (numeros[i]==18){
                                 System.out.println("La Luna");
                                 }
                                if (numeros[i]==19){
                                 System.out.println("El Sol");
                                 }
                                if (numeros[i]==20){
                                 System.out.println("El Juicio");
                                 }
                                if (numeros[i]==21){
                                 System.out.println("El Mundo");
                                 }
                }  
        }else{
        System.out.print("Nose puede");
        }
    }
    public static int gennum(int min,int max){
        int num=(int) Math.floor(Math.random()*(min-(max+1))+(max+1));
    return num;
    }
    
}
