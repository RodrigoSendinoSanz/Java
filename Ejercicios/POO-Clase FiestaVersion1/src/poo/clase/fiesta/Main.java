/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.clase.fiesta;

import java.time.LocalDateTime;

/**
 *
 * @author Rodri
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LocalDateTime fech=LocalDateTime.now();
        LocalDateTime fech1=LocalDateTime.now();
        String fecha=fech.toString();
        
       
        String direccion= " C/ Bruno Abúndez 48",direccion1= "Glorieta Isamel Garcia Ramila 10";
        String tipo="Informaticos",tipo1="Cumpleaños";
        
        //Creacion de objetos
        // Fiesta 0
        //Instaciacion objeto f:
        Fiesta f=new Fiesta();
        
            f.setTipoFiesta(tipo);
            f.setfechaHora (fech.toString());
            f.setDireccion(direccion);
            f.invitar();
            f.setBocadillos(7);
            f.setBebidas(10);
        
        // Fiesta 1
        //Instaciacion objeto f1:
        Fiesta f1=new Fiesta(direccion,tipo,fecha,0,0,0);
        
            f1.setTipoFiesta(tipo1);
            f1.setfechaHora (fech1.toString());
            f1.setDireccion(direccion1);
            f1.invitar();
            f1.setBocadillos(12);
            f1.setBebidas(23);
        
        System.out.println("----Programa de fiestas----\n");
        System.out.println("Invitaciones y cancelaciones: \n");
        //Invitaciones y Cancelaciones (He creado el metodo GetInvitados para concreatar los invitados en vez de imprimir toda la cosulta)
        System.out.println("Fiesta 0: \n");
            System.out.println("Invitados:"+f.getInvitados());
            f.invitar();f.invitar();f.invitar();f.invitar();f.invitar();f.invitar();f.invitar();f.invitar();
            System.out.println("Invitados:"+f.getInvitados());
            f.cancelarInvitacion();
            System.out.println("Se efetua la operacion de cancelación");
            System.out.println("Invitados:"+f.getInvitados());
            System.out.println("\n");
        System.out.println("Fiesta 1: \n");
        //Invitaciones y Cancelaciones (He creado el metodo GetInvitados para concreatar los invitados en vez de imprimir toda la cosulta)
            System.out.println("Invitados:"+f1.getInvitados());
            f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();f1.invitar();
            System.out.println("Invitados:"+f1.getInvitados());
            f1.cancelarInvitacion();f1.cancelarInvitacion();f1.cancelarInvitacion();
            System.out.println("Se efetua la operacion de cancelación");
            System.out.println("Invitados:"+f1.getInvitados());

        
        
        
        //Consultas
        System.out.println("\n");
        System.out.println("Consulta de Fiesta 0:\n"
                + f.consultar());
        System.out.println("El precio de la fiesta es: "+f.PrecioFiesta()+ " € ");
              System.out.println("\n");
        System.out.println("Consulta de Fiesta 1:\n"
                + f1.consultar());
        System.out.println("El precio de la fiesta es: "+f1.PrecioFiesta()+ " € ");
        
        
    }
    
}
