package Ejercicios;

class Motor{
    protected String tipo;
    protected int caballos;

    public Motor(){}

    public Motor(String tipo, int caballos) {
        this.tipo = tipo;
        this.caballos = caballos;
    }
}

class Coche{
    private Motor motor;
    private String marca;
    private String modelo;

    public Coche(){}

    public Coche(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    String fichaTecnica() {
        return "Ficha Tecnica\nMarca: " + marca + "\nModelo: " + modelo + "\nTipo: " + motor.tipo + "\nCaballos: " + motor.caballos;
    }

}

public class Ejer10_22 {
    public static void main(String[] args) {
        Coche coche = new Coche("Renault", "Clio", new Motor("Diesel", 90));
        System.out.println(coche.fichaTecnica());
    }
}

