package ClasesAbstractas;

public class Circulo extends Figura {
    private double radius;

    public Circulo(){

    }


    public Circulo(double x, double y, double radius){
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radius * radius ;
    }



}
