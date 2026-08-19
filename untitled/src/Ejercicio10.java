import java.util.ArrayList;
class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
}
public class Ejercicio10 {
    public static void main(String[] args) {
        ArrayList<Producto> inventario = new ArrayList<>();

        agregarProducto(inventario, new Producto("Laptop", 2500.0, 2));
        agregarProducto(inventario, new Producto("Mouse", 25.0, 10));
        agregarProducto(inventario, new Producto("Teclado", 45.0, 5));

        mostrarInventario(inventario);

        double total = calcularValorTotalInventario(inventario);
        System.out.println("\nValor total del inventario: $" + total);
    }
    public static void agregarProducto(ArrayList<Producto> productos, Producto p) {
        productos.add(p);
    }
    public static double calcularValorTotalInventario(ArrayList<Producto> productos) {
        double valorTotal = 0;
        for (Producto p : productos) {
            valorTotal += (p.precio * p.cantidad);
        }
        return valorTotal;
    }

    public static void mostrarInventario(ArrayList<Producto> productos) {
        System.out.println(" INVENTARIO ACTUAL ");
        for (Producto p : productos) {
            System.out.println("Producto: " + p.nombre + " | Precio: $" + p.precio + " | Cantidad: " + p.cantidad);
        }
    }
}