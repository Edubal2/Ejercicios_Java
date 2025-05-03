package Ejercicios;

import java.util.Scanner;

class BiblioApp {
    String titulo;
    String autor;
    Boolean disponible;

    public BiblioApp() {}

    public void prestar() {
        if (this.disponible) {
            this.disponible = false;
        } else {
            System.out.println("El libro no está disponible");
        }
    }

    public void devolver() {
        this.disponible = true;
    }

    public void getInfo() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Disponible: " + this.disponible);
    }

    public void anadir(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    public void eliminar() {
        this.titulo = null;
        this.autor = null;
        this.disponible = null;
    }
}

public class Ejer10_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BiblioApp[] biblioteca = new BiblioApp[100];
        int ac = 0;

        while (true) {
            System.out.println("""
               ✧✨✨ ✩BiblioApp✩✨✨ ✧
               ➊ ➕ Añadir Libro
               ➋ 📚 Ver libros
               ➌ 🗑 Eliminar libro
               ➍ 📤 Prestar libro
               ➎ 📥 Devolver libro
               ➏ 🖐 Salir
           """);

            String op = scanner.nextLine();

            switch (op) {
                case "1" -> {
                    System.out.print("Titulo: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    // Instanciar el objeto antes de usarlo
                    biblioteca[ac] = new BiblioApp();
                    biblioteca[ac].anadir(titulo, autor);
                    ac++;
                }

                case "2" -> {
                    System.out.println("Lista de libros");
                    for (int j = 0; j < ac; j++) {
                        System.out.println("Libro " + (j + 1) + ":");
                        biblioteca[j].getInfo();
                        System.out.println();
                    }
                }

                case "3" -> {
                    System.out.print("Número del libro a eliminar: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    if (index >= 0 && index < ac && biblioteca[index] != null) {
                        biblioteca[index].eliminar();
                    } else {
                        System.out.println("Índice inválido");
                    }
                }

                case "4" -> {
                    System.out.print("Número del libro a prestar: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    if (index >= 0 && index < ac && biblioteca[index] != null) {
                        biblioteca[index].prestar();
                    } else {
                        System.out.println("Índice inválido");
                    }
                }

                case "5" -> {
                    System.out.print("Número del libro a devolver: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea
                    if (index >= 0 && index < ac && biblioteca[index] != null) {
                        biblioteca[index].devolver();
                    } else {
                        System.out.println("Índice inválido");
                    }
                }

                case "6" -> {
                    System.out.println("Good bye");
                    return;
                }
                default -> System.out.println("Opción no válida");
            }
        }
    }
}
