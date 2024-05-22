public class Portfolio {
    private double complejidadTrabajos;
    private double calidadTrabajos;
    private double proactividad;
    private double companerismo;

    // Constructor
    public Portfolio(double complejidadTrabajos, double calidadTrabajos, double proactividad, double companerismo) {
        this.complejidadTrabajos = complejidadTrabajos;
        this.calidadTrabajos = calidadTrabajos;
        this.proactividad = proactividad;
        this.companerismo = companerismo;
    }

    // Getters y Setters
    public double getComplejidadTrabajos() {
        return complejidadTrabajos;
    }

    public void setComplejidadTrabajos(double complejidadTrabajos) {
        this.complejidadTrabajos = complejidadTrabajos;
    }

    public double getCalidadTrabajos() {
        return calidadTrabajos;
    }

    public void setCalidadTrabajos(double calidadTrabajos) {
        this.calidadTrabajos = calidadTrabajos;
    }

    public double getProactividad() {
        return proactividad;
    }

    public void setProactividad(double proactividad) {
        this.proactividad = proactividad;
    }

    public double getCompanerismo() {
        return companerismo;
    }

    public void setCompanerismo(double companerismo) {
        this.companerismo = companerismo;
    }

    // Media de los parametros
    public double media() {
        return (complejidadTrabajos + calidadTrabajos + proactividad + companerismo) / 4;
    }
}
