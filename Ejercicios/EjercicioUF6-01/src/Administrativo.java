


public class Administrativo extends Persona{
	String tareas;
	public Administrativo() {
		super();
		this.tareas="";
	}

	public Administrativo(String nif, String nombre, String direccion, String telefono, String tareas) {
		super(nif,nombre,direccion,telefono);
		this.tareas=tareas;		
	}
		
	public String getTareas() {
		return tareas;
	}
	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	public String trabajar() {
		return ("El admisnitrativo "+super.getNombre()+ " "+"va a realizar la tarea "+this.getTareas());
		}
	public String gestionarMatricula() {
		return ("El admisnitrativo "+super.getNombre()+" "+" va a gestionar la matricula");	
	}
	public String toString() {
		return (super.toString()+ "Tareas: "+this.tareas);
	}

	
}
