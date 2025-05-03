package Ejercicios;

class cuerpoCeleste {
    String name; // Nombre del planeta
    int diameter; // Diametro del planeta en KM
    double distance; // Distancia del Sol en millones de KM

    public cuerpoCeleste(String name, int diameter, double distance) {
        this.name = name;
        this.diameter = diameter;
        this.distance = distance;
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + name);
        System.out.println("Diametro: " + diameter + " KM");
        System.out.println("Distancia al sol : " + distance + " millones de KM\n");
    }
}


public class Ejer10_02 {
    public static void main(String[] args) {
        cuerpoCeleste mercurio = new cuerpoCeleste("Mercurio", 4880,57.9);
        cuerpoCeleste venus = new cuerpoCeleste("Venus", 12104, 108.2);
        cuerpoCeleste tierra = new cuerpoCeleste("Tierra", 12742, 149.6);
        cuerpoCeleste marte = new cuerpoCeleste("Marte", 6770, 227.9);
        cuerpoCeleste jupiter = new cuerpoCeleste("Jupiter", 139820, 778.5);
        cuerpoCeleste saturno = new cuerpoCeleste("Saturno", 116460, 1433.5);
        cuerpoCeleste urano = new cuerpoCeleste("Urano", 50724, 2872.5);
        cuerpoCeleste neptuno = new cuerpoCeleste("Neptuno", 49244, 4495.1);
        cuerpoCeleste sol = new cuerpoCeleste("Sol", 1392700, 0);
        mercurio.imprimirDatos();
        venus.imprimirDatos();
        tierra.imprimirDatos();
        marte.imprimirDatos();
        jupiter.imprimirDatos();
        saturno.imprimirDatos();
        urano.imprimirDatos();
        neptuno.imprimirDatos();
        sol.imprimirDatos();
    }
}

// nombre, diametro, distancia al sol en millones de km.