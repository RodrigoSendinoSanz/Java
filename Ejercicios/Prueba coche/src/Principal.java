public class Principal {
	public static void main(String[] args) {
		Coche objCoche1 = new Coche("1111JPK", "AUDI", "A7", "AZUL");
		Coche objCoche2 = new Coche("1111JBU", "NISSAN", "SUPRA", "VERDE");
		
		objCoche1.acelerar();
		objCoche1.acelerar(50);;
		objCoche2.acelerar();
		objCoche2.acelerar(30);
		objCoche2.frenar(20);
		System.out.println("Mostrando información de objCoche1");
		System.out.println(objCoche1.estadoCoche());
		System.out.println("Mostrando información de objCoche2");
		System.out.println(objCoche2.estadoCoche());
		
		objCoche1 = null;
		objCoche2 = null;
		
		Runtime garbage = Runtime.getRuntime();
		garbage.gc();
	}
}
