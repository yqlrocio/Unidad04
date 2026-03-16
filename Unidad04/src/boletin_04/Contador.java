package boletin_04;

/**
 * Clase que representa un contador 
 * 
 * Contador > cont // Métodos que vamos a emplear
 * 	- incrementar 
 * 	- decrementar
 * 
 * Limitación: el contador nunca puede tener número negativo
 */

public class Contador {

	private int cont;
	/**
	 * Constructor con valor inicial 
	 */
	public Contador(int cont) {
		this.cont = cont;
	}
	
	/**
	 * Constructor por defecto
	 */
	public Contador() {
		this.cont = 0;
	} // fin del contador

	// GETTERS Y SETTERS
	public int getCont() {
		return cont;
	} // fin del get

	public void setCont(int cont) {
		if (cont >= 0) {
		this.cont = cont;
		} // fin de if
	} // fin del set
	
	 /**
	  * Incrementar el contador en una unidad
	  */
	
	public void incrementar() {
		incrementar(1); 
	} // fin de incrementar
	
	/**
	 * Incrementar el contador en una unidad
	 * @param suma
	 */
	public void incrementar(int suma) {
		if (suma >= 0) {
			this.cont+=suma; 
		} // fin del if
	} // fin de incrementar
	
	/**
	 * Decrementa el contador en resta unidades
	 */
	public void decrementar( ) {
		cont--; 
		
		if (cont < 0) {
			cont = 0; 
		} // fin del if
	} // fin de decrementar
	
	/**
	 * Decrementa el contador en resta unidades
	 */
	public void decrementar(int resta) {
		cont = cont - resta; 
		if (cont < 0) {
			cont = 0; 
		} // fin del if
	} // fin de decrementar
	
	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
} // fin del ejercicio
