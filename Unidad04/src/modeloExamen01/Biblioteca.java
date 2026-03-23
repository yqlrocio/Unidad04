package modeloExamen01;

import java.util.ArrayList;

public class Biblioteca {
	
	ArrayList <Libro> listaLibros;
	ArrayList <Socio> listaSocios;
	ArrayList <Prestamo> listaPrestamo;
	ArrayList <Prestamo> listaDevolucion;
	ArrayList <String> listaLibrosDisponibles;
	
	Biblioteca(){
		listaLibros = new ArrayList<>();
		listaSocios = new ArrayList<>();
		listaPrestamo = new ArrayList<>();
		listaDevolucion = new ArrayList<>();
		listaLibrosDisponibles = new ArrayList<>();
	}
	
	Biblioteca(ArrayList <Libro> listaLibros, ArrayList <Socio> listaSocios, ArrayList <Prestamo> listaPrestamo, ArrayList <Prestamo> listaDevolucion, ArrayList <String> listaLibrosDisponibles){
		this.listaLibros = listaLibros;
		this.listaSocios = listaSocios;
		this.listaDevolucion = listaDevolucion;
		this.listaPrestamo = listaPrestamo;
		this.listaLibrosDisponibles = listaLibrosDisponibles;
	}
	
	ArrayList <Libro> getListaLibros(){
		return listaLibros;
	}
	
	ArrayList <Socio> getListaSocios(){
		return listaSocios;
	}
	
	ArrayList <Prestamo> getListaPrestamo(){
		return listaPrestamo;
	}
	
	ArrayList <Prestamo> getListaDevolucion(){
		return listaDevolucion;
	}
	
	ArrayList <String> getListaLibrosDisponibles(){
		return listaLibrosDisponibles;
	}
	
	/**
	 * Anade un socio a la lista
	 * @param unSocio
	 */
	public void altaSocios(Socio unSocio) {
		listaSocios.add(unSocio);
	}
	
	/**
	 * Da de alta un nuveo libro en la lista
	 * @param unLibro
	 */
	public void altaLibro(Libro unLibro) {
		listaLibros.add(unLibro);
	}
	
	/**
	 * Elimina a un usuario de la lista
	 * @param dni
	 * @return False si no se ha elimanado y true si se ha podido
	 */
	public boolean eliminarSocio(String dni) {
		return listaSocios.removeIf(cualquierSocio -> cualquierSocio.getDni().equalsIgnoreCase(dni));
	}
	
	/**
	 * Elimina un libro de la lista
	 * @param codigo
	 * @return False si no se ha eliminado el libro, true si se ha podido borrar de la lista
	 */
	public boolean eliminaLibro(int codigo) {
		return listaLibros.removeIf(cualquierLibro -> cualquierLibro.getCodigo() == codigo);
	}
	
	/**
	 * Esta funcion busca actualizar el numero de telefono de un socio
	 * @param dni
	 * @param numeroTelefono
	 * @return Devuelve true si se ha encontrado al socio y, por lo tanto, se ha cambiado su numero de telefono
	 */
	public boolean actualizarDatos(String dni, int numeroTelefono) {
		//El booleano que indicara si se ha podido actualizar el numero de telefono del socio
		boolean infoActualizada = false;
		
		//Si el socio se encuentra en la lista de socios, se podra actualizar la informacion
		for (Socio s : listaSocios) {
			if (s.getDni().equalsIgnoreCase(dni)) {
				s.setNumeroTelefono(numeroTelefono);
				infoActualizada = true;
			}
		}
		
		return infoActualizada;
	}
	
	/**
	 * Modifica el autor de un libro
	 * @param codigo
	 * @param autor
	 * @return False si no he podido modificar el autor, true si se ha podido
	 */
	public boolean modificarLibro(int codigo, String autor) {
		//El booleano que indica si se ha podido modificar un libro
		boolean libroModificado = false;
		
		for (Libro l : listaLibros) {
			if (l.getCodigo() == codigo) {
				l.setAutor(autor);
				libroModificado = true;
			}
		}
		
		return libroModificado;
	}
	
	public boolean hacerPrestamo(Prestamo prestamo) {
		//El booleano que indicara si se puede hacer el prestamo o no
		boolean prestamoHecho = false;
		
		//Si hay suficientes ejemplares del libro y el socio no sobrepasa el limite de prestamos, podra hacer el prestamo
		for(Libro l : listaLibros) {
			for (Socio s : listaSocios) {
				if (s.getPrestamos() < s.getLimitePrestamos() && l.getNumEjemplares() > 0) {
					listaPrestamo.add(prestamo);
					prestamoHecho = true;
					l.setNumEjemplares(l.getNumEjemplares()-1);
					s.setPrestamos(s.getPrestamos()+1);
				}
			}
		}
		
		return prestamoHecho;
	}
	
	public boolean hacerDevolucion(Prestamo prestamo, int codigo) {
		//El booleano que indicara si se ha podido hacer la devolucion
		boolean devolucionHecha = false;
		
		//Si el libro se encuentra en la lista de Prestamos, podra ser devuelto
		for (Prestamo p : listaPrestamo) {
			if (p.getCodigoLibro() == codigo) {
				listaDevolucion.add(prestamo);
				devolucionHecha = true;
				
				for(Libro l : listaLibros) {
					for (Socio s : listaSocios) {
						l.setNumEjemplares(l.getNumEjemplares()+1);
						s.setPrestamos(s.getPrestamos()-1);
						listaPrestamo.removeIf(cualquierPrestamo -> cualquierPrestamo.getCodigoLibro() == l.getCodigo() && cualquierPrestamo.getDniSocio().equalsIgnoreCase(s.getDni()));
					}
				}
			}
		}
		
		return devolucionHecha;
	}
	
	public void librosDisponibles() {
		for (Libro l : listaLibros) {
			if (l.getNumEjemplares() > 0) {
				listaLibrosDisponibles.add(l.getTitulo());
			}
		}
	}
	
	public Object buscarSocio(String dni) {
		//El socio buscado
		Object socioBuscado = null;
		
		for (Socio s: listaSocios) {
			if (s.getDni().equalsIgnoreCase(dni)) {
				socioBuscado = s;
			}
		}
		
		return socioBuscado;
	}
	
	public Object buscarLibro(int codigo) {
		//El socio buscado
		Object libroBuscado = null;
		
		for (Libro l: listaLibros) {
			if (l.getCodigo() == codigo) {
				libroBuscado = l;
			}
		}
		
		return libroBuscado;
	}

}