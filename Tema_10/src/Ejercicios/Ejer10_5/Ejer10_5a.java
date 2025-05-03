package Ejercicios.Ejer10_5;

class cuentaCorriente {
    String nombre;
    float saldo;
    Boolean bloqueada;


    public cuentaCorriente(String nombre, float saldo, Boolean bloqueada) {
        this.nombre = nombre;
        this.saldo = saldo;
        this.bloqueada = bloqueada;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Saldo: " + saldo);
        System.out.println("Bloqueada: " + bloqueada);
    }
}

public class Ejer10_5a {
    public static void main(String[] args) {
        cuentaCorriente cuenta1 = new cuentaCorriente("Juan", 100.00f, true);
    }
}
