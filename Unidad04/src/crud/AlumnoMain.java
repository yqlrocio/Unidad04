package crud;

import java.util.Scanner;

public class AlumnoMain {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		// CREACIÓN DEL OBJETO
		AlumnoGestor gestion = new AlumnoGestor();

		// VARIABLE PARA LA OPCIÓN DEL USUARIO
		int opcion = 0;

		// VARIABLES PARA ALUMNOS
		String nombre;
		double nota;
		String nombreMod;
		double nuevaNota;
		String nombreBorrar;

		do {
			System.out.println("====================");
			System.out.println("    ALUMNOS/AS");
			System.out.println("====================");

			System.out.println("1. Listado.");
			System.out.println("2. Nuevo Alumno.");
			System.out.println("3. Modificar.");
			System.out.println("4. Borrar.");
			System.out.println("5. Salir.");
			System.out.print("Seleccione una opción: ");

			opcion = sc.nextInt();
			sc.nextLine(); // LIMPIA

			switch (opcion) {
			// LISTADO
			case 1:
				if (gestion.getListaAlumnos().isEmpty()) {
					System.out.println("La lista está vacía.");
				} else {
					for (Alumno a : gestion.getListaAlumnos()) {
						System.out.println(a);
					}
				}
				break;

			// AÑADIR ALUMNO
			case 2:
				System.out.print("Nombre del alumno: ");
				nombre = sc.nextLine();
				System.out.print("Nota: ");
				nota = sc.nextDouble();
				gestion.crearAlumno(new Alumno(nombre, nota));
				System.out.println("Alumno añadido correctamente.");
				break;

			// MODIFICA/ACTUALIZA ALUMNO
			case 3:
				System.out.print("Nombre del alumno a modificar: ");
				nombreMod = sc.nextLine();
				System.out.print("Nueva nota: ");
				nuevaNota = sc.nextDouble();
				if (gestion.modificarNota(nombreMod, nuevaNota)) {
					System.out.println("Nota actualizada.");
				} else {
					System.out.println("Alumno no encontrado.");
				}
				break;

			// ELIMINAR ALUMNO
			case 4:
				System.out.print("Nombre del alumno a borrar: ");
				nombreBorrar = sc.nextLine();
				if (gestion.borrarAlumno(nombreBorrar)) {
					System.out.println("Alumno eliminado.");
				} else {
					System.out.println("No se encontró el alumno.");
				}
				break;

			// SALIR DEL PROGRAMA
			case 5:
				System.out.println("Saliendo del programa...");
				break;

			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 5);

		sc.close();
	}

}