package Ejer10_5;

class Libro {
    String nombre;
    int año;
    Boolean isAvailable;


    public Libro(String nombre, int año, Boolean isAvailable) {
        this.nombre = nombre;
        this.año = año;
        this.isAvailable = isAvailable;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Año: " + año);
        System.out.println("IsAvailable: " + isAvailable);
    }
}

public class Ejer10_5b {
    public static void main(String[] args) {
        Libro libro = new Libro("Harry Potter", 2000, true);
    }
}
