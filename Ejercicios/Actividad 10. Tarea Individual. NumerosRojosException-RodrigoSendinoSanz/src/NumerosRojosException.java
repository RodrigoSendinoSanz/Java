
public class NumerosRojosException extends Exception {

	private static final long serialVersionUID = 1L;
	public double newsaldo;
	public NumerosRojosException(int newsaldo) {
		super();
		this.newsaldo = newsaldo;

	}

	@Override
	public String toString() {
		return "No se puede retirar el dinero, los fondos no son suficientes";
	}


}
