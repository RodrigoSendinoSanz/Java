public class Principal {
	public static void main(String[] args) {
		
                Cliente cli1 = new Cliente
                  ("516667788K", "Pepe Sánchez", "616 677 788", "C/Oca, 45");
		
		cli1.setDireccion("C/ Perico, 34");
		System.out.println(cli1.consultar());
		System.out.println("DNI: "+cli1.getDni());
	}
}