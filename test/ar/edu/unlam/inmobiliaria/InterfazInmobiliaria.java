package ar.edu.unlam.inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazInmobiliaria {

	public static void main(String[] args) {

		Scanner valorIngresado = new Scanner(System.in);
		Scanner idIngresada = new Scanner(System.in);
		ArrayList<Propiedad> temp = new ArrayList<Propiedad>();
		Integer num = 0;
		Integer casas = 0;
		Integer departamentos = 0;
		Integer phs = 0;
		Integer terrenos = 0;
		Integer campos = 0;
		Integer cantPropiedades = 0;
		Integer dni;
		String calle;
		Integer numero;
		String localidad;
		Double precio = 0.00;
		String nombre;
		String apellido;
		Character depto;
		Integer piso;
		Double m2 = 0.00;
		Integer id;
		TipoDeOperacion tipo = null;
		Inmobiliaria lar = new Inmobiliaria("LAR");
		do {
			System.out.println("-------------MENÚ-------------");
			System.out.println("Ingrese el número de opción que desee realizar [1-10]");
			System.out.println("1) Agregar nueva propiedad");
			System.out.println("2) Modificar propiedad ya existente");
			System.out.println("3) Agregar cliente");
			System.out.println("4) Ver todas las propiedades ordenadas por precio");
			System.out.println("5) Ver todas las propiedades ordenadas por ubicación");
			System.out.println("6) Buscar propiedades por rango de precios");
			System.out.println("7) Buscar propiedades por localidad");
			System.out.println("8) Buscar propiedades por venta o alquiler");
			System.out.println("9) Vender una propiedad");
			System.out.println("10) Alquilar una propiedad");
			System.out.println("11) Salir.");
			System.out.println("------------------------------");
			num = valorIngresado.nextInt();

			switch (num) {
			case 1:
				System.out.println("Elegir tipo de propiedad a agregar:");
				System.out.println("1) Casa");
				System.out.println("2) Departamento");
				System.out.println("3) PH");
				System.out.println("4) Terreno");
				System.out.println("5) Campo");
				num = valorIngresado.nextInt();
				if (num == 1) {
					System.out.println("Ingrese la calle:");
					calle = valorIngresado.next();
					System.out.println("Ingrese el número:");
					numero = valorIngresado.nextInt();
					System.out.println("Ingrese la localidad:");
					localidad = valorIngresado.next();
					System.out.println("Ingrese el precio:");
					precio = valorIngresado.nextDouble();
					System.out.println("Ingrese el tipo de operación para la propiedad (1 2 o 3): ");
					System.out.println("1) Venta");
					System.out.println("2) Alquiler");
					System.out.println("3) Permuta");
					num = valorIngresado.nextInt();
					switch (num) {
					case 1:
						tipo = TipoDeOperacion.VENTA;
						break;
					case 2:
						tipo = TipoDeOperacion.ALQUILER;
						break;
					case 3:
						tipo = TipoDeOperacion.PERMUTA;
						break;
					}

					System.out.println("Ingrese los datos del dueño de la propiedad:");
					System.out.println("DNI:");
					dni = valorIngresado.nextInt();
					System.out.println("Nombre:");
					nombre = valorIngresado.next();
					System.out.println("Apellido:");
					apellido = valorIngresado.next();

					Propietario dueño = new Propietario(dni, nombre, apellido, 1);
					lar.agregarDueño(dueño);

					casas++;
					Casa casa = new Casa(casas, calle, numero, localidad, precio, true, dueño, tipo);
					lar.agregarCasa(casa);
					System.out.println("Casa agregada correctamente. El código de la propiedad es: " + casas);
				} else if (num == 2) {
					System.out.println("Ingrese la calle:");
					calle = valorIngresado.next();
					System.out.println("Ingrese el número:");
					numero = valorIngresado.nextInt();
					System.out.println("Ingrese la localidad:");
					localidad = valorIngresado.next();
					System.out.println("Ingrese el precio:");
					precio = valorIngresado.nextDouble();
					System.out.println("Ingrese el departamento(Letra):");
					depto = valorIngresado.next().charAt(1);
					System.out.println("Ingrese el piso:");
					piso = valorIngresado.nextInt();
					System.out.println("Ingrese el tipo de operación para la propiedad (1 2 o 3): ");
					System.out.println("1) Venta");
					System.out.println("2) Alquiler");
					System.out.println("3) Permuta");
					num = valorIngresado.nextInt();
					switch (num) {
					case 1:
						tipo = TipoDeOperacion.VENTA;
						break;
					case 2:
						tipo = TipoDeOperacion.ALQUILER;
						break;
					case 3:
						tipo = TipoDeOperacion.PERMUTA;
						break;
					}

					System.out.println("Ingrese los datos del dueño de la propiedad:");
					System.out.println("DNI:");
					dni = valorIngresado.nextInt();
					System.out.println("Nombre:");
					nombre = valorIngresado.next();
					System.out.println("Apellido:");
					apellido = valorIngresado.next();

					Propietario dueño = new Propietario(dni, nombre, apellido, 1);
					lar.agregarDueño(dueño);

					departamentos++;
					Departamento departamento = new Departamento(departamentos, calle, numero, localidad, precio, true,
							dueño, depto, piso, tipo);
					lar.agregarDepto(departamento);
					System.out.println(
							"Departamento agregado correctamente. El código de la propiedad es: " + departamentos);
				} else if (num == 3) {
					System.out.println("Ingrese la calle:");
					calle = valorIngresado.next();
					System.out.println("Ingrese el número:");
					numero = valorIngresado.nextInt();
					System.out.println("Ingrese la localidad:");
					localidad = valorIngresado.next();
					System.out.println("Ingrese el precio:");
					precio = valorIngresado.nextDouble();
					System.out.println("Ingrese el tipo de operación para la propiedad (1 2 o 3): ");
					System.out.println("1) Venta");
					System.out.println("2) Alquiler");
					System.out.println("3) Permuta");
					num = valorIngresado.nextInt();
					switch(num) {
					case 1:
						tipo = TipoDeOperacion.VENTA;
						break;
					case 2:
						tipo = TipoDeOperacion.ALQUILER;
						break;
					case 3:
						tipo = TipoDeOperacion.PERMUTA;
						break;
					}

					System.out.println("Ingrese los datos del dueño de la propiedad:");
					System.out.println("DNI:");
					dni = valorIngresado.nextInt();
					System.out.println("Nombre:");
					nombre = valorIngresado.next();
					System.out.println("Apellido:");
					apellido = valorIngresado.next();

					Propietario dueño = new Propietario(dni, nombre, apellido, 1);
					lar.agregarDueño(dueño);

					phs++;
					PH ph = new PH(phs, calle, numero, localidad, precio, true, dueño, tipo);
					lar.agregarPh(ph);
					System.out.println("PH agregado correctamente. El código de la propiedad es: " + phs);
				} else if (num == 4) {
					System.out.println("Ingrese la calle:");
					calle = valorIngresado.next();
					System.out.println("Ingrese el número:");
					numero = valorIngresado.nextInt();
					System.out.println("Ingrese la localidad:");
					localidad = valorIngresado.next();
					System.out.println("Ingrese los metros cuadrados del terreno:");
					m2 = valorIngresado.nextDouble();
					System.out.println("Ingrese el precio:");
					precio = valorIngresado.nextDouble();
					System.out.println("Ingrese el tipo de operación para la propiedad (1 2 o 3): ");
					System.out.println("1) Venta");
					System.out.println("2) Alquiler");
					System.out.println("3) Permuta");
					num = valorIngresado.nextInt();
					switch(num) {
					case 1:
						tipo = TipoDeOperacion.VENTA;
						break;
					case 2:
						tipo = TipoDeOperacion.ALQUILER;
						break;
					case 3:
						tipo = TipoDeOperacion.PERMUTA;
						break;
					}

					System.out.println("Ingrese los datos del dueño de la propiedad:");
					System.out.println("DNI:");
					dni = valorIngresado.nextInt();
					System.out.println("Nombre:");
					nombre = valorIngresado.next();
					System.out.println("Apellido:");
					apellido = valorIngresado.next();

					Propietario dueño = new Propietario(dni, nombre, apellido, 1);
					lar.agregarDueño(dueño);

					terrenos++;
					Terreno terreno = new Terreno(phs, calle, numero, localidad, precio, true, dueño, m2, tipo);
					lar.agregarTerreno(terreno);
					System.out.println("Terreno agregado correctamente. El código de la propiedad es: " + terrenos);
				} else if (num == 5) {
					System.out.println("Ingrese la calle:");
					calle = valorIngresado.next();
					System.out.println("Ingrese el número:");
					numero = valorIngresado.nextInt();
					System.out.println("Ingrese la localidad:");
					localidad = valorIngresado.next();
					System.out.println("Ingrese el precio:");
					precio = valorIngresado.nextDouble();
					System.out.println("Ingrese el tipo de operación para la propiedad (1 2 o 3): ");
					System.out.println("1) Venta");
					System.out.println("2) Alquiler");
					System.out.println("3) Permuta");
					num = valorIngresado.nextInt();
					switch(num) {
					case 1:
						tipo = TipoDeOperacion.VENTA;
						break;
					case 2:
						tipo = TipoDeOperacion.ALQUILER;
						break;
					case 3:
						tipo = TipoDeOperacion.PERMUTA;
						break;
					}

					System.out.println("Ingrese los datos del dueño de la propiedad:");
					System.out.println("DNI:");
					dni = valorIngresado.nextInt();
					System.out.println("Nombre:");
					nombre = valorIngresado.next();
					System.out.println("Apellido:");
					apellido = valorIngresado.next();

					Propietario dueño = new Propietario(dni, nombre, apellido, 1);
					lar.agregarDueño(dueño);

					campos++;
					Campo campo = new Campo(campos, calle, numero, localidad, precio, true, dueño, tipo);
					lar.agregarCampo(campo);
					System.out.println("Campo agregado correctamente. El código de la propiedad es: " + campos);
				} else
					System.out.println("Numero inválido.");
				break;
			case 2:
				System.out.println("Elegir tipo de propiedad a modificar:");
				System.out.println("1) Casa");
				System.out.println("2) Departamento");
				System.out.println("3) PH");
				System.out.println("4) Terreno");
				System.out.println("5) Campo");
				num = valorIngresado.nextInt();
				System.out.println("Ingresar ID de la propiedad: ");
				id = idIngresada.nextInt();
				switch (num) {
				case 1:
					lar.editarCasa(id);
					break;
				case 2:
					lar.editarDepto(id);
					break;
				case 3:
					lar.editarPh(id);
					break;
				case 4:
					lar.editarTerreno(id);
					break;
				case 5:
					lar.editarCampo(id);
					break;
				default:
					break;
				}
			case 3:
				System.out.println("Ingrese los datos del nuevo cliente:");
				System.out.println("DNI:");
				dni = valorIngresado.nextInt();
				System.out.println("Nombre:");
				nombre = valorIngresado.next();
				System.out.println("Apellido:");
				apellido = valorIngresado.next();
				Inquilino cliente = new Inquilino(dni, nombre, apellido, 0);
				lar.agregarInquilino(cliente);
				break;
			case 4:
				System.out.println("Listado de propiedades ordenado por precio:");
				temp = lar.ordenarPropPorPrecio();
				System.out.println(temp.toString());
				break;
			case 5:
				System.out.println("Listado de propiedades ordenado por localidad:");
				temp = lar.ordenarPropPorLocalidad();
				System.out.println(temp.toString());
				break;
			case 6:
				System.out.println("Ingresar precio mínimo");
				Double min = valorIngresado.nextDouble();
				System.out.println("Ingresar precio máximo");
				Double max = valorIngresado.nextDouble();
				temp = lar.filtrarPropiedades(min, max);
				System.out.println(temp.toString());
				break;
			case 7:
				System.out.println("Ingresar localidad");
				localidad = valorIngresado.next();
				temp = lar.filtrarPorLocalidad(localidad);
				System.out.println(temp.toString());
				break;
			case 8:
				System.out.println("Ingresar tipo de operación (1 o 2)");
				System.out.println("1) Venta");
				System.out.println("2) Alquiler");
				num = valorIngresado.nextInt();
				if(num==1) {
					tipo = TipoDeOperacion.VENTA;
				}else if (num==2) {
					tipo = TipoDeOperacion.ALQUILER;
				}
				temp = lar.filtrarPorTipoOp(tipo);
				System.out.println(temp.toString());
				break;
			case 9:
				System.out.println("Elegir tipo de propiedad a vender:");
				System.out.println("1) Casa");
				System.out.println("2) Departamento");
				System.out.println("3) PH");
				System.out.println("4) Terreno");
				System.out.println("5) Campo");
				num = valorIngresado.nextInt();
				System.out.println("Ingresar ID de la propiedad: ");
				id = idIngresada.nextInt();
				switch (num) {
				case 1:
					lar.venderCasa(id);
					break;
				case 2:
					lar.venderDepto(id);
					break;
				case 3:
					lar.venderPH(id);
					break;
				case 4:
					lar.venderTerreno(id);
					break;
				case 5:
					lar.venderCampo(id);
					break;
				default:
					break;
				}
				break;
			case 10:
				System.out.println("Elegir tipo de propiedad a vender:");
				System.out.println("1) Casa");
				System.out.println("2) Departamento");
				System.out.println("3) PH");
				System.out.println("4) Terreno");
				System.out.println("5) Campo");
				num = valorIngresado.nextInt();
				System.out.println("Ingresar ID de la propiedad: ");
				id = idIngresada.nextInt();
				switch (num) {
				case 1:
					lar.alquilarCasa(id);
					break;
				case 2:
					lar.alquilarDepto(id);
					break;
				case 3:
					lar.alquilarPH(id);
					break;
				case 4:
					lar.alquilarTerreno(id);
					break;
				case 5:
					lar.alquilarCampo(id);
					break;
				default:
					break;
				}
				break;
			}
		} while (num != 11);
	}
}
