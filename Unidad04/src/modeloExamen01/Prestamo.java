package modeloExamen01;

public class Prestamo {

		private String dniSocio;
		private int codigoLibro;
		private String fecha;
		
		Prestamo(String dniSocio, int codigoLibro, String fecha){
			this.dniSocio = dniSocio;
			this.codigoLibro = codigoLibro;
			this.fecha = fecha;
		}

		public String getDniSocio() {
			return dniSocio;
		}

		public void setDniSocio(String dniSocio) {
			this.dniSocio = dniSocio;
		}

		public int getCodigoLibro() {
			return codigoLibro;
		}

		public void setCodigoLibro(int codigoLibro) {
			this.codigoLibro = codigoLibro;
		}

		public String getFecha() {
			return fecha;
		}

		public void setFecha(String fecha) {
			this.fecha = fecha;
		}
		
		public String toString() {
			String cadena = "DNI del socio: " + dniSocio + "\t Codigo del libro: " + codigoLibro + "\t Fecha: " + fecha;  
			return cadena;
		}
}
