package es.anderconal.modelo;

public class Persona {
	private int id;
	private String nombre;
	private int taxId;
	
	public Persona() {

	}
	
	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void hablar() {
		System.out.println("Hola, soy una persona");
	}
	
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", taxId=" + taxId +"]";
	}
}
