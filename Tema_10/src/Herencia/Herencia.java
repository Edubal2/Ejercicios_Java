package Herencia;

public class Herencia {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("1", "juan", "garnizo", "calle mayor", "555555555", 1, "Reponedor", 3672.25);

        System.out.println(empleado.getCargo());
        empleado.setSueldo(1000);

        System.out.println(empleado.getCargo());
    }
}
