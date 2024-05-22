public class Empleado {
    private String nombre;
    private String dni;
    private int numeroEmpleado;
    private Portfolio portfolio;

    // Constructor
    public Empleado(String nombre, String dni, int numeroEmpleado, Portfolio portfolio) {
        this.nombre = nombre;
        this.dni = dni;
        this.numeroEmpleado = numeroEmpleado;
        this.portfolio = portfolio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
