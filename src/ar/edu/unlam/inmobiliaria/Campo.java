package ar.edu.unlam.inmobiliaria;

public class Campo extends Propiedad{

	public Campo(Integer id, String calle, Integer numero, String localidad, Double precio, Boolean estaDisponible,
			Propietario dueño, TipoDeOperacion tipo) {
		super(id, calle, numero, localidad, precio, estaDisponible, dueño, tipo);
	}

	@Override
	public String toString() {
		return "Campo [id=" + id + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad + ", precio="
				+ precio + ", estaDisponible=" + estaDisponible + ", dueño=" + dueño + ", tipo=" + tipo + "]";
	}

}
