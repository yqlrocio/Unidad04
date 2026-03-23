package boletin_04;

import java.util.Scanner;

public class MainFecha {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Fecha date = new Fecha();
		
		//The user has to introduce a date
		System.out.println("Introduzca un día: ");
		date.setDay(sc.nextInt());
		
		System.out.println("Ahora, introduzca el mes: ");
		date.setMonth(sc.nextInt());
		
		System.out.println("Por último, introduzca un año: ");
		date.setYear(sc.nextInt());
		
		//We check if the date introduced makes sense
		if (date.correctDate(date.getDay(), date.getMonth(), date.getYear())) {
			System.out.println("La fecha introducida es correcta");
		} else {
			System.out.println("La fecha introducida es incorrecta");
		}
		
		//Check if the year introduced was a leap year
		if (date.isLeapYear(date.getYear())) {
			System.out.println("El año introducido es un año bisiesto");
		} else {
			System.out.println("El año introducido no es un año bisiesto");
		}
		
		//Calculate the day after the one introduced
		date.nextDay(date.getDay(), date.getMonth(), date.getYear());
		
		//The day calculated is shown in the console
		System.out.println(date.toString());
	}

}