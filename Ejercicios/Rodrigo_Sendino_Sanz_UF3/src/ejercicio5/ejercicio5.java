/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;


import java.util.Scanner;


/**
 *
 * @author Rodri
 */
public class ejercicio5 {
   
public static void main(String[] args) {

    System.out.println("Vamos a simular un cajero de un super. Para hacer facil, vamos a trabajar solo con billetes de 50, 20, 10, 5, sin monedas. Por tanto, el importe sera siempre multiplo de 5.\n" +
    "a. Solicitamos el importe de la venta (multiplo de 5), y con cuanto me paga (igual o mayor al importe de la venta (multiplo de 5).\n" +
    "b. El programa informa, cuantos billetes le tengo que devolver.\n" +
    "c. Por ejemplo:\n" +
    "Importe venta 15, pagado 50. La salida sera¡: 1 de 20, 1 de 10 y 1 de 5.\n" +
    "Importe venta 25, pagado 200: 3 de 50, 1 de 20  y 1 de 5.\n" +
    "d. Suponemos que siempre tengo suficientes billetes de 50, de 20, de 10 y de 5 euros.");
    
    //Declaracion de variables
    Scanner sn=new Scanner(System.in);
    int dinero []= new int[6];//Array de almacenamiento del dinero

    int venta; //Creo una variable de precio a pagar en la cual se muestran numeros random que cumpla con la condicion de ser multiplo de 5 y van del 1 al 100
    do
    {
    venta = (int) (Math.random()*100 +1);
    }while (venta %5 != 0);
    
    int pago;//Cantidad que se introduce al pagar
    int i=0;

  
    System.out.println("Introduzca un su billete: ");
    System.out.println("(Solo se devuelven billetes de 50, 20, 10, 5‚ y monedas de 2 y 1)");
    System.out.println("Cantidad a pagar "+venta);
    System.out.println("Introduzca el pago: ");
    pago = Integer.parseInt(sn.nextLine());
    System.out.println("Valor introducuido es "+pago);

        if(pago >= venta){
       System.out.println("El pago es aceptado \n"
               + "Procesando pago");
            int vueltas = pago-venta;
            System.out.println("Las vueltas son "+ vueltas);
            //Segmenta la variable ventas en los diferentes billetes, aun que tambien he aÃ±adido monedas de 2 y 1 euro
            while(vueltas>0){
                while(vueltas-50>=0){
                    vueltas=vueltas-50;
                    dinero[0]++;
                }
                while(vueltas-20>=0){
                    vueltas=vueltas-20;
                    dinero[1]++;
                }
                while(vueltas-10>=0){
                    vueltas=vueltas-10;
                    dinero[2]++;
                }
                while(vueltas-5>=0){
                    vueltas=vueltas-5;
                    dinero[3]++;
                }
                while(vueltas-4>=0){
                    vueltas=vueltas-4;
                    dinero[4]++;
                    dinero[4]++;
                }
                while(vueltas-3>=0){
                    vueltas=vueltas-3;
                    System.out.println("1 monedas de 2 y una de 1 a devolver");
                    dinero[5]++;
                }
                while(vueltas-2>=0){
                    vueltas=vueltas-2;
                    dinero[4]++;
                }
                 while(vueltas-1>=0){
                    vueltas=vueltas-1;
                    System.out.println("1 moneda de 1â‚¬ a devolver");
                    dinero[5]++;
                }
                for(i=0;i<dinero.length;i++){
                    //El primer if hace que solo se impriman los ifs necesarios para el resultado y los otros se encargan de imprimir la devolucion.
                    if (dinero[i]!=0){
                    if (i==0)
                        System.out.println(dinero[i]+ " billetes de 50 a devolver");
                    if (i==1)
                        System.out.println(dinero[i]+ " billetes de 20 a devolver");
                    if (i==2)
                        System.out.println(dinero[i]+ " billetes de 10 a devolver");
                    if (i==3)
                        System.out.println(dinero[i]+ " billetes de 5 a devolver");
                    if (i==4)
                        System.out.println(dinero[i]+ " monedas de 2 a devolver");
                    if (i==5)
                        System.out.println(dinero[i]+ " moneda de 1 a devolver");
                    }
                }
            }
        }
        // Se ejecuta si el pago es menor que el precio de venta
       else{  
                 System.out.println("El pago no es valido ");
               }

    
    }   
    
}