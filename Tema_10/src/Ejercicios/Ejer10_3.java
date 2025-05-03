package Ejercicios;

class Poder {
    String nombre;
    String tipo;
    int puntos;

    public Poder(String nombre, String tipo, int puntos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntos = puntos;
    }

    public void imprimirDatos() {
        System.out.print("- Nombre: " + nombre);
        System.out.print(", Tipo: " + tipo);
        System.out.print(", Puntos de poder: " + puntos + "\n");
    }
}

class Personaje {
    String nombre;
    int salud;
    String habilidad;

    public Personaje (String nombre, int salud, String habilidad) {
        this.nombre = nombre;
        this.salud = salud;
        this.habilidad = habilidad;
    }

    public void imprimirDatos() {
        System.out.print("- Nombre: " + nombre);
        System.out.print(", Salud inicial: " + salud);
        System.out.print(", Habilidad especial: " + habilidad + "\n");
    }
}

public class Ejer10_3 {
    public static void main(String[] args) {
        Poder poder1 = new Poder("Rayo empalador", "ataque", 10);
        Poder poder2 = new Poder("Bola de fuego", "hechizo", 15);
        Poder poder3 = new Poder("Muro de hielo", "defensa", 20);
        Personaje personaje1 = new Personaje("Thor", 100, "Martillo");
        Personaje personaje2 = new Personaje("Iron Man", 100, "Traje");

        System.out.println("Poderes:");
        poder1.imprimirDatos();
        poder2.imprimirDatos();
        poder3.imprimirDatos();
        System.out.println("\nPersonajes:");
        personaje1.imprimirDatos();
        personaje2.imprimirDatos();

    }
}


