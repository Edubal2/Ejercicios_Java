package Ejercicios;

public class Ejer10_23 {
    public static void main(String[] args) {

        Ordenador ordenador = new Ordenador(
                new Pantalla("27 pulgadas", "1920x1080"),
                new Procesador("Intel i7", "3.5 GHz")
        );

        ordenador.mostrarInfo();
    }

}

class Pantalla {
    String tamanio;
    String resolucion;

    public Pantalla(String tamanio, String resolucion) {
        this.tamanio = tamanio;
        this.resolucion = resolucion;
    }
}

class Procesador {
    String modelo;
    String frecuencia;

    public Procesador(String modelo, String frecuencia) {
        this.modelo = modelo;
        this.frecuencia = frecuencia;
    }
}

class Ordenador {
private Pantalla pantalla;
private Procesador procesador;

    public Ordenador(Pantalla pantalla, Procesador procesador) {
        this.pantalla = pantalla;
        this.procesador = procesador;
    }

    public void mostrarInfo() {
        System.out.println("Pantalla: " + pantalla.tamanio + ", " + pantalla.resolucion);
        System.out.println("Procesador: " + procesador.modelo + ", " + procesador.frecuencia);
    }


}


