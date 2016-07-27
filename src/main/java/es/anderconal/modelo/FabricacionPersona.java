package es.anderconal.modelo;

public class FabricacionPersona {
	public Persona crearPersona(int id, String nombre) {
		System.out.println("Utilizando una clase de fabricaci�n para crear una persona.");
		return new Persona(id, nombre);
	}
}
