package Ejer10_1;

// Clase que representa a un piloto de Fórmula 1
class Piloto {
    String nombre;
    int numero;
    String equipo;
    int podios;
    int posicionActual;

    // Constructor
    public Piloto(String nombre, int numero, String equipo, int podios, int posicionActual) {
        this.nombre = nombre;
        this.numero = numero;
        this.equipo = equipo;
        this.podios = podios;
        this.posicionActual = posicionActual;
    }

    //Metodo para imprimir los datos del piloto
    public void imprimirDatos() {
        System.out.println("Ejer10_1.Piloto: " + nombre);
        System.out.println("Numero: " + numero);
        System.out.println("Ejer10_1.Equipo: " + equipo);
        System.out.println("Podios totales: " + podios);
        System.out.println("Posicion actual del piloto: " + posicionActual);
    }
}

// Clase que representa un circuito de carrera
class Circuito {
    String nombre;
    int vueltasTotales;
    float tiempoVueltaRapida;

    // Constructor
    public Circuito(String nombre, int vueltasTotales, float tiempoVueltaRapida) {
        this.nombre = nombre;
        this.vueltasTotales = vueltasTotales;
        this.tiempoVueltaRapida = tiempoVueltaRapida;
    }

    // Metodo para imprimir los datos del circuito
    public void imprimirDatos() {
        System.out.println("Circuitos: " + nombre);
        System.out.println("Vueltas totales: " + vueltasTotales);
        System.out.println("Tiempo de vuelta rapida: " + tiempoVueltaRapida + " min");
    }
}

// Clase que representa los datos de la carrera (o temporada)
class Carrera {
    int totalCarreras;

    // Constructor
    public Carrera(int totalCarreras) {
        this.totalCarreras = totalCarreras;
    }

    // Metodo para imprimir los datos de la carrera
    public void imprimirDatos() {
        System.out.println("Total de carreras: " + totalCarreras);
    }
}

// Clase principal donde se crean los objetos y se muestran los datos
public class Ejer10_1a {
    public static void main(String[] args) {
        // Creacion de objetos con los valores proporcionados
        Piloto piloto = new Piloto("Lewis Hamilton", 44, "Mercedes", 95, 1);
        Circuito circuito = new Circuito("Silverstone", 52, 1.27f);
        Carrera carrera = new Carrera(1);

        // Impresion de los datos
        piloto.imprimirDatos();
        System.out.println(); // Linea en blanco para separar la salida
        circuito.imprimirDatos();
        System.out.println();
        carrera.imprimirDatos();
    }
}