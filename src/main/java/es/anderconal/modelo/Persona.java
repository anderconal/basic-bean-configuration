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
	
	public static Persona getInstancia(int id, String nombre) {
		System.out.println("Creando una persona con un método de fabricación.");
		return new Persona(id, nombre);
	}
	
	public void alCrear() {
		System.out.println("Persona creada: " + this);
	}
	
	public void alDestruir() {
		System.out.println("Persona destruida: " + this);
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
