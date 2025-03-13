package Ejer10_1;

// Clase que representa el torneo
class Torneo {
    String nombre;
    String pais;
    int anio;

    // Constructor
    public Torneo(String nombre, String pais, int anio) {
        this.nombre = nombre;
        this.pais = pais;
        this.anio = anio;
    }

    // Metodo para imprimir los datos del piloto
    public void imprimirDatos() {
        System.out.println("Ejer10_1.Torneo: " +nombre + " (" + anio + "): ");
    }
}

// Clase que representa a los equipos
class Equipo {
    String nombre;
    int goles;
    String entrenador;
    int puntos;

    // Constructor
    public Equipo(String nombre, String entrenador, int goles, int puntos) {
        this.nombre = nombre;
        this.goles = goles;
        this.entrenador = entrenador;
        this.puntos = puntos;
    }
}

// Clase que representa al estadio
class Estadio {
    String nombre;
    int espectadores;

    // Constructor
    public Estadio(String nombre, boolean isPartidoConcluido, int espectadores) {
        this.nombre = nombre;
        this.espectadores = espectadores;
    }

    // Metodo para imprimir los datos del estadio
    public void imprimirDatos(){
        System.out.println("Ejer10_1.Estadio: " + nombre + " (Espectadores: " + espectadores + "): ");
    }
}


public class Ejer10_1c {

    // Los datos de los quipos se imprimen en la clase ya que mezcla dos equipos
    public static void imprimirTorneos(Equipo equipo1, Equipo equipo2) {
        System.out.println("Partido: " + equipo1.nombre + " vs. " + equipo2.nombre);
        System.out.println("Goles " + equipo1.nombre + ": " + equipo1.goles);
        System.out.println("Goles " + equipo2.nombre + ": " + equipo2.goles);
    }

    public static void main(String[] args) {
        Torneo torneo = new Torneo("Copa Mundial", "España", 2025);
        Equipo equipo1 = new Equipo("Tigres Rojos", "Carlos Martinez", 2, 3 );
        Equipo equipo2 = new Equipo("Águilas Azules", "Ana López", 0, 0 );
        Estadio estadio = new Estadio("Ejer10_1.Estadio Nacional", true, 50000);
        torneo.imprimirDatos();
        imprimirTorneos(equipo1, equipo2);
        estadio.imprimirDatos();
    }
}
