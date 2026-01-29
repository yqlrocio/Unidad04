package ejercicios_parte2;

public class CuentaCorriente {
    private String DNI;
    private String nombre;
    private double saldo;
    private String nacionalidad;
    
    // Constructor 1: DNI y saldo inicial
    public CuentaCorriente(String DNI, double saldoInicial) {
        this.DNI = DNI;
        this.saldo = saldoInicial;
        this.nacionalidad = "Española";
    }
    
    // Constructor 2: DNI, nombre y saldo inicial
    public CuentaCorriente(String DNI, String nombre, double saldoInicial) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldoInicial;
        this.nacionalidad = "Española";
    }
    
    // Constructor 3: DNI, nombre, saldo inicial y nacionalidad
    public CuentaCorriente(String DNI, String nombre, double saldoInicial, String nacionalidad) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.saldo = saldoInicial;
        if (nacionalidad.equals("Española") || nacionalidad.equals("Extranjera")) {
            this.nacionalidad = nacionalidad;
        } else {
            this.nacionalidad = "Española";
        }
    }
    
    // Getters y Setters
    public String getDNI() {
        return DNI;
    }
    
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad.equals("Española") || nacionalidad.equals("Extranjera")) {
            this.nacionalidad = nacionalidad;
        }
    }
    
    // Método para sacar dinero
    public boolean sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
    
    // Método para ingresar dinero
    public boolean ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            return true;
        }
        return false;
    }
    
    // Método toString
    public String toString() {
        return "DNI: " + DNI + ", Nombre: " + nombre + ", Saldo: " + saldo + "€, Nacionalidad: " + nacionalidad;
    }
    
    // Método equals
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        
        CuentaCorriente otra = (CuentaCorriente) obj;
        if (this.DNI == null) {
            if (otra.DNI != null) return false;
        } else if (!this.DNI.equals(otra.DNI)) return false;
        
        if (this.nombre == null) {
            if (otra.nombre != null) return false;
        } else if (!this.nombre.equals(otra.nombre)) return false;
        
        return true;
    }
}