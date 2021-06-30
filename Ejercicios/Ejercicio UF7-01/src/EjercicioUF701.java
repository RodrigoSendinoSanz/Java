/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodri
 */
public class EjercicioUF701 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Alumno alu = new Alumno ("Paula Gonzalez ", 2347323);
                alu.calificar("Matematicas ", 70);
                alu.calificar("Plastica ", 80);
                alu.calificar("Lengua ", 90);
				
                Alumno alu1 = new Alumno ("Jesus Rodriguez ", 2364739);
                alu1.calificar("Matematicas ", 60);
                alu1.calificar("Plastica ", 50);
                alu1.calificar("Lengua ", 80);
                
		System.out.println(alu.toString());
                System.out.println(alu1.toString());
    }
    
}
