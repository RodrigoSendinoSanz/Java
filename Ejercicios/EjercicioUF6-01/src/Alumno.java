
public class Alumno extends Persona{
	private String curso;
	public Alumno() {
		super();
		this.curso="";
	}
	public Alumno(String nif,String nombre,String direccion,String telefono,String cur) {
	super(nif, nombre, direccion, telefono);
	this.curso=cur;
	}
	String getCurso() {
		return (this.curso);
	}
	void setCurso(String cur) {
		this.curso = cur;
	}

	public String hacerExamen() {
		return ("El alumno "+super.getNombre()+" "+" va hacer su examen");	
	}

	@Override
	public String trabajar() {
		return ("El alumno "+super.getNombre()+" "+"cursa "+this.curso);
		}
	
	@Override
	public String toString() {
		return (super.toString()+ "Curso: "+this.curso);
	}

}
