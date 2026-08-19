public class Ejercicio9 {
    public static void main(String[] args) {
        double notaEstudiante = 4.2;
        String clasificacion = clasificarNota(notaEstudiante);
        System.out.println("La nota es: " + notaEstudiante);
        System.out.println("Clasificación: " + clasificacion);
    }
    public static String clasificarNota(double nota) {
        if (nota < 3.0) {
            return "Reprobado";
        } else if (nota <= 4.5) {
            return "Aprobado";
        } else {
            return "Excelente";
        }
    }
}