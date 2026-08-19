public class Ejercicio5 {

    public static void main(String[] args) {

        double promedioDos = calcularPromedio(4.0, 5.0);
        System.out.println("Promedio de dos notas: " + promedioDos);

        double[] lista = {3.5, 4.2, 4.8};
        double promedioArreglo = calcularPromedio(lista);
        System.out.println("Promedio del arreglo: " + promedioArreglo);
    }

    public static double calcularPromedio(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }

    public static double calcularPromedio(double[] notas) {
        if (notas.length == 0) return 0.0;
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}