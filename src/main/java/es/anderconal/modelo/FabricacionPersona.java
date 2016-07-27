package es.anderconal.modelo;

public class FabricacionPersona {
	public Persona crearPersona(int id, String nombre) {
		System.out.println("Utilizando una clase de fabricación para crear una persona.");
		return new Persona(id, nombre);
	}
}
