package es.anderconal.modelo;

public class Direccion {
	private String calle;
	private String codigoPostal;
	
	public Direccion(String calle, String codigoPostal) {
		super();
		this.calle = calle;
		this.codigoPostal = codigoPostal;
	}
	
	public void iniciar() {
		System.out.println("Bean creado: " + this);
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", codigoPostal=" + codigoPostal + "]";
	}
}
