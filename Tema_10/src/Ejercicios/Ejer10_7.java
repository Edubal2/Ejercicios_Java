package Ejercicios;

class Producto {
    String nombre;
    double precio;
    int unidades;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    boolean vender(int unidades) {
        if (this.unidades < unidades) {
            return false;
        } else {
            this.unidades = this.unidades - unidades;
            return true;
        }
    }

    boolean reponer(int unidades) {
        if (unidades <= 0) {
            return false;
        } else {
            this.unidades = this.unidades + unidades;
            return true;
        }
    }

    String mostrarInfo(){
        return "Nombre: " + nombre + ", Precio: " + precio + ", Unidades: " + unidades;
    }

    public void setPrecio(double precio) {
        if (precio <= 0) {
            System.out.println("No pudes introducir un precio negativo");
        } else {
            this.precio = precio;
        }
    }

    public void setUnidades(int unidades) {
        if (unidades <= 0) {
            System.out.println("No pudes introducir una unidad negativa");
        } else {
            this.unidades = unidades;
        }
    }
}


public class Ejer10_7 {
    public static void main(String[] args) {
        Producto leche = new Producto("Leche");
        Producto galletas = new Producto("Galletas");
        leche.setPrecio(2.5);
        galletas.setPrecio(1.5);
        leche.setUnidades(30);
        galletas.setUnidades(5);
        System.out.println(leche.mostrarInfo());
        System.out.println(galletas.mostrarInfo());
        System.out.println("Reponer leche: " + leche.reponer(15));
        System.out.println("Vender galletas: " + galletas.vender(10));
        System.out.println(leche.mostrarInfo());
        System.out.println(galletas.mostrarInfo());
    }
}
