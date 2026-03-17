package crud;

import java.util.ArrayList;

public class GestorArticulos {

	private ArrayList<Articulo> articulos; 
	
	/**
	 * Crear un gestor vacío de artículos
	 * @param articulos
	 */
	
	public GestorArticulos() {
		articulos = new ArrayList<>();
	}
	
	/**
	 * Devuelve lista de artículos
	 * @return lista de artículos
	 */
	public ArrayList<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(ArrayList<Articulo> articulos) {
		this.articulos = articulos;
	}
	
	/**
	 * Buscar artículo por su código
	 * @param codigo
	 * @return
	 */
	public Articulo buscarPorCodigo(String codigo) {
		Articulo articuloDeSalida = null; 
		
		for(Articulo articulo:articulos) {
			if(articulo.getCodigo().equals(codigo)) {
				return articulo; 
			} // fin if
		} // fin for
		return articuloDeSalida; 
	}
		
	public boolean modificarArticulo(String codigo, String nuevoNombre, double nuevoPrecioCompra, double nuevoPrecioVenta, int nuevoStock) {
		boolean verificacion = false; 

		Articulo articulo = buscarPorCodigo (codigo); 
		
		if (articulo != null) {
			verificacion = false; 
		} // fin if
		
		articulo.setNombre(nuevoNombre);
		articulo.setPrecioCompra(nuevoPrecioCompra);
		articulo.setPrecioVenta(nuevoPrecioVenta);
		articulo.setStock(nuevoStock);
		
		return verificacion; 
	
		
	} // fin articulo
}	
