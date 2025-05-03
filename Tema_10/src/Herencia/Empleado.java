package Herencia;

public class Empleado extends Persona{
    int num_empleado;
    String cargo;
    double sueldo;

    public Empleado(String id, String nombre, String apellido, String domicilio, String telefono, int num_empleado, String cargo, double sueldo) {
        super(id, nombre, apellido, domicilio, telefono);
        this.num_empleado = num_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNu_empleado() {
        return num_empleado;
    }

    public void setNu_empleado(int nu_empleado) {
        this.num_empleado = nu_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        sueldo = sueldo;
    }
}
