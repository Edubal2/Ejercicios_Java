package Ejercicios;

import java.util.Scanner;

class VideoclubApp {
    String titulo;
    String director;
    Boolean disponible;

    public VideoclubApp() {}

    public void anadir(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
        disponible = true;
    }

    public void getInfo(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Director: " + director);
        System.out.println("Disponible: " + disponible);
    }

    public void eliminar(){
        titulo = null;
        director = null;
        disponible = null;
    }

    public void buscar(){
       System.out.println("Titulo: " + titulo);
       System.out.println("Director: " + director);
       System.out.println("Disponible: " + disponible + "\n");
    }

    public void prestar(){
        if (disponible) {
            System.out.println("La pelicula esta disponible");
            disponible = false;
        } else {
            System.out.println("La pelicula no esta disponible");
        }
    }

    public void devolver(){disponible = true;}
}


public class Ejer10_12 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        VideoclubApp[] app = new VideoclubApp[999];
        int count = 0;

        while (true) {
            System.out.println("""
                    VideocubApp
                    1. Añadir Peliculas
                    2. Ver la lista de Peliculas
                    3. Eliminar una pelicula
                    4. Buscar pelicula
                    5. Alquilar una pelicula
                    6. Devolver una pelicula
                    7. Salir del programa
                    """);

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.print("Titulo: ");
                    String titulo = sc.next();
                    System.out.print("Autor: ");
                    String autor = sc.next();

                    app[count] = new VideoclubApp();
                    app[count].anadir(titulo, autor);
                    count++;
                }

                case 2 -> {
                    System.out.print("Lista de Peliculas: ");
                    for (int i = 0; i < count; i++) {
                        System.out.println("Pelicula " + (i + 1) + ": ");
                        app[i].getInfo();
                        break;
                    }
                }

                case 3 -> {
                    System.out.println("Nombre de la pelicula a eliminar: ");
                    String index = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (app[i].titulo.equals(index)) {
                            app[i].eliminar();
                        } else {
                            System.out.println("La pelicula " + index + " no esta en nuestra base de datos");
                        }
                    }
                }

                case 4 -> {
                    System.out.print("Nombre de la pelicula a buscar: ");
                    String index = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (app[i].titulo.equals(index)) {
                            app[i].buscar();
                        } else {
                            System.out.println("La pelicula " + index + " no esta en nuestra base de datos");
                        }
                    }
                }

                case 5 -> {
                    System.out.print("Nombre de la pelicula a alquilar ");
                    String index = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (app[i].titulo.equals(index)) {
                            app[i].prestar();
                        } else {
                            System.out.println("La pelicula " + index + " no esta en nuestra base de datos");
                        }
                    }
                }

                case 6 -> {
                    System.out.print("Nombre de la pelicula a devolver: ");
                    String index = sc.nextLine();

                    for (int i = 0; i < count; i++) {
                        if (app[i].titulo.equals(index)) {
                            app[i].devolver();
                        } else {
                            System.out.println("La pelicula " + index + " no esta en nuestra base de datos");
                        }
                    }
                }

                case 7 -> {
                    System.out.print("Saliendo...");
                    return;
                }

                default -> System.out.println("Opcion no valida");

            }
        }
    }
}
