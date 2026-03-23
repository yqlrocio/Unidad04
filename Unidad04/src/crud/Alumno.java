package crud;

public class Alumno {
	private String nombre;
	private double nota;

	// CONSTRUCTOR
	Alumno(String nombre, double nota) {
		this.nombre = nombre;
		this.nota = nota;
	}

	// GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	// MÉTODO TOSTRING
	@Override
	public String toString() {
		return String.format("%s, con la nota %s", nombre, nota);
	}

}