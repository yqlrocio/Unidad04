package modeloExamen01;

public class Socio {
	private String dni;
	private String nombre;
	private int numeroTelefono;
	private int prestamos;
	private final int limitePrestamos = 5;
	
	Socio(String dni, String nombre, int numeroTelefono, int prestamos){
		this.dni = dni;
		this.nombre = nombre;
		this.numeroTelefono = numeroTelefono;
		this.prestamos = prestamos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroTelefono() {
		return numeroTelefono;
	}

	public void setNumeroTelefono(int numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}

	public int getLimitePrestamos() {
		return limitePrestamos;
	}
	
	public int getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(int prestamos) {
		this.prestamos = prestamos;
	}
	
	/**
	 * Comprueba si el usuario puede pedir otro libro prestado
	 * @param dni
	 * @param limitePrestamos
	 * @param prestamos
	 * @return false si no se ha podido hacer el prestamo, true si si
	 */
	public boolean hacerPrestamo(String dni, int limitePrestamos, int prestamos) {
		//El booleano que indicara si se ha podido hacer el prestamo
		boolean prestamoHecho = false;
		
		//Si el usuario no ha alcanzado el limite de prestamos, se le dejara hacer este
		if (prestamos < limitePrestamos) {
			prestamos++;
			prestamoHecho = true;
		}
		
		return prestamoHecho;
	}
	
	public String toString() {
		String datos = "DNI del socio: " + dni + "\t Nombre del socio: " + nombre + "\t Numero de telefono del socio: " + numeroTelefono + "\t Prestamos pendientes a devolver: " + prestamos;
		return datos;
	}
	
	public boolean equals(Object objeto) {
		//El booleano que indica si dos socios son, en realidad, el mismo
		boolean mismoSocio =  false;
		
		//El casteo
		Socio otroSocio = (Socio) objeto;
		
		//Si comparten el mismo dni, son el mismo socio
		if (this.dni.equalsIgnoreCase(otroSocio.dni)) {
			mismoSocio = true;
		}
		
		return mismoSocio;
	}
}