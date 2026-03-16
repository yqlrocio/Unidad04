package crud;

import java.util.ArrayList;

import ejercicios_parte2.Alumno;

public class GestorAlumno {

	public GestorAlumno(ArrayList<alumno> alumnos) {
		this.alumnos = alumnos;
	}
	
	public GestorAlumno() {
		alumnos = new ArrayList<>(); 
	}

	private ArrayList<alumno> alumnos; 

	public Alumno buscarAlumnoPorSuNombre(String nombre) {
		
	}
	
	public boolean modificarNota(String nombre, double nuevaNota) {
		Alumno alumno = buscarAlumnoPorSuNombre(nombre);
		boolean hayModificacion = false; 
		if (alumno != null) {
			alumno.setNotaMedia(nuevaNota);
			hayModificacion = true; 
		}
	}
	
}
