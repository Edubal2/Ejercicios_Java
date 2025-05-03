package Herencia;

public class Consultor extends Persona {
    String nombre;
    int num_consultor;

    public Consultor(String id, String nombre, String apellido, String domicilio, String telefono, String nombre1, int num_consultor) {
        super(id, nombre, apellido, domicilio, telefono);
        this.nombre = nombre1;
        this.num_consultor = num_consultor;
    }
}
