package ar.edu.unlam.inmobiliaria;

public class Cliente {
	protected Integer dni;
	protected String nombre;
	protected String apellido;

	public Cliente(Integer dni, String nombre, String apellido) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}

}
