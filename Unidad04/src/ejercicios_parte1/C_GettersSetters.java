package ejercicios_parte1;

public class C_GettersSetters {
	private String nombre = "Sin nombre"; 
	private double precio; 
	private int iva = 21; 
	private int cuantosQuedan; 
	
	public Articulo (String nombre, double precio, int iva, int cuantosQuedan) { 
	
		setNombre (nombre);
		setPrecio (precio);
		setIva(iva); 
		setCuantosQuedan(uantosQuedan);
		
		
	public void setNombre (String nombre) {
		if (!nombre.isBlank() ) {
			this.nombre = nombre.strip()
		}
	}
	public void setPrecio (double precio) {
		if (precio)
	}
	
	public void setIva (int iva) {
		if (iva >= 0 && iva < 100) {
			this.iva = iva;
		}
	}
	
	public void setCuantosQuedan (int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan; 
		}
	}
	
	public String getNombre()
}
}