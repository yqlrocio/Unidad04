package modeloExamen02;

import java.util.Scanner;

public class MainVehiculo {
	
	public static Scanner sc = new Scanner(System.in);
	public static ListaVehiculos coche = new ListaVehiculos();

	public static void main(String[] args) {
		
		//La opcion del menu elegida
		int opcion;
		
		//La matricula del coche
		String matricula;
		
		//El modelo del coche
		String modelo;

		//El precio base por dia
		double precio;
		
		//El porcentaje de recargo premium
		double porcentaje;
		
		//La cantidad de dias alquilados
		int dias;
		
		//El usuario tendra que elegir una de las opciones del menu
		do {
			opcionesMenu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1 -> {
				sc.nextLine();
				
				System.out.println("Introduzca la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				System.out.println("Introduzca el modelo del vehiculo: ");
				modelo = sc.nextLine();
				
				System.out.println("Introduzca el precio base por dia: ");
				precio = sc.nextDouble();
				
				System.out.println("Introduzca, en decimales, el porcentaje de recargo premium: ");
				porcentaje = sc.nextDouble();
				
				if (verificarYAnadirVehiculo(matricula, modelo, precio, porcentaje)) {
					System.out.println("Se ha anadido el evhiculo correctamente");
				} else {
					System.out.println("No se ha podido añadir el vehiculo a la lista");
				}
			}
			case 2 -> {
				if (coche.listarTodos().isEmpty()) {
					System.out.println("La lista esta vacia");
				} else {
					System.out.println(coche.listarTodos());
				}
			}
			case 3 -> {
				sc.nextLine();
				
				System.out.println("Introduzca la matricula del coche: ");
				matricula = sc.nextLine();
				
				if (coche.buscarPorMatricula(matricula) == null) {
					System.out.println("El coche que busca no se encuentra en la lista");
				} else {
					System.out.println(coche.buscarPorMatricula(matricula));
				}
			}
			case 4 -> {
				sc.nextLine();
				
				System.out.println("Introduzca la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				System.out.println("Introduzca la nueva cantidad de dias alquilados: ");
				dias = sc.nextInt();
				
				if (coche.modificarDiasAlquilados(matricula, dias)) {
					System.out.println("Los dias se han modificado correctamente");
				} else {
					System.out.println("No se han podido modificar los dias porque el vehiculo no existe en la lista");
				}
			}
			case 5 -> {
				sc.nextLine();
				
				System.out.println("Introduzca la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				do {
					System.out.println("Introduzca el nuevo porcentaje, que debe valer entre 0 y 0.25 y en decimales, de recargo premium: ");
					porcentaje = sc.nextDouble();
				} while (porcentaje > 0.25 || porcentaje < 0);
				
				if (coche.modificarRecargoPremium(matricula, porcentaje)) {
					System.out.println("Se ha modificado el recargo premium correctamente");
				} else {
					System.out.println("No se ha podido modificar el recargo premium");
				}
			}
			case 6 -> {
				System.out.println("Introduzca el nuevo precio seguro diario: ");
				precio = sc.nextDouble();
				
				modificarPrecioSeguro(precio);
				
				System.out.println("Se ha modificado el precio seguro diario correctamente");
			}
			case 7 -> {
				sc.nextLine();
				
				System.out.println("Introduzca la matricula del vehiculo: ");
				matricula = sc.nextLine();
				
				if (coche.eliminarPorMatricula(matricula)) {
					System.out.println("Se ha eliminado el vehiculo correctamente de la lista");
				} else {
					System.out.println("No se ha podido eliminar el vehiculo de la lista");
				}
			}
			case 8 -> mostrarEstadisticas();
			case 9 -> System.out.println("Gracias por usar el sistema. ¡Hasta pronto!");
			default -> System.out.println("La opcion elegida no existe en el menu mostrado");
			}
		}  while (opcion != 9);

	}
	
	/**
	 * Muestra el menu principal por pantalla
	 */
	public static void opcionesMenu() {
		System.out.println();
		System.out.println("1. Añadir vehículo");
		System.out.println("2. Listar vehículos");
		System.out.println("3. Buscar vehículo por matrícula");
		System.out.println("4. Modificar días alquilados");
		System.out.println("5. Modificar recargo premium");
		System.out.println("6. Modificar precio seguro diario");
		System.out.println("7. Eliminar vehículo");
		System.out.println("8. Ver estadísticas");
		System.out.println("9. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones del menu: ");
	}
	
	/**
	 * Verficar si un coche esta en la lista y, si no es asi, lo anade
	 * @param matricula
	 * @param modelo
	 * @param precio
	 * @param porcentaje
	 * @return Una cadena que muestra si se ha podido anadir el coche o no a la lista
	 */
	public static boolean verificarYAnadirVehiculo(String matricula, String modelo, double precio, double porcentaje) {
		boolean vehiculoAnadido = false;
		boolean vehiculoExiste = false;
		
		for (Vehiculo v : coche.listaVehiculos) {
			if (v.getMatricula().equalsIgnoreCase(matricula)) {
				vehiculoExiste = true;
			}
		}
		
		if (!vehiculoExiste) {
			coche.listaVehiculos.add(new Vehiculo(matricula, modelo, precio, porcentaje));
			vehiculoAnadido = true;
		}
		
		return vehiculoAnadido;
	}
	
	/**
	 * Modifica el precio seguro diario de todos los vehiculos de la lista
	 * @param precio
	 */
	public static void modificarPrecioSeguro(double precio) {
		//Recorremos la lista para cambiar el precio seguro en todos los elementos de esta
		for (Vehiculo v : coche.listaVehiculos) {
			v.setPrecioSeguro(precio);
		}
	}
	
	public static void mostrarEstadisticas() {
		System.out.println("El ingreso total obtenido por recargos premium es " + coche.calcularIngresoTotalRecargos());
		
		if (coche.listarVehiculosPremium().isEmpty()) {
			System.out.println("La lista con los vehiculos cuyo porcentaje de recargo es mayor al 12% esta vacia");
		} else {
			System.out.println(coche.listarVehiculosPremium());
		}
	}

}