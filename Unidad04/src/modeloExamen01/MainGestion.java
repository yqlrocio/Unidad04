package modeloExamen01;

import java.util.Scanner;

public class MainGestion {

	public static Scanner sc = new Scanner(System.in);
	public static Biblioteca biblio = new Biblioteca();

	public static void main(String[] args) {
		
		//El tipo de gestion que quiere realizar el gestor
		int opcionGestion;
		
		//La opcion del menu elegida por el gestor
		int opcionMenu;
		
		//El gestor primero tiene que elegir que tipo de gestion quiere realizar
		do {
			menuPrincipal();
			opcionGestion = sc.nextInt();
			
			switch(opcionGestion) {
			case 1 -> {
				do {
					gestionLibros();
					opcionMenu = sc.nextInt();
					
					operacionesLibros(opcionMenu);
				} while (opcionMenu != 5);
			}
			case 2 -> {
				do {
					gestionSocios();
					opcionMenu = sc.nextInt();
					
					operacionesSocios(opcionMenu);
				} while (opcionMenu != 5);
			}
			case 3 -> {
				do {
					gestionPrestamos();
					opcionMenu = sc.nextInt();
					
					operacionesPrestamos(opcionMenu);
				} while (opcionMenu != 4);
			}
			case 4 -> {
				do {
					consultaSistema();
					opcionMenu = sc.nextInt();
					
					
				} while (opcionMenu != 4);
			}
			}
		} while (opcionGestion != 5);

	}
	
	public static void menuPrincipal() {
		System.out.println();
		System.out.println("GESTIONES Y CONSULTAS");
		System.out.println("1. Gestión de libros");
		System.out.println("2. Gestión de socios");
		System.out.println("3. Gestión de préstamos");
		System.out.println("4. Consultas del sistema");
		System.out.println("5. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones de gestion: ");
	}
	
	public static void gestionLibros() {
		System.out.println("GESTION DE LIBROS");
		System.out.println("1. Dar de alta un libro");
		System.out.println("2. Consultar libros existentes");
		System.out.println("3. Modificar información de libro");
		System.out.println("4. Eliminar libro");
		System.out.println("5. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones del menu: ");
	}
	
	public static void gestionSocios() {
		System.out.println("GESTION DE SOCIOS");
		System.out.println("1. Dar de alta un socio");
		System.out.println("2. Consultar socios");
		System.out.println("3. Modificar información de un socio");
		System.out.println("4. Eliminar socio");
		System.out.println("5. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones del menu: ");
	}
	
	public static void gestionPrestamos() {
		System.out.println("GESTION DE PRESTAMOS");
		System.out.println("1. Registrar un préstamo");
		System.out.println("2. Registrar una devolución");
		System.out.println("3. Consultar el estado de los préstamos");
		System.out.println("4. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones del menu: ");
	}
	
	public static void consultaSistema() {
		System.out.println("CONSULTAS DEL SISTEMA");
		System.out.println("1. Mostrar los libros disponibles");
		System.out.println("2. Mostrar información de un socio concreto");
		System.out.println("3. Mostrar información de un libro concreto");
		System.out.println("4. Salir");
		System.out.println();
		System.out.println("Elija una de las opciones del menu: ");
	}
	
