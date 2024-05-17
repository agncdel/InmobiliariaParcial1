package ar.edu.unlam.inmobiliaria;

public class Terreno extends Propiedad{
	private Double mCuadrados;
	public Terreno(Integer idCasa, String calle, Integer numero, String localidad, Double precio,
			Boolean estaDisponible, Propietario dueño, Double mCuadrados, TipoDeOperacion tipo) {
		super(idCasa, calle, numero, localidad, precio, estaDisponible, dueño, tipo);
		this.mCuadrados = mCuadrados;
	}
	@Override
	public String toString() {
		return "Terreno [mCuadrados=" + mCuadrados + ", id=" + id + ", calle=" + calle + ", numero=" + numero
				+ ", localidad=" + localidad + ", precio=" + precio + ", estaDisponible=" + estaDisponible + ", dueño="
				+ dueño + ", tipo=" + tipo + "]";
	}
	
}
