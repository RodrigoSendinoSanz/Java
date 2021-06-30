import java.util.Scanner;

public class Principal {

              public static void main(String args[]) throws NumerosRojosException {

                            Scanner lector = new Scanner(System.in);

                            System.out.println

                       ("Vamos a crear una cuenta y realizar el primer ingreso de 100 euros");

                           CuentaBancaria miCuenta = new CuentaBancaria

                           (38143, "Amelia Gonzolez");

                           miCuenta.agregarMovimiento("Ingreso inicial ", 100);

                           System.out.println("Cuanto dinero deseas retirar: ");
                           
                        try {
                           int dinero;

                           dinero = Integer.parseInt(lector.nextLine());

                           miCuenta.agregarMovimiento("Retirada de fondos ",-dinero);

                           lector.close();
                           
                           System.out.println(miCuenta);

                           System.out.println(miCuenta.listarMovimientos());
                		} 
                        
                        catch (NumerosRojosException e) {
                			System.out.println(e.toString());
                		}                       
                        catch (NumberFormatException n) {
                			System.out.println(n.getMessage()+ " Solo se aceptan numeros");
                		}


               }

}