import java.util.Scanner;

abstract class Publicacion{
    String titulo;
    String prestada;

    public Publicacion(String titulo){
        this.titulo = titulo;
        this.prestada = null;
    }

    void prestar(String socio){
        if(prestada == null) prestada = socio;

    }

    void devolver(){
        prestada = null;
    }

    public boolean estaPrestada() {
        return prestada != null;
    }

    abstract String getInfo();
}

class Autor {
    String nombre;

    public Autor(String nombre){
        this.nombre = nombre;
    }
}

class Libro extends Publicacion{
    Autor autor;

    public Libro(String titulo, Autor autor){
        super(titulo);
        this.autor = autor;
    }


    String getInfo() {
        return "Titulo: " + titulo + "\nAutor: " + autor.nombre + "\nPrestada: " + prestada;
    }
}

class Revista extends Publicacion{
    int numeroEdicion;

    public Revista(String titulo, int numeroEdicion){
        super(titulo);
        this.numeroEdicion = numeroEdicion;
    }

    String getInfo() {
        return "Titulo: " + titulo + "\nNumero de Edicion: " + numeroEdicion + "\nPrestada: " + prestada;
    }
}

class Biblioteca{
    Publicacion[] publicaciones = new Publicacion[100];
    int num = 0;

    void addPublicacion (Publicacion publicacion){

        if (num < publicaciones.length) {
            publicaciones[num] = publicacion;
            num++;
        } else {
            System.out.println("Eres tonto no caben mas libros");
        }
    }

    void mostrarPublicaciones(){
            for (int i = 0; i < num; i++) {
                System.out.println(i+1 + ": " + publicaciones[i].getInfo());
            }
    }

    boolean disponible(int i){
        if (i< 0 || i >= num) {
            return false;
        }
        return !publicaciones[i].estaPrestada();
    }

    void prestar(int i, String socio){
        if (i < 0 || i >= num) {
            System.out.println("Indice invalido");
            return;
        }

        publicaciones[i].prestar(socio);
    }

    void devolver(int i){
        if (i < 0 || i >= num) {
            System.out.println("Indice invalido");
            return;
        }
        publicaciones[i].devolver();
    }
}

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.addPublicacion(new Libro("El señor de los anillos", new Autor("JRR Tolkien")));
        biblioteca.addPublicacion(new Revista("National Geograpgic", 202));

        Scanner scanner = new Scanner(System.in);

        while (true) {

            biblioteca.mostrarPublicaciones();

            System.out.println("\n1: Prestar\n2: Devolver\n");
            switch (scanner.next()) {
                case "1" -> {
                    System.out.println("Introduzca el número de publicación:");
                    int i = scanner.nextInt();
                    scanner.nextLine();

                    if (biblioteca.disponible(i)) {
                        System.out.println("Introduzca el nombre del socio:");
                        String socio = scanner.nextLine();

                        biblioteca.prestar(i, socio);
                    }
                }
                case "2" -> {
                    System.out.println("Introduzca el número de publicación:");
                    int i = scanner.nextInt();
                    scanner.nextLine();

                    biblioteca.devolver(i);
                }
            }
        }
    }
}