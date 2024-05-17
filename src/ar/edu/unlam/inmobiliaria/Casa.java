package ar.edu.unlam.inmobiliaria;

public class Casa extends Propiedad {

	public Casa(Integer idCasa, String calle, Integer numero, String localidad, Double precio, Boolean estaDisponible,
			Propietario dueño, TipoDeOperacion tipo) {
		super(idCasa, calle, numero, localidad, precio, estaDisponible, dueño, tipo);
	}

	@Override
	public String toString() {
		return "Casa [id=" + id + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", precio="
				+ precio + ", estaDisponible=" + estaDisponible + ", dueño=" + dueño + ", tipo=" + tipo + "]";
	}
	
	
}
