import com.itt.libreria.Autor;
import com.itt.libreria.Libro;
/**
*
* @author Rodri
*/
public class Principal {

	public static void main(String[] args) {
		Autor escritor = new Autor("Brandon Sanderson","Brandon Sanderson, "
																		+ "es un escritor estadounidense de literatura fantástica y ciencia "
																		+ "ficción. Nacido en Nebraska, ​ es mormón​ y actualmente reside en Provo, "
																		+ "Utah, con su mujer Emily, con la que contrajo matrimonio el 7 de julio de 2006.​");
		Libro libro = new Libro ("El camino de los reyes","Narrativa",escritor);
		//Invoca al método toString() del nuevo objeto Libro.
		System.out.println(libro.toString());
		//Modifica la biografía del autor a través del objeto libro que has creado.
		libro.getAutor().setBiografia("(Lincoln, Nebraska, 1975) es el gran renovador de la fantasía del siglo XXI y el autor más prolífico del mundo."
									+ " Desde que debutara en 2006 con su novela Elantris, ha deslumbrado a diecisiete millones de lectores en treinta lenguas con el Cosmere"
									+ ", el fascinante universo de magia que comparten la mayoría de sus obras.");
		//Invoca al método toString() del objeto Autor que has creado de dos formas distintas: a partir de la referencia al objeto Libro y a partir de la referencia al objeto Autor que creaste.
		System.out.println(escritor.toString());
		System.out.println(libro.getAutor().toString());
		//Modifica el valor de la propiedad genero y vuelve a invocar al método toString() para ver los cambios.
		libro.setGenero("Narrativa fantástica");
		System.out.println(libro.toString());
	}

}
