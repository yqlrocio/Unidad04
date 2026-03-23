package crud;

import java.util.ArrayList;

public class AlumnoGestor {
	private ArrayList<Alumno> listaAlumnos;

	// CONSTRUCTOR
	AlumnoGestor() {
		this.listaAlumnos = new ArrayList<>();
	}

	// MÉTODOS CRUD
	// CREATE, CREAR ALUMNO
	public void crearAlumno(Alumno alumno) {
		listaAlumnos.add(alumno);
	}

	// READ, OBTENER LISTA
	public ArrayList<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	// UPDATE, BUSCA NOMBRE Y CAMBIA NOTA
	public boolean modificarNota(String nombre, double nuevaNota) {
		boolean valido = false;
		for (Alumno a : listaAlumnos) {
			if (a.getNombre().equalsIgnoreCase(nombre)) {
				a.setNota(nuevaNota);
				valido = true;
			}
		}
		return valido;
	}

	// DELETE, ELIMINA ALUMNO POR NOMBRE
	public boolean borrarAlumno(String nombre) {
		return listaAlumnos.removeIf(a -> a.getNombre().equalsIgnoreCase(nombre));
	}

}