
public class Cliente {
  private String dni;
  private String nombre;
  private String telefono;
  private String direccion;
	
public String consultar() {
		return "El cliente " + this.nombre +
			" vive en " + this.direccion +
			" su teléfono: " + this.telefono;
}

public Cliente(String dni, String nombre, String telefono, String direccion) {
	super();
	this.dni = dni;
	this.nombre = nombre;
	this.telefono = telefono;
	this.direccion = direccion;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getDni() {
	return dni;
}

public String getNombre() {
	return nombre;
}

public String getTelefono() {
	return telefono;
}


}