	public static void operacionesLibros(int opcionMenu) {
		//El titulo del libro
		String titulo;
		
		//El autor del libro
		String autor;
		
		//El codigo del libro
		int codigo;
		
		//El numero de ejemplares disponibles
		int ejemplares;
		
		switch(opcionMenu){
		case 1 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el titulo del libro: ");
			titulo = sc.nextLine();
			
			System.out.println("Introduzca el nombre del autor del libro: ");
			autor = sc.nextLine();
			
			System.out.println("Introduzca el codigo del libro: ");
			codigo = sc.nextInt();
			
			System.out.println("Introduzca el numero de ejemplares disponibles del libro: ");
			ejemplares = sc.nextInt();
			
			biblio.altaLibro(new Libro(codigo, titulo, ejemplares, autor));
		}
		case 2 -> {
			if (biblio.getListaLibros().isEmpty()) {
				System.out.println("La lista esta vacia");
			} else {
				System.out.println(biblio.getListaLibros());
			}
		}
		case 3 -> {
			System.out.println("Introduzca el codigo del libro: ");
			codigo = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Introduzca el nuevo autor del libro: ");
			autor = sc.nextLine();
			
			biblio.modificarLibro(codigo, autor);
		}
		case 4 -> {
			System.out.println("Introduzca el codigo del libro que quiere borrar: ");
			codigo = sc.nextInt();
			
			if (biblio.eliminaLibro(codigo)) {
				System.out.println("El libro se ha borrado correctamente");
			} else {
				System.out.println("No se ha podido borrar el libro");
			}
		}
		case 5 -> System.out.println("Gracias por utilizar el programa");
		default -> System.out.println("La opcion elegida no existe");
		}
	}
	
	public static void operacionesSocios(int opcionMenu) {
		//El nombre del socio
		String nombre;
		
		//El numero de telefono del socio
		int telefono;
		
		//El dni del socio
		String dni;
		
		//El numero de prestamos pendientes que ha hecho el socio
		int prestamos = 0;
		
		switch(opcionMenu) {
		case 1 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el nombre del socio: ");
			nombre = sc.nextLine();
			
			System.out.println("Introduzca el dni del socio: ");
			dni = sc.nextLine();
			
			System.out.println("Introduzca el telefono del socio: ");
			telefono = sc.nextInt();
			
			biblio.altaSocios(new Socio(dni, nombre, telefono, prestamos));
		}
		case 2 -> {
			if (biblio.getListaSocios().isEmpty()) {
				System.out.println("La lista esta vacia");
			} else {
				System.out.println(biblio.getListaSocios());
			}
		}
		case 3 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el dni del socio: ");
			dni = sc.nextLine();
			
			System.out.println("Introduzca el nuevo numero de telefono del socio: ");
			telefono = sc.nextInt();
			
			biblio.actualizarDatos(dni, telefono);
		}
		case 4 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el dni del socio que quiere borrar: ");
			dni = sc.nextLine();
			
			if (biblio.eliminarSocio(dni)) {
				System.out.println("El socio se ha borrado correctamente");
			} else {
				System.out.println("No se ha podido borrar al socio");
			}
		}
		case 5 -> System.out.println("Gracias por usar el porgrama");
		default -> System.out.println("La opcion elegida no existe");
		}
	}
	
	public static void operacionesPrestamos(int opcionMenu) {
		//El dni del socio
		String dni;
		
		//El codigo del libro
		int codigo;
		
		//La fecha en la que ha devuelto o se ha tomado prestado un libro
		String fecha;
		
		switch(opcionMenu) {
		case 1 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el dni del socio: ");
			dni = sc.nextLine();
			
			System.out.println("Introduzca el codigo del libro: ");
			codigo = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Introduzca la fecha en la que se hizo el prestamo: ");
			fecha = sc.nextLine();
			
			if (biblio.hacerPrestamo(new Prestamo(dni, codigo, fecha))) {
				System.out.println("El prestamo se ha realizado correctamente");
			} else {
				System.out.println("No se ha podido realizar el prestamo");
			}
		}
		case 2 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el dni del socio: ");
			dni = sc.nextLine();
			
			System.out.println("Introduzca la fecha en la que se hizo la devolucion: ");
			fecha = sc.nextLine();
			
			System.out.println("Introduzca el codigo del libro: ");
			codigo = sc.nextInt();
			
			if (biblio.hacerDevolucion(new Prestamo(dni, codigo, fecha), codigo)) {
				System.out.println("La devolucion se ha realizado correctamente");
			} else {
				System.out.println("No se ha podido realizar la devolucion");
			}
		}
		
		case 3 -> {
			if (biblio.getListaPrestamo().isEmpty()) {
				System.out.println("La lista esta vacia");
			} else {
				System.out.println(biblio.getListaPrestamo());
			}
		}
		case 4 -> System.out.println("Gracias por utilizar el programa");
		default -> System.out.println("La opcion elegida no existe");
		}
	}
	
	public static void operacionesConsultas(int opcionMenu) {
		//El codigo del libro buscado
		int codigo;
		
		//El dni del socio buscado
		String dni;
		
		switch(opcionMenu) {
		case 1 -> {
			if (biblio.getListaLibrosDisponibles().isEmpty()) {
				System.out.println("No hay libros disponibles");
			} else {
				System.out.println(biblio.getListaLibrosDisponibles());
			}
		}
		case 2 -> {
			sc.nextLine();
			
			System.out.println("Introduzca el dni del socio que busca: ");
			dni = sc.nextLine();
			
			biblio.buscarSocio(dni);
		}
		case 3 -> {
			System.out.println("Introduzca el codigo del libro que busca: ");
			codigo = sc.nextInt();
			
			biblio.buscarLibro(codigo);
		}
		case 4 -> System.out.println("Gracias por utilizar el programa");
		default -> System.out.println("La opcion elegida no existe");
		}
	}

}