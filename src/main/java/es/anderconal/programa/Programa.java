package es.anderconal.programa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.anderconal.modelo.Direccion;
import es.anderconal.modelo.Persona;

public class Programa {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("es/anderconal/beans/beans.xml");
		
		Direccion direccionDos = (Direccion) context.getBean("direccionDos");
		System.out.println(direccionDos);
		
		((ClassPathXmlApplicationContext)context).close();

	}

}
