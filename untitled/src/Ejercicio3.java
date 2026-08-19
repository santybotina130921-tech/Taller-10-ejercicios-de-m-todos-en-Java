public class Ejercicio3 {
    public static void main(String[] args) {
        double area = calcularAreaRectangulo(5.0, 3.0);
        System.out.println("El área es: " + area);
    }
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }
}