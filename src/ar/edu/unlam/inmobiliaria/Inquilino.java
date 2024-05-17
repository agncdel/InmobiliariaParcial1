package ar.edu.unlam.inmobiliaria;

public class Inquilino extends Cliente {
	private Integer cantidadAlquileres;

	public Inquilino(Integer dni, String nombre, String apellido, Integer cantidadAlquileres) {
		super(dni, nombre, apellido);
		this.cantidadAlquileres = cantidadAlquileres;
	}

}
