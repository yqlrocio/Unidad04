package ejercicios_parte2;

public class Alumno {
    private String nombre;
    private double notaMedia;
    
    // Constructor
    public Alumno(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getNotaMedia() {
        return notaMedia;
    }
    
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    // Método toString
    public String toString() {
        return nombre + " " + notaMedia;
    }
    
    // Método equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Alumno alumno = (Alumno) obj;
        return nombre.equals(alumno.nombre);
    }
}