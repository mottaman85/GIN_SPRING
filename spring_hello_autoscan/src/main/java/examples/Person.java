package examples;

import org.springframework.beans.factory.annotation.Required;

public class Person {

	String nombre;
	int edad;
	
	public String getNombre() {
		return nombre;
	}
	
	@Required
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
