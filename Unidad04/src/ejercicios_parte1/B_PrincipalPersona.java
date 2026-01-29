package ejercicios_parte1;

import java.util.Scanner;

public class B_PrincipalPersona {

	public static void main(String[] args) {

		/*
		 * -----------------------------------------------------------------------------
		 * Añade a la clase Persona un constructor con todos los parámetros. Modifica el
		 * main para utilizar el constructor con parámetros en vez de modificar
		 * directamente los atributos
		 * -----------------------------------------------------------------------------
		 */

		// Creación del scanner para leer el teclado del usuario
		Scanner sc = new Scanner(System.in);

		// Se le pregunta al usuario que introduzca los siguientes datos y se crean las
		// variables
		System.out.println("Introduzca su DNI: ");
		int dni = sc.nextInt();
		System.out.println("Introduzca su nombre: ");
		String nombre = sc.next();
		System.out.println("Introduzca sus apellidos: ");
		String apellidos = sc.next();
		System.out.println("Introduzca su edad: ");
		int edad = sc.nextInt();

		// Se crea el objeto y se almacenan los datos gracias al constructor
		B2_Persona persona1 = new B2_Persona(dni, nombre, apellidos, edad);

		System.out.println();

		System.out.println("Introduzca su DNI: ");
		dni = sc.nextInt();
		System.out.println("Introduzca su nombre: ");
		nombre = sc.next();
		System.out.println("Introduzca sus apellidos: ");
		apellidos = sc.next();
		System.out.println("Introduzca su edad: ");
		edad = sc.nextInt();

		B2_Persona persona2 = new B2_Persona(dni, nombre, apellidos, edad);

		// Se imprimen los datos
		System.out.println(persona1.nombre + " " + persona1.apellidos + " con DNI " + persona1.dni
				+ (persona1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		System.out.println("");

		System.out.println(persona2.nombre + " " + persona2.apellidos + " con DNI " + persona2.dni
				+ (persona2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		// Cierre del scanner
		sc.close();
	}

}