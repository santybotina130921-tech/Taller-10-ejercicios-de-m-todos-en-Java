public class Ejercicio4 {
    public static void main(String[] args) {
        boolean esPar = esPar(4);
        System.out.println("¿Es par?: " + esPar);
    }
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
