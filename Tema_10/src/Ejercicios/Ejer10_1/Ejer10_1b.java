package Ejercicios.Ejer10_1;

// Clase que representa un piloto de Formula 1
class Libros {
    String titulo;
    String autor;
    int anio;

    //COnstructor
    public Libros(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    //Metodo para imprimir los datos del piloto
    public void imprimirDatos() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Anio: " + anio);
    }
}

//Clase que representa un piloto de Formula 1
class Bibliotecas {
    String nombre;
    String direccion;

    // Constructor
    public Bibliotecas(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Metodo para imprimir los datos del piloto
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
    }
}

public class Ejer10_1b {
    public static void main(String[] args) {
        // Creacion de objetos con los valores proporcionados
        Bibliotecas biblioteca = new Bibliotecas("Biblioteca Central", "Calle Principal, 123");
        biblioteca.imprimirDatos();
        Libros libro1 = new Libros("Cien años de soledad", "Gabriel García Márquez", 1967);
        libro1.imprimirDatos();
        Libros libro2 = new Libros("1984", "George Orwell", 1949);
        libro2.imprimirDatos();
    }
}

/* String tituloLibro1 = "Cien años de soledad";
 String autorLibro1 = "Gabriel García Márquez";
 int anioPublicacionLibro1 = 1967;
 String tituloLibro2 = "1984";
 String autorLibro2 = "George Orwell";
 int anioPublicacionLibro2 = 1949;
 String nombreBiblioteca = "Biblioteca Central";
 String direccionBiblioteca = "Calle Principal, 123";
 System.out.println("Biblioteca: " + nombreBiblioteca);
 System.out.println("Dirección: " + direccionBiblioteca);
 System.out.println("Ejer10_1.Libros disponibles:");
 System.out.println("- " + tituloLibro1 + " (Autor: " + autorLibro1 + ", Año: " + anioPublicacionLibro1 + ")");
 System.out.println("- " + tituloLibro2 + " (Autor: " + autorLibro2 + ", Año: " + anioPublicacionLibro2 + ")");
*/