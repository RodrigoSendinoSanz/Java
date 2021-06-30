public class Coche {
	// Propiedades privadas
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private int velocidad = 0;
	
	public Coche(String matricula, String marca, String modelo, String color) {
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = 0;
	}
//METODOS ACELERAR
	public void acelerar() {
		this.velocidad = this.velocidad + 10;
	}
	
	public void frenar() {
		this.velocidad = this.velocidad - 10;
	}
	
	public void acelerar(int cuanto) {
		this.velocidad = this.velocidad + cuanto;
	}
	
	public void frenar(int cuanto) {
		this.velocidad = this.velocidad - cuanto;
	}
	
	public String estadoCoche() {
		return this.marca + " " + this.modelo + " " + this.matricula + " " 
		+ this.color + " va a una velocidad de " + this.velocidad;
	}
	protected void finalize()  {
		System.out.println("Se ha borrado el objeto");
	}
	
}