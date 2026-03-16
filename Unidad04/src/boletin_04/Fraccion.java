package boletin_04;

/**
 * Representa una fracción matemática con un numerador y denominador
 */

public class Fraccion {

	private int numerador; 
	private int denominador; 
	
	public Fraccion(int numerador, int denominador) {
		
		if (denominador == 0) {
			throw new IllegalArgumentException("El denominador");
		}
		this.numerador = numerador; 
		this.denominador = denominador; 
		simplificar(); 
	}

	public Fraccion suma(Fraccion f) {
		int den = this.denominador * f.denominador; 
		int num = this.numerador * f.denominador + f.numerador * this.denominador;
	
		return new Fraccion(num,den);
	}
	
	public Fraccion resta(Fraccion f) {
		int den = this.denominador * f.denominador; 
		int num = this.numerador * f.denominador - f.numerador * this.denominador;
	
		return new Fraccion(num,den);
	}
	
	public Fraccion multiplica(Fraccion f) {
		int num = this.numerador * f.numerador; 
		int den = this.denominador * f.numerador;
		
		return new Fraccion(num, den); 
	}
	
	public void simplificar() {
		int MCD = mcd(numerador, denominador); 
		
		numerador /= MCD; 
		denominador /= MCD; 
	}
	
	public int mcd(int a, int b) {
	
	a = Math.abs(a); 	
	b = Math.abs(b); 		
		
	while(b != 0) {
		int temp = b; 
		b = a%b; 
		a = temp; 
	}
	
	return a; 
	}
	
	@Override
	public String toString() {
		return "Fraccion [numerador=" + numerador + ", denominador=" + denominador + "]";
	}
}
