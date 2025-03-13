package Ejer10_1;

class Mundo {
    String nombre;
    int numeroRegiones;
    boolean tieneCalabozos;

    public Mundo(String nombre, int numeroRegiones, boolean tieneCalabozos) {
        this.nombre = nombre;
        this.numeroRegiones = numeroRegiones;
        this.tieneCalabozos = tieneCalabozos;
    }

    public void imprimirDatos() {
        System.out.println("Ejer10_1.Mundo: " + nombre + " (Regiones: " + numeroRegiones + ")");
    }
}

class Personaje {
    String nombre;
    int salud;
    String armaPrincipal;

    public Personaje(String nombre, int salud, String armaPrincipal) {
        this.nombre = nombre;
        this.salud = salud;
        this.armaPrincipal = armaPrincipal;
    }

    public void imprimirDatos() {
        System.out.println("Ejer10_1.Personaje: " + nombre + " (Salud: " + salud + ", Arma: " + armaPrincipal + ")");
    }
}

class Enemigo {
    String nombre;
    int salud;
    String arma;

    public Enemigo(String nombre, int salud, String arma) {
        this.nombre = nombre;
        this.salud = salud;
        this.arma = arma;
    }

    public void imprimirDatos() {
        System.out.println("Ejer10_1.Enemigo: " + nombre + " (Salud: " + salud + ", Arma: " + arma + ")");
    }
}

class Objeto {
    String nombre;
    String tipo;
    int cantidadEfecto;

    public Objeto(String nombre, String tipo, int cantidadEfecto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadEfecto = cantidadEfecto;
    }

    public void imprimirDatos() {
        System.out.println("Ejer10_1.Objeto: " + nombre + " (Tipo: " + tipo + ", Efecto: +" + cantidadEfecto + " salud)");

    }
}

public class Ejer10_1d {
    public static void main(String[] args) {
        Mundo mundo = new Mundo("Hyrule", 5, true);
        Personaje personaje = new Personaje("Link", 100, "Espada Maestra");
        Enemigo enemigo = new Enemigo("Goblin", 50, "Porra");
        Objeto objeto = new Objeto("Frasco pocion", "Curacion", 50);
        mundo.imprimirDatos();
        personaje.imprimirDatos();
        enemigo.imprimirDatos();
        objeto.imprimirDatos();
    }
}

/*
String nombreMundo = "Hyrule";
int numeroRegiones = 5;
boolean tieneCalabozos = true;
String nombrePersonaje = "Link";
int salud = 100;
String armaPrincipal = "Espada Maestra";
String nombreEnemigo = "Goblin";
int saludEnemigo = 50;
String armaEnemigo = "Porra";
String nombreObjeto = "Frasco de poción";
String tipoObjeto = "Curación";
int cantidadEfecto = 50;
*/