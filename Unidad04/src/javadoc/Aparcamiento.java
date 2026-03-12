package javadoc;

/**
 * Clase que gestionea operaciones con un aparcamiento
 */

public class Aparcamiento {

	// Aquí habría atributos 
	
	/**
	 * Cuenta el número de plazas libres
	 * @param plazas matriz con el estado del aparcamiento
	 * @return numero de plazas libres
	 */
	public static int contarPlazaLibres (char [][], plazas) {
		int contador = 0; 
		for (int i = 0; i < plazas.length; i++) {
			for (int j = o; j < plaza[i].length; j++) {
				if (plazas[i][j] == 'L') {
					contador++; 
				}
			}
		}
	}
}
