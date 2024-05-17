package ar.edu.unlam.inmobiliaria;

public class Propietario extends Cliente {
	private Integer cantidadPropiedades;

	public Propietario(Integer dni, String nombre, String apellido, Integer cantidadPropiedades) {
		super(dni, nombre, apellido);
		this.cantidadPropiedades = cantidadPropiedades;
	}

}
