package es.anderconal.programa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.anderconal.modelo.Direccion;
import es.anderconal.modelo.Persona;

public class Programa {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("es/anderconal/beans/beans.xml");
		
		Persona persona = (Persona) context.getBean("persona");
		persona.hablar();
		
		Persona personaDos = (Persona) context.getBean("persona");
		personaDos.hablar();
		persona.setTaxId(111);
		
		System.out.println(persona);
		System.out.println(personaDos);
		
		Direccion direccion = (Direccion) context.getBean("direccion");
		System.out.println(direccion);
		
		System.out.println(persona);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
