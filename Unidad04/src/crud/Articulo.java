package crud;

public class Articulo {
	
	public Articulo(String codigo, String nombre, double precioCompra, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	/**
	 * Crea un artículo con todos sus datos
	 * @param codigo
	 * @param nombre
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 */
	
	private String codigo; 
	private String nombre; 
	private double precioCompra; 
	private double precioVenta; 
	private int stock; 
	
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public double getPrecioCompra() {
		return precioCompra;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public int getStock() {
		return stock;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	/**
	 * Incrementa el stock del artículo
	 * 
	 * @param cantidad número de artículos que se añaden
	 */
	public void entradaMercancia (int cantidad) {
		this.stock += cantidad; 
	}

	/**
	 * Reducir el stock si hay suficiente cantidad
	 * @param cantidad número de artículos a retirar
	 * @return 
	 */
	public boolean salidaMercancia (int cantidad) {
		boolean puedeSalir = true; 
		if (cantidad > stock) {
			puedeSalir =  false; 
		} else {
			stock -= cantidad; 
		}
		return puedeSalir; 
		
	} 
} // Fin Articulo
