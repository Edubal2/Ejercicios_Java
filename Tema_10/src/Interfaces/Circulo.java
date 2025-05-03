package Interfaces;

public class Circulo implements Figura, Dibujable, Rotable {
    private double radius;

    public Circulo(){}

    public Circulo(double radius){
        this.radius = radius;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radius * radius ;
    }

    @Override
    public void dibujar() {}

    @Override
    public void rotar() {}

}
