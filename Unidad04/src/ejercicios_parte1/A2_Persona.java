package ejercicios_parte1;

public class A2_Persona {
	String dni;
	String nombre; 
	String apellidos; 
	int edad;

	// Constructor
		public A2_Persona(String dni, String nombre, String apellidos, int edad) {
		   this.dni = dni;
		   this.nombre = nombre;
		   this.apellidos = apellidos; 
		   this.edad = edad; 
		}
	
    // Método para comprobar si es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
}
