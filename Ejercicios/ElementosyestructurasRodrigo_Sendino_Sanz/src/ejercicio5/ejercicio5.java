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
    System.out.println("๐๐ฃ๐๐ซ๐๐ข๐๐ข๐จ ๐");
    System.out.println("Vamos a simular un cajero de un super. Para hacer fรกcil, vamos a trabajar solo con billetes de 50โฌ, 20โฌ, 10โฌ, 5โฌ, sin monedas. Por tanto, el importe serรก siempre mรบltiplo de 5.\n" +
    "a. Solicitamos el importe de la venta (mรบltiplo de 5), y con cuanto me paga (igual o mayor al importe de la venta (mรบltiplo de 5).\n" +
    "b. El programa informa, cuantos billetes le tengo que devolver.\n" +
    "c. Por ejemplo:\n" +
    "Importe venta 15, pagado 50. La salida serรก: 1 de 20, 1 de 10 y 1 de 5.\n" +
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

    System.out.println("๐๐ซ๐จ๐ ๐ซ๐๐ฆ๐ ๐๐ ๐ฉ๐๐ ๐จ ๐๐ ๐ฌ๐ฎ๐ฉ๐๐ซ๐ฆ๐๐ซ๐๐๐๐จ");
    System.out.println("Introduzca un su billete: ");
    System.out.println("(Solo se devuelven billetes de 50โฌ, 20โฌ, 10โฌ, 5โฌ y monedas de 2โฌ y 1โฌ)");
    System.out.println("Cantidad a pagar "+venta+" โฌ");
    System.out.println("Introduzca el pago: ");
    pago = Integer.parseInt(sn.nextLine());
    System.out.println("Valor introducuido es "+pago+"โฌ");

        if(pago >= venta){
       System.out.println("El pago es aceptado \n"
               + "Procesando pago");
            int vueltas = pago-venta;
            System.out.println("Las vueltas son "+ vueltas+"โฌ");
            //Segmenta la variable ventas en los diferentes billetes, aun que tambien he aรฑadido monedas de 2 y 1 euro
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
                    System.out.println("1 monedas de 2โฌ y una de 1โฌ a devolver");
                    dinero[5]++;
                }
                while(vueltas-2>=0){
                    vueltas=vueltas-2;
                    dinero[4]++;
                }
                 while(vueltas-1>=0){
                    vueltas=vueltas-1;
                    System.out.println("1 moneda de 1โฌ a devolver");
                    dinero[5]++;
                }
                for(i=0;i<dinero.length;i++){
                    //El primer if hace que solo se impriman los ifs necesarios para el resultado y los otros se encargan de imprimir la devolucion.
                    if (dinero[i]!=0){
                    if (i==0)
                        System.out.println(dinero[i]+ " billetes de 50 โฌ a devolver");
                    if (i==1)
                        System.out.println(dinero[i]+ " billetes de 20 โฌ a devolver");
                    if (i==2)
                        System.out.println(dinero[i]+ " billetes de 10 โฌ a devolver");
                    if (i==3)
                        System.out.println(dinero[i]+ " billetes de 5 โฌ a devolver");
                    if (i==4)
                        System.out.println(dinero[i]+ " monedas de 2 โฌ a devolver");
                    if (i==5)
                        System.out.println(dinero[i]+ " monedas de โฌ a devolver");
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