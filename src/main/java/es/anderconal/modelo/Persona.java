package es.anderconal.modelo;

public class Persona {
	private int id;
	private String nombre;
	private int taxId;
	private Direccion direccion;
	
	public Persona() {

	}
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void hablar() {
		System.out.println("Hola, soy una persona");
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", taxId=" + taxId + ", direccion=" + direccion + "]";
	}
}
