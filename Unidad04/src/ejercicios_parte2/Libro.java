package ejercicios_parte2;

public class Libro {

	private String titulo;
	private String autor;
	private int numEjemplares;
	private int numEjemplaresPrestados;
	private String genero; // Narrativo, Lírico, Dramático, Didáctico, Poético

	// Constructor 1: título y autor
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = 1;
		this.numEjemplaresPrestados = 0;
		this.genero = "Narrativo"; // Valor por defecto
	}

	// Constructor 2: título, autor, ejemplares y ejemplares prestados
	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
		this.genero = "Narrativo"; // Valor por defecto
	}

	// Constructor 3: todos los atributos
	public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemplares = numEjemplares;
		this.numEjemplaresPrestados = numEjemplaresPrestados;
		// Validar género
		String[] generosValidos = { "Narrativo", "Lírico", "Dramático", "Didáctico", "Poético" };
		boolean generoValido = false;
		for (String g : generosValidos) {
			if (g.equals(genero)) {
				generoValido = true;
				break;
			}
		}
		if (generoValido) {
			this.genero = genero;
		} else {
			this.genero = "Narrativo"; // Valor por defecto
		}
	}

	// Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		this.numEjemplares = numEjemplares;
	}

	public int getNumEjemplaresPrestados() {
		return numEjemplaresPrestados;
	}

	public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
		this.numEjemplaresPrestados = numEjemplaresPrestados;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		String[] generosValidos = { "Narrativo", "Lírico", "Dramático", "Didáctico", "Poético" };
		for (String g : generosValidos) {
			if (g.equals(genero)) {
				this.genero = genero;
				break;
			}
		}
	}

	// Método para préstamo
	public boolean prestamo() {
		if (numEjemplaresPrestados < numEjemplares) {
			numEjemplaresPrestados++;
			return true;
		}
		return false;
	}

	// Método para devolución
	public boolean devolucion() {
		if (numEjemplaresPrestados > 0) {
			numEjemplaresPrestados--;
			return true;
		}
		return false;
	}

	// Método toString
	public String toString() {
		return "Libro{" + "titulo='" + titulo + '\'' + ", autor='" + autor + '\'' + ", numEjemplares=" + numEjemplares
				+ ", numEjemplaresPrestados=" + numEjemplaresPrestados + ", genero='" + genero + '\'' + '}';
	}

	// Método equals
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Libro libro = (Libro) obj;
		return titulo.equals(libro.titulo) && autor.equals(libro.autor);
	}
}