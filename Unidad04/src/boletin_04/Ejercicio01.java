package boletin_04;

/**
 * Esta clase representa una hora en formato 24 horas
 * 
 * RESPONSABILIDADES: 
 * 	- Mantener una hora válida
 * 	- Permitir incrementar segundos controlando los límites
 */

public class Hora {

	/**
	 * Constructor completo
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */

	private int hora;
	private int minuto;
	private int segundo;

	// bob el constructor
	public Hora(int hora, int minuto, int segundo) {
		setHora(hora); 
		setMinuto(minuto); 
		setSegundo(segundo); 
	}
	
	public Hora() {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setHora(int hora) {
		if (hora < 0 || hora > 23) {
			throw new IllegalArgumentException("La hora debe estar entre 0 y 23");
		}
		this.hora = hora;
	}

	public void setMinuto(int minuto) {
		if (minuto < 0 || minuto > 59) {
			throw new IllegalArgumentException("El minuto debe estar entre 0 y 59");
		}
		this.minuto = minuto;
	}

	public void setSegundo(int segundo) {
		if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("El segundo debe estar entre 0 y 59");
        }
        this.segundo = segundo;	
        }

	// funcion para incrementar 1 seg

	public void incrementarSegundo() {
		segundo++;
		
		if (segundo ==60) {
			segundo = 0;
			minuto++;
			
		if (minuto == 60) {
	        minuto = 0;
	        hora++;
	                
	    if (hora == 24) {
	        hora = 0;
	        
				} //if horas
	    
			}//if min
		
		}//if seg
		
		
		
		
	}//funciion  

	
	
	
}//FINAL
