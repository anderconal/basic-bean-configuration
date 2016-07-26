package es.anderconal.programa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.anderconal.modelo.Persona;

public class Programa {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("es/anderconal/beans/beans.xml");
		
		Persona persona = new Persona();
		persona.hablar();
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
