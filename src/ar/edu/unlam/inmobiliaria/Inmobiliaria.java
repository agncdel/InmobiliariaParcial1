package ar.edu.unlam.inmobiliaria;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Inmobiliaria {
	private String nombre;
	private ArrayList<Casa> casas = new ArrayList<>();
	private ArrayList<Departamento> deptos = new ArrayList<>();
	private ArrayList<PH> phs = new ArrayList<>();
	private ArrayList<Terreno> terrenos = new ArrayList<>();
	private ArrayList<Campo> campos = new ArrayList<>();
	private HashSet<Propietario> propietario = new HashSet<>();
	private HashSet<Inquilino> inquilino = new HashSet<>();

	public Inmobiliaria(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarCasa(Casa casa) {
		String calle = casa.getCalle();
		Integer numero = casa.getNumero();
		String localidad = casa.getLocalidad();
		for (Casa casa1 : casas) {
			if (casa1.getCalle().equals(calle) && casa1.getNumero().equals(numero)
					&& casa1.getLocalidad().equals(localidad)) {
				return false;
			}
		}
		casas.add(casa);
		return true;
	}

	public Boolean agregarDepto(Departamento depto) {
		String calle = depto.getCalle();
		Integer numero = depto.getNumero();
		String localidad = depto.getLocalidad();
		Character departamento = depto.getDepartamento();
		Integer piso = depto.getPiso();

		for (Departamento depto1 : deptos) {
			if (depto1.getCalle().equals(calle) && depto1.getNumero().equals(numero)
					&& depto1.getLocalidad().equals(localidad) && depto1.getDepartamento().equals(departamento)
					&& depto1.getPiso().equals(piso)) {
				return false;
			}
		}
		deptos.add(depto);
		return true;
	}

	public ArrayList<Casa> filtrarCasa(Double min, Double max) {
		ArrayList<Casa> array = new ArrayList<Casa>();
		for (Casa casa : casas) {
			if (casa.getPrecio() >= min && casa.getPrecio() <= max) {
				array.add(casa);
			}
		}
		return array;
	}

	public Double promedioCasa() {
		Double total = 0.00;
		for (Casa casa : casas) {
			total += casa.getPrecio();
		}
		Double promedio = total / casas.size();
		return promedio;
	}

	public Double promedioDepto() {
		Double total = 0.00;
		for (Departamento depto : deptos) {
			total += depto.getPrecio();
		}
		Double promedio = total / deptos.size();
		return promedio;
	}

	public Boolean agregarDueño(Propietario dueño) {
		return propietario.add(dueño);
	}

	public Boolean agregarPh(PH ph) {
		String calle = ph.getCalle();
		Integer numero = ph.getNumero();
		String localidad = ph.getLocalidad();
		for (PH phss : phs) {
			if (phss.getCalle().equals(calle) && phss.getNumero().equals(numero)
					&& phss.getLocalidad().equals(localidad)) {
				return false;
			}
		}
		phs.add(ph);
		return true;
	}

	public Boolean agregarTerreno(Terreno terreno) {
		String calle = terreno.getCalle();
		Integer numero = terreno.getNumero();
		String localidad = terreno.getLocalidad();
		for (Terreno terreno1 : terrenos) {
			if (terreno1.getCalle().equals(calle) && terreno1.getNumero().equals(numero)
					&& terreno1.getLocalidad().equals(localidad)) {
				return false;
			}
		}
		terrenos.add(terreno);
		return true;
	}

	public Boolean agregarCampo(Campo campo) {
		String calle = campo.getCalle();
		Integer numero = campo.getNumero();
		String localidad = campo.getLocalidad();
		for (Campo campo1 : campos) {
			if (campo1.getCalle().equals(calle) && campo1.getNumero().equals(numero)
					&& campo1.getLocalidad().equals(localidad)) {
				return false;
			}
		}
		campos.add(campo);
		return true;
	}

	public Boolean editarCasa(Integer id) {
		return null;
    }

	public Boolean editarDepto(Integer id) {
		return null;
	}

	public Boolean editarPh(Integer id) {
		return null;
		
	}
	
	public Boolean editarTerreno(Integer id) {
		return null;
		
	}
	
	public Boolean editarCampo(Integer id) {
		return null;
		
	}

	public Boolean agregarInquilino(Inquilino cliente) {
		return inquilino.add(cliente);
		
	}

	public ArrayList<Propiedad> ordenarPropPorPrecio() {
		return null;
	}

	public ArrayList<Propiedad> ordenarPropPorLocalidad() {
		return null;
	}

	public ArrayList<Propiedad> filtrarPropiedades(Double min, Double max) {
		return null;
	}

	public ArrayList<Propiedad> filtrarPorLocalidad(String localidad) {
		return null;
	}

	public ArrayList<Propiedad> filtrarPorTipoOp(TipoDeOperacion tipo) {
		ArrayList<Propiedad> arrayFinal = new ArrayList<>();
		arrayFinal=filtrarCasas(arrayFinal, casas, tipo);
		arrayFinal=filtrarDeptos(arrayFinal, deptos, tipo);
		arrayFinal=filtrarPhs(arrayFinal, phs, tipo);
		arrayFinal=filtrarTerrenos(arrayFinal, terrenos, tipo);
		arrayFinal=filtrarCampos(arrayFinal, campos, tipo);
		System.out.println(arrayFinal.toString());
		return arrayFinal;
	}

	private ArrayList<Propiedad> filtrarCampos(ArrayList<Propiedad> arrayFinal, ArrayList<Campo> campos2,
			TipoDeOperacion tipo) {
		for (Campo campo : campos2) {
			if(campo.getTipo().equals(tipo)) {
				arrayFinal.add(campo);
			}
		}
		return arrayFinal;
	}

	private ArrayList<Propiedad> filtrarTerrenos(ArrayList<Propiedad> arrayFinal, ArrayList<Terreno> terrenos2,
			TipoDeOperacion tipo) {
		for (Terreno terreno : terrenos2) {
			if(terreno.getTipo().equals(tipo)) {
				arrayFinal.add(terreno);
			}
		}
		return arrayFinal;
	}

	private ArrayList<Propiedad> filtrarPhs(ArrayList<Propiedad> arrayFinal, ArrayList<PH> phs2, TipoDeOperacion tipo) {
		for (PH ph : phs2) {
			if(ph.getTipo().equals(tipo)) {
				arrayFinal.add(ph);
			}
		}
		return arrayFinal;
	}

	private ArrayList<Propiedad> filtrarDeptos(ArrayList<Propiedad> arrayFinal, ArrayList<Departamento> deptos2,
			TipoDeOperacion tipo) {
		for (Departamento depto : deptos2) {
			if(depto.getTipo().equals(tipo)) {
				arrayFinal.add(depto);
			}
		}
		return arrayFinal;
	}

	private ArrayList<Propiedad> filtrarCasas(ArrayList<Propiedad> arrayFinal, ArrayList<Casa> casas2,
			TipoDeOperacion tipo) {
		for (Casa casa : casas2) {
			if(casa.getTipo().equals(tipo)) {
				arrayFinal.add(casa);
			}
		}
		return arrayFinal;
	}

	public void venderCasa(Integer id) {
		Casa pos = buscarCasa(id);
		Propietario dueño = new Propietario(41137440, "Nuevo", "Propietario", 0);
		//casas.setDueño(dueño);
	}
	
	private Casa buscarCasa(Integer id) {
		for (Casa casa : casas) {
			if(casa.getId().equals(id)) {
				return casa;
			}
		}
		return null;

	}

	public void venderDepto(Integer id) {		
	}
	
	public void venderPH(Integer id) {		
	}
	
	public void venderTerreno(Integer id) {		
	}
	
	public void venderCampo(Integer id) {		
	}

	public void alquilarCasa(Integer id) {
		
	}
	public void alquilarDepto(Integer id) {
		
	}
	public void alquilarPH(Integer id) {
		
	}
	public void alquilarTerreno(Integer id) {
		
	}
	public void alquilarCampo(Integer id) {
		
	}

}
