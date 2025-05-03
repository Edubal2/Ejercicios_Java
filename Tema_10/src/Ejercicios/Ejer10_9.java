package Ejercicios;

class Vehiculo{
    float velocidad;
    int numeroDeMarchas;
    int marchaActual = 0;

    public Vehiculo(int numeroDeMarchas){
        this.numeroDeMarchas = numeroDeMarchas;
    }

    void acelerar(int incremento){
        velocidad += incremento;
    }

    void frear(int incremento){
        velocidad -= incremento;
    }

    void subirMarcha(){
        if(marchaActual >= numeroDeMarchas){
            System.out.println("El vehiculo no puede pasar de la marcha: " + numeroDeMarchas);
        } else {
            marchaActual += 1;
        }
    }

    void bajaMarcha(){
        if(marchaActual <= -1){
            System.out.println("El vehiculo no puede reducir mas de la marcha: -1");
        } else {
            marchaActual -= 1;
        }
    }

    String obtenerEstado(){
        return "Velocidad: " + velocidad + "\nMarcha actual: " + marchaActual;
    }
}

public class Ejer10_9 {
    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(5);
        v1.acelerar(5);
        v1.subirMarcha();
        System.out.println(v1.obtenerEstado());
        v1.frear(5);
        v1.bajaMarcha();
        System.out.println(v1.obtenerEstado());
    }
}
