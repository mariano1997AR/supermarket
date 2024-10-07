import java.util.*;

// Clase base Producto que implementa Comparable
abstract class Producto implements Comparable<Producto> {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método compareTo para comparar productos por precio
    @Override
    public int compareTo(Producto otro) {
        return Double.compare(this.precio, otro.precio);
    }

    // Método abstracto para sobrescribir en las clases hijas
    @Override
    public abstract String toString();
}

// Clase Bebida que extiende Producto
class Bebida extends Producto {
    private double litros;

    public Bebida(String nombre, double litros, double precio) {
        super(nombre, precio);
        this.litros = litros;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Litros: " + litros + " /// Precio: $" + precio;
    }
}

// Clase ProductoDeLimpieza que extiende Producto
class ProductoDeLimpieza extends Producto {
    private double contenido;

    public ProductoDeLimpieza(String nombre, double contenido, double precio) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Contenido: " + contenido + "ml /// Precio: $" + precio;
    }
}

// Clase Alimento que extiende Producto
class Alimento extends Producto {
    private String unidadVenta;

    public Alimento(String nombre, double precio, String unidadVenta) {
        super(nombre, precio);
        this.unidadVenta = unidadVenta;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " /// Precio: $" + precio + " /// Unidad de venta: " + unidadVenta;
    }
}

// Clase principal para ejecutar la solución
public class Supermercado {
    // Método para cargar los productos
    public static List<Producto> cargarProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Bebida("Coca-Cola Zero", 1.5, 20));
        productos.add(new Bebida("Coca-Cola", 1.5, 18));
        productos.add(new ProductoDeLimpieza("Shampoo Sedal", 500, 19));
        productos.add(new Alimento("Frutillas", 64, "kilo"));
        return productos;
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        List<Producto> productos = cargarProductos();

        // Imprimir los productos
        productos.forEach(System.out::println);

        // Encontrar el producto más caro y más barato usando Comparable
        Producto productoMasCaro = Collections.max(productos);
        Producto productoMasBarato = Collections.min(productos);

        // Imprimir el producto más caro y más barato
        System.out.println("=============================");
        System.out.println("Producto más caro: " + productoMasCaro.nombre);
        System.out.println("Producto más barato: " + productoMasBarato.nombre);
    }
}
