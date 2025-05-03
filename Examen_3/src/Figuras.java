public class Figuras {
    public static void main (String[] args) {

        Cuadrado cuadrado = new Cuadrado(4, 4);
        Circulo circulo = new Circulo(2);
        cuadrado.imprimir();
        circulo.imprimir();
        System.out.println("El cuadrado es mayor que el circulo: " + cuadrado.esMayorQue(circulo));
        System.out.println("El circulo es mayor que el cuadrado: " + circulo.esMayorQue(cuadrado));
    }
}

 interface Figura {

    double perimetro();
    double area();
    void imprimir();
    boolean esMayorQue(Figura figura);

}

class Cuadrado implements Figura {
    double base;
    double altura;

    public Cuadrado (double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double perimetro(){
        return 2 * (base+altura);
    }

    public double area(){
        return base*altura;
    }

    public void imprimir(){
        System.out.println("Perimetro: " + perimetro() + "\nArea: " + area());
    }

    public boolean esMayorQue(Figura figura){
        if (this.area()>figura.area()){
            return true;
        } else {
            return false;
        }
    }
}

class Circulo implements Figura {
    double radius;

    public Circulo (double radius) {
        this.radius = radius;
    }

    public double perimetro(){
        return 2*Math.PI*radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }

    public void imprimir(){
        System.out.println("Perimetro: " + perimetro() + "\nArea: " + area());
    }

    public boolean esMayorQue(Figura figura){
        if (this.area()>figura.area()){
            return true;
        } else {
            return false;
        }
    }
}
