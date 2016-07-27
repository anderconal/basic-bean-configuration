package es.anderconal.modelo;

public class Direccion {
	private String calle;
	private String codigoPostal;
	
	public Direccion() {
		
	}
	
	public Direccion(String calle, String codigoPostal) {
		super();
		this.calle = calle;
		this.codigoPostal = codigoPostal;
	}
	
	public void iniciar() {
		System.out.println("Bean creado: " + this);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", codigoPostal=" + codigoPostal + "]";
	}
}
