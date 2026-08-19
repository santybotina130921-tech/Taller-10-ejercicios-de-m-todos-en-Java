public class Ejercicio6 {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante(4.5);
        est1.mostrarBoletin();
        Estudiante.compararNotas(4.5, 3.8);
    }
}

class Estudiante {
    double nota; // Atributo de instancia

    public Estudiante(double nota) {
        this.nota = nota;
    }
    public void mostrarBoletin() {
        System.out.println("La nota del estudiante es: " + this.nota);
    }

    public static void compararNotas(double n1, double n2) {
        if (n1 > n2) {
            System.out.println("La primera nota es mayor.");
        } else if (n2 > n1) {
            System.out.println("La segunda nota es mayor.");
        } else {
            System.out.println("Ambas notas son iguales.");
        }
    }
}