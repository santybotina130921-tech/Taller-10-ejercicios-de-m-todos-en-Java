public class Ejercicio8 {
    public static void main(String[] args) {
        int numeroBusqueda = 5;
        int[] tabla = generarTablaMultiplicar(numeroBusqueda);

        System.out.println("Tabla de multiplicar del " + numeroBusqueda + ":");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(numeroBusqueda + " x " + (i + 1) + " = " + tabla[i]);
        }
    }

    public static int[] generarTablaMultiplicar(int numero) {
        int[] tabla = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }
}