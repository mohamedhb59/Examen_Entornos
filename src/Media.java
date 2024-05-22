public class Media {
    public static void main(String[] args) {
        // Crear un portfolio de cero para un nuevo empleado
        Portfolio portfolio = new Portfolio(0.8, 0.9, 0.7, 0.6);

        // Crear un empleado con el portfolio ya creado antes
        Empleado empleado = new Empleado("Juan Pérez", "12345678A", 1, portfolio);

        // Mostrar la media de los parámetros del portfolio del empleado
        System.out.println("La media de los parámetros evaluativos de " + empleado.getNombre() + " es: " + empleado.getPortfolio().media());
    }
}
