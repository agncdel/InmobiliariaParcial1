package ar.edu.unlam.inmobiliaria;

public class PH extends Propiedad{

	public PH(Integer idCasa, String calle, Integer numero, String localidad, Double precio, Boolean estaDisponible,
			Propietario dueño, TipoDeOperacion tipo) {
		super(idCasa, calle, numero, localidad, precio, estaDisponible, dueño, tipo);
	}

	@Override
	public String toString() {
		return "PH [id=" + id + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", precio="
				+ precio + ", estaDisponible=" + estaDisponible + ", dueño=" + dueño + ", tipo=" + tipo + "]";
	}
	
}
