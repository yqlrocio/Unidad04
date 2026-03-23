package modeloExamen01;

public class Libro {
		
		private int codigo;
		private String titulo;
		private int numEjemplares;
		private String autor;
		
		Libro(int codigo, String titulo, int numEjemplares, String autor){
			this.codigo = codigo;
			this.numEjemplares = numEjemplares;
			this.titulo = titulo;
			this.autor = autor;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public int getNumEjemplares() {
			return numEjemplares;
		}

		public void setNumEjemplares(int numEjemplares) {
			this.numEjemplares = numEjemplares;
		}
		
		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}
		
		public String toString() {
			String chain = "Codigo: " + codigo + "\t Titulo: " + titulo + "\t Autor: " + autor + "\t Ejemplares disponibles: " + numEjemplares;
			return chain;
		}
		
		public boolean equals(Object objeto) {
			//EL booleano que indicara si dos libros son iguales
			boolean mismoLibro = false;
			
			//El casteo
			Libro otroLibro = (Libro) objeto;
			
			//Si dos libros comparten el mismo codigo, seran considerados iguales
			if (this.codigo == otroLibro.codigo) {
				mismoLibro = true;
			}
			
			return mismoLibro;
		}
	}
