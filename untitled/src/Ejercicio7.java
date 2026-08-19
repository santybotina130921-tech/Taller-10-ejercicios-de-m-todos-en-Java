public class Ejercicio7 {
    public static void main(String[] args) {
        double[] calificaciones = {3.0, 4.5, 2.8, 5.0, 3.8};
        double promedio = calcularPromedioClase(calificaciones);

        System.out.println("El promedio del grupo es: " + promedio);
    }
    public static double calcularPromedioClase(double[] calificaciones) {
        if (calificaciones.length == 0) return 0.0;

        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }
        return suma / calificaciones.length;
    }
}