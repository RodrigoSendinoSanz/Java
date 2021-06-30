/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Rodrigo Sendino Sanz
 */
public class NombreHacker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    		
            try (Scanner myObj = new Scanner(System.in)) {
            	
				String oldString1;
				
				System.out.println("\r\n"
						+ "████████╗██████╗░░█████╗░██████╗░██╗░░░██╗░█████╗░████████╗░█████╗░██████╗░\r\n"
						+ "╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗██║░░░██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗\r\n"
						+ "░░░██║░░░██████╔╝███████║██║░░██║██║░░░██║██║░░╚═╝░░░██║░░░██║░░██║██████╔╝\r\n"
						+ "░░░██║░░░██╔══██╗██╔══██║██║░░██║██║░░░██║██║░░██╗░░░██║░░░██║░░██║██╔══██╗\r\n"
						+ "░░░██║░░░██║░░██║██║░░██║██████╔╝╚██████╔╝╚█████╔╝░░░██║░░░╚█████╔╝██║░░██║\r\n"
						+ "░░░╚═╝░░░╚═╝░░╚═╝╚═╝░░╚═╝╚═════╝░░╚═════╝░░╚════╝░░░░╚═╝░░░░╚════╝░╚═╝░░╚═╝\r\n"
						+ "\r\n"
						+ "██╗░░██╗░█████╗░░█████╗░██╗░░██╗███████╗██████╗░\r\n"
						+ "██║░░██║██╔══██╗██╔══██╗██║░██╔╝██╔════╝██╔══██╗\r\n"
						+ "███████║███████║██║░░╚═╝█████═╝░█████╗░░██████╔╝\r\n"
						+ "██╔══██║██╔══██║██║░░██╗██╔═██╗░██╔══╝░░██╔══██╗\r\n"
						+ "██║░░██║██║░░██║╚█████╔╝██║░╚██╗███████╗██║░░██║\r\n"
						+ "╚═╝░░╚═╝╚═╝░░╚═╝░╚════╝░╚═╝░░╚═╝╚══════╝╚═╝░░╚═╝\r\n");
				
				System.out.println("Escr1b3_tu_fr4s3_4_c0nt1nu4c10n_p4r4_c0nv3rt1r_tu_t3xt0_4_3l_1d0m4_h4ck3r: \r\n");
				
				do {
				    oldString1 = myObj.nextLine();

				    String newString1 = oldString1.replace("o", "0").replace(" ", "_").replace("e", "3").replace("a", "4").replace("i", "1")+"\r\n";
				    
					    if(oldString1.equalsIgnoreCase("Fin")!=(true)){
					    System.out.println(newString1);
					    }
					    
					}while(oldString1.equalsIgnoreCase("Fin")!=(true));		
	            System.out.println("\n");
	            
	            System.out.println("Saliendo del sistema"); 
			}catch(Exception e) {
			      System.out.println("Has roto es sistema");
		    }

	    }
       
    }