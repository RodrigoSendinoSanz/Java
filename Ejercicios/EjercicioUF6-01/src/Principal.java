
public class Principal {

	public static void main(String[] args) {

		Profesor prof= new Profesor ("111323232","Pepe Garcia de Lerma","Calle Vitoria 12","6277834252","Programacion");
		Alumno alu=new Alumno("9999999","Alicia Torres","Calle Derechos humanos,10","383462762827","1º Diseño web");
		Administrativo adm= new Administrativo ("9999993","Rosa Torres","Bergantin n10", "9876845","Hacer las matriculas, control de asistencia");
		
		//Acciones a tomar:
		
		
		//Ejecuta el método toString() sobre cada uno de ellos.
		
		System.out.println(prof.toString());
		
		System.out.println(alu.toString());
		
		System.out.println(adm.toString());
		
		
		//Ejecuta el método trabajar() sobre cada uno de ellos.
		
		System.out.println(prof.trabajar());
		
		System.out.println(alu.trabajar());
		
		System.out.println(adm.trabajar());
		
		//Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.
		
		System.out.println("---------------------Alumno llamando a Profesor----------------------");
		System.out.println(alu.llamar(prof));
		
		//Ejecuta el método ponerNotas() del objeto Profesor.
		
		System.out.println("---------------------Profesor va a corregir exámenes----------------------");
		System.out.println(prof.ponerNotas());
		
		//Ejecuta el método hacerExamen() del objeto Alumno.
		
		System.out.println("---------------------El alumno va a hacer su examen----------------------");
		System.out.println(alu.hacerExamen());
		
		//Ejecuta el método gestionarMatricula() del objeto Administrativo.
		
		System.out.println("---------------------El administrativo va a hacer una gestión----------------------");
		System.out.println(adm.gestionarMatricula());
		
	}

}
