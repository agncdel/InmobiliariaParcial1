package ar.edu.unlam.inmobiliaria;

public class Propiedad {
	protected Integer id;
	protected String calle;
	protected Integer numero;
	protected String localidad;
	protected Double precio;
	protected Boolean estaDisponible;
	protected Propietario dueño;
	protected TipoDeOperacion tipo;

	public Propiedad(Integer id, String calle, Integer numero, String localidad, Double precio,
			Boolean estaDisponible, Propietario dueño, TipoDeOperacion tipo) {
		this.id = id;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.precio = precio;
		this.estaDisponible = estaDisponible;
		this.dueño = dueño;
		this.tipo = tipo;
	}

	public TipoDeOperacion getTipo() {
		return tipo;
	}

	public Integer getId() {
		return id;
	}

	public String getCalle() {
		return calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public Double getPrecio() {
		return precio;
	}

	public Boolean getEstaDisponible() {
		return estaDisponible;
	}

	@Override
	public String toString() {
		return "Propiedad [id=" + id + ", calle=" + calle + ", numero=" + numero + ", localidad=" + localidad
				+ ", precio=" + precio + ", estaDisponible=" + estaDisponible + ", dueño=" + dueño + ", tipo=" + tipo
				+ "]";
	}
	
	
}
