/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodrigo_sendino_sanz_uf4;
/**Ejercicio 1
En recursos humanos van a aplicar una política de aumento de sueldo, con arreglo a la siguiente regla. 
Crea dos array de enteros, uno para las comisiones y otro para los sueldos, con el mismo número de elementos cada uno:
a. Si la comisión es cero, nos fijamos en el sueldo y
Sueldo menor de 15000, aplicamos un 10% de subida
Sueldo entre 15000 y 30000 aplicamos un 8% subida
Sueldo entre 30001 y 45000 aplicamos un 4% subida
Por encima de 45000, no hay subida
b. Si la comisión es > 0, nos fijamos en la comisión y
Si es menor de 2000 aumentamos el sueldo un 12%
Si está comprendido entre 2000 y 10000 aumentamos el sueldo un 6%
Si es mayor no le aumentamos nada.
c. Informamos al final de
Cuanto ganaba al principio,
Qué % de subida le corresponde
Cuánto supone el aumento (cero si no es nada)
En cuánto se le queda el sueldo.
Crea parejas de datos en ambos array para al menos ejecutar cada rama del programa al menos una vez.*/
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {


        //Declaracion las variables:
        int sueldo []={14000,17000,42000,46000,1200,3455,3453 };
        float comisiones []={0,0,0,0,1800,3000,11000 };
        float Ncomisiones[]= new float[comisiones.length];
        //Bucle para recorrer el array de sueldos
            for (int i=0;i<sueldo.length;i++){
                //Segmentacion de los aumentos en funcion del sueldo
                if (comisiones[i] == 0){
                    if(sueldo[i]<= 1500 && comisiones[i] == 0f){
                        Ncomisiones[i] = sueldo[i] *0.10f;
                    }
                    else if (sueldo[i] > 15000 && sueldo[i] <= 30000 && comisiones[i] == 0f){
                        Ncomisiones[i] = sueldo[i] *0.08f;
                    }
                    else if (sueldo[i] > 30001 && sueldo[i] <= 45000 && comisiones[i] == 0f){
                        Ncomisiones[i] = sueldo[i] *0.04f;
                    }
                    else if(sueldo[i] > 45000 && comisiones[i] == 0f){
                        Ncomisiones[i] = sueldo[i] *0.00f;
                    }else if (comisiones[i]!=0f){
                        Ncomisiones[i] = comisiones[i];
                    }
            }//Segmentacion de los aumentos en funcion de las comisiones
                if(comisiones[i] > 0f){
                    
                    if(comisiones[i]< 2000){
                        Ncomisiones[i] = sueldo[i] *0.12f;
                    }
                    else if(comisiones[i] > 2000 && comisiones[i] <= 10000){
                        Ncomisiones[i] = sueldo[i] *0.06f;
                    }
                    else if(comisiones[i] > 10000){
                        Ncomisiones[i] = sueldo[i] *0.00f;
                    }
                }
        }
        //Bucle para imprimir los resultados finales
        for (int i=0;i<sueldo.length;i++){
        System.out.println("Empleado "+i+" con el sueldo "+sueldo[i]+" tiene una comision "
                           +comisiones[i]+" se le añade una comision de "+Ncomisiones[i]+" y le da un totas de "+(sueldo[i]+comisiones[i]));
        }
    }
}
    

