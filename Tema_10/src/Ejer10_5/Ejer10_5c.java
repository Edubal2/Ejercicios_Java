package Ejer10_5;

class Producto {
    String nombre;
    String descripcion;
    double precio;
    int stock;

    public Producto(String nombre, String descripcion, double precio, int stock) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Precio: " + precio);
        System.out.println("Stock: " + stock);
    }
}

public class Ejer10_5c {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Corsair Vengeance DDR5", "6000MHz 32GB 2x16GB CL30", 109.99, 43) ;
    }
}
