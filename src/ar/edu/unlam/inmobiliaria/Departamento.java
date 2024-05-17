package ar.edu.unlam.inmobiliaria;

public class Departamento extends Propiedad {
	private Character departamento;
	private Integer piso;

	public Departamento(Integer id, String calle, Integer numero, String localidad, Double precio,
			Boolean estaDisponible, Propietario dueño, Character departamento, Integer piso, TipoDeOperacion tipo) {
		super(id, calle, numero, localidad, precio, estaDisponible, dueño, tipo);
		this.departamento = departamento;
		this.piso = piso;
	}

	public Character getDepartamento() {
		return departamento;
	}

	public Integer getPiso() {
		return piso;
	}

	@Override
	public String toString() {
		return "Departamento [departamento=" + departamento + ", piso=" + piso + ", id=" + id + ", calle=" + calle
				+ ", numero=" + numero + ", localidad=" + localidad + ", precio=" + precio + ", estaDisponible="
				+ estaDisponible + ", dueño=" + dueño + ", tipo=" + tipo + "]";
	}

	
}
