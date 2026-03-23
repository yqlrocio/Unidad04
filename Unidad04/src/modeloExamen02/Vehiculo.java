package modeloExamen02;

public class Vehiculo {

	private String matricula;
	private String modelo;
	private double precioPorDia;
	private double porcentajePremium;
	private double precioSeguro;
	private int diasAlquilados;
	
	Vehiculo(String matricula, String modelo, double precioPorDia, double porcentajePremium, double precioSeguro, int diasAlquilados){
		this.matricula = matricula;
		this.diasAlquilados = diasAlquilados;
		this.modelo = modelo;
		this.porcentajePremium = porcentajePremium;
		this.precioPorDia = precioPorDia;
		this.precioSeguro = precioSeguro;
	}
	
	Vehiculo(String matricula, String modelo, double precioPorDia, double porcentajePremium){
		this.matricula = matricula;
		this.modelo = modelo;
		this.porcentajePremium = porcentajePremium;
		this.precioPorDia = precioPorDia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioPorDia() {
		return precioPorDia;
	}

	public void setPrecioPorDia(double precioPorDia) {
		this.precioPorDia = precioPorDia;
	}

	public double getPorcentajePremium() {
		return porcentajePremium;
	}

	public void setPorcentajePremium(double porcentajePremium) {
		this.porcentajePremium = porcentajePremium;
	}

	public double getPrecioSeguro() {
		return precioSeguro;
	}

	public void setPrecioSeguro(double precioSeguro) {
		this.precioSeguro = precioSeguro;
	}

	public int getDiasAlquilados() {
		return diasAlquilados;
	}

	public void setDiasAlquilados(int diasAlquilados) {
		this.diasAlquilados = diasAlquilados;
	}
	
	/**
	 * Este metodo calcula el importe de recargo premium
	 * @param precioPorDia
	 * @param porcentajePremium
	 * @return El valor de ese importe
	 */
	public double recargoPremium(double precioPorDia, double porcentajePremium) {
		//El importe del recargo premium final
		double importeRecargoPremium;
		
		//Calculo para obtener el recargo
		importeRecargoPremium = (precioPorDia*porcentajePremium)/100;
		
		return importeRecargoPremium;
	}
	/**
	 * Calcula el valor del importe total seguro
	 * @param diasAlquilados
	 * @param precioSeguro
	 * @return El valor de ese importe
	 */
	public double importeTotalSeguro(int diasAlquilados, double precioSeguro) {
		//El valor de ese importe total
		double valorImporte;
		
		//Calculo para obtener ese valor
		valorImporte = diasAlquilados*precioSeguro;
		
		return valorImporte;
	}
	
	/**
	 * Calcula el ingreso total generado por vehiculo
	 * @param precioPorDia
	 * @param recargoPremium
	 * @param importeTotalSeguro
	 * @return El valor de ese ingreso total
	 */
	public double ingresoTotalPorVehiculo(double precioPorDia, double recargoPremium, double importeTotalSeguro) {
		//El valor del ingreso total generado por vehiculo
		double valorIngreso;
		
		//Calculo para obtener dicho valor
		valorIngreso = precioPorDia + recargoPremium + importeTotalSeguro;
		
		return valorIngreso;
	}
	
	/**
	 * Devuelve una cadena con los datos del vehiculo
	 */
	public String toString() {
		String datosVehiculo = matricula + " - " + modelo + "\n PrecioBase/Dia: " + precioPorDia + " | Recargo Premium: " + recargoPremium(precioPorDia, porcentajePremium) + " (" + porcentajePremium*100 + ") \n Dias alquilado: " + diasAlquilados + " | Total generado: " + ingresoTotalPorVehiculo(precioPorDia, recargoPremium(precioPorDia, porcentajePremium), importeTotalSeguro(diasAlquilados, precioSeguro));
		return datosVehiculo;
	}
	
	/**
	 * Devuelve true si ambos coches tienen la misma matricula, y false si esta es distinta
	 */
	public boolean equals(Object objeto) {
		//El booleano que indifcara si dos coches son iguales
		boolean mismoCoche = false;
		
		//El casteo
		Vehiculo otroCoche = (Vehiculo) objeto;
		
		//Si dos coches tienen la misma matricula, se consideran iguales
		if (this.matricula.equalsIgnoreCase(otroCoche.matricula)) {
			mismoCoche =  true;
		}
		
		return mismoCoche;
	}
	
	/**
	 * Establece si el porcentaje es superior al 12% o no
	 * @param porcentajePremium
	 * @return True si el porcentaje es mayor, false si es menor
	 */
	public boolean porcentajePrmiumSuperior(double porcentajePremium) {
		boolean porcentajeMayor = false;
		
		//Si el porcentaje premium es superior a 12, el booleano sera true
		if (porcentajePremium > 0.12) {
			porcentajeMayor = true;
		}
		
		return porcentajeMayor;
	}

}

