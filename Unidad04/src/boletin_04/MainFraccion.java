package boletin_04;

import java.util.Scanner;

public class MainFraccion {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Fraccion fraction = new Fraccion(3, 5);
		Fraccion otherFraction = new Fraccion();
		
		//The user introduces the values of a fraction
		System.out.println("Introduzca el valor del numerador: ");
		otherFraction.setNumerator(sc.nextInt());
		
		System.out.println("Introduzca el valor del denominador: ");
		otherFraction.setDenominator(sc.nextInt());
		
		//The sum of the fractions
		fraction.simplify(fraction.sum(otherFraction.getNumerator(), otherFraction.getDenominator()));
		
		//The subtraction of the fractions
		fraction.simplify(fraction.subtraction(otherFraction.getNumerator(), otherFraction.getDenominator()));
	}

}