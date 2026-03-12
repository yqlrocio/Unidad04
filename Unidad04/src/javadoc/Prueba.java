package javadoc;

public class Prueba {

	/**
	 * En javadoc hay que explicar lo que hace. 
	 * 
	 * 1. Decir lo que hace los métodos 
	 * 
	 * NORMAS DE ESCRITURA: (CLEAN CODE)
	 * - Explicar para que lo voy a usar yo 
	 */

	// ejemplo com metodos 
	/**
	 * Divide dos notas entre el total 
	 * @param a dividendo 
	 * @param b divisor
	 * @return cociente entero
	 * @throws AritthmeticException si b es 0  // lanzar excepciones 
	 */
	public static int dividir (int a, int b) {
		return a/b;
		
	}
}
