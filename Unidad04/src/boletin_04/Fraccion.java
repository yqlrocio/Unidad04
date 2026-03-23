package boletin_04;

public class Fraccion {
	private int numerator;
	private int denominator;
	
	Fraccion(){
		this.numerator = 1;
		this.numerator = 1;
	}
	
	Fraccion(int numerator, int denominator){
		this.denominator = denominator;
		this.numerator = numerator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public int[] sum(int numerator, int denominator) {
		//The array that will keep the values of the sum
		int resultSum[] = new int[2];
		
		//If the fractions have the same numerator, we will maintain the denominator and sum the numerator
		if (denominator == this.denominator) {
			this.numerator += numerator;
		} else {
			this.numerator = (this.numerator*denominator) + (this.denominator*numerator);
			this.denominator *= denominator;
		}
		
		//Fill the array with the results
		resultSum[0] = this.numerator;
		resultSum[1] = this.denominator;
		
		return resultSum;
	}
	
	public int[] subtraction(int numerator, int denominator) {
		//The array that will keep the values of the subtraction
		int resultSub[] = new int[2];
				
		//If the fractions have the same numerator, we will maintain the denominator and subtract the numerators
		if (denominator == this.denominator) {
			this.numerator -= numerator;
		} else {
			this.numerator = this.numerator*denominator - this.denominator*numerator;
			this.denominator *= denominator;
		}
				
		//Fill the array with the results
		resultSub[0] = this.numerator;
		resultSub[1] = this.denominator;
				
		return resultSub;
	}
	
	public int[] multiplication(int numerator, int denominator) {
		//The array that will keep the values of the multiplication
		int resultMult[] = new int[2];
						
		//Calculate the result
		numerator *= this.denominator;
		denominator *= this.numerator;
						
		//Fill the array with the results
		resultMult[0] = numerator;
		resultMult[1] = denominator;
						
		return resultMult;
	}
	
	public int[] division(int numerator, int denominator) {
		//The array that will keep the values of the division
		int resultDiv[] = new int[2];
								
		//Calculate the result
		numerator *= this.numerator;
		denominator *= this.denominator;
								
		//Fill the array with the results
		resultDiv[0] = numerator;
		resultDiv[1] = denominator;
								
		return resultDiv;
	}
	
	public void simplify(int[] result) {
		//The number that will help to calulate the greatest common divisor of the fraction's numbers
		int temporalNum;
		
		//The number that will have the value of the numerator
		int numValue = result[0];
		
		//The number that will have the value of the denominator
		int denomValue = result[1];
		
		//We calculate the greatest number divisor
		while (denomValue != 0) {
			temporalNum = denomValue;
			denomValue = numValue % denomValue;
			numValue = temporalNum;
		}
		
		//The numerator and denominator simplified
		this.numerator /= numValue;
		this.denominator /= numValue;
		
		System.out.println(numerator + "|" + denominator);
	}
	
}