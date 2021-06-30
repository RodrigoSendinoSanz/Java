
public class Profesor extends Persona{
	private String competencias;
	public Profesor() {
		super();
		this.competencias="";
	}
	public Profesor(String nif,String nombre,String direccion,String telefono,String comp) {
	super(nif, nombre, direccion, telefono);
	this.competencias=comp;
	}
	
	public String getCompetencias() {
		return competencias;
	}

	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	
	public String ponerNotas() {
		return ("El profesor "+super.getNombre()+" "+" va poner las notas");	
	}

	@Override
	public String trabajar() {
		return ("El profesor "+super.getNombre()+" "+"va a realizar la siguiente competencia "+this.competencias);
		}
	@Override
	public String toString() {
		return (super.toString()+ "Competencia: "+this.competencias);
	}


}
