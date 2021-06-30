
public abstract class Persona {
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;

	public Persona() {
		this.nif = "";
		this.nombre = "";
		this.direccion ="";
		this.telefono = "";	
	    }
	
	public Persona(String nif, String nom, String dir, String tel) {
		this.nif = nif;
		this.nombre = nom;
		this.direccion =dir;
		this.telefono = tel;	
	    }
	

	//Llamar 
	public String llamar(Persona P) {
		return (this.nombre+" llamando a "+P.getNombre());	
	}
	//Trabajar abstracto (Al definir tabajat como abstracto la clase entera debe incluir abstract)
	abstract public String trabajar();
	
	//To string
	@Override
	public String toString() {
		return ("Persona: "+"DNI "+this.nif+" Nombre "+this.nombre+" Telefono "+this.telefono+" ");
	}
	
	//Getter y Setter
	String getNif() {
		return nif;
	}
	void setNif(String nif) {
		this.nif = nif;
	}
	String getNombre() {
		return this.nombre;
	}
	void setNombre(String nom) {
		this.nombre = nom;
	}
	String getDireccion() {
		return this.direccion;
	}
	void setDireccion(String dir) {
		this.direccion = dir;
	}
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String tel) {
		this.telefono = tel;
	}

}
