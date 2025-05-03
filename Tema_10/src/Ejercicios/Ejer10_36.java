package Ejercicios;

public class Ejer10_36 {
    public static void main(String[]args) {
        InventarioDeFiguras inventario = new InventarioDeFiguras();

        inventario.add(new Rectangulo(5,7));
        inventario.add(new Rectangulo(5,7));
        inventario.add(new Triangulo(6,7, 5, 5, 5));

        inventario.imprimir();
    }

}

interface Figura{
    double perimetro();
    double area();
    void imprimir();
}


class Rectangulo implements Figura{
    private final double base, altura;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public void imprimir() {
        System.out.println("Perimetro: " + perimetro() + "\nArea: " + area());
    }
}

class Triangulo implements Figura{
    private final double base, altura, lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    @Override
    public double perimetro(){
        return lado1 + lado2 + lado3;
    }

    @Override
    public double area(){
        return (base * altura) / 2;
    }

    @Override
    public void imprimir(){
        System.out.println("Perimetro: " + perimetro() + "\nArea: " + area());
    }
}

class InventarioDeFiguras{
    Figura[] figuras = new Figura[100];
    int cont = 0;

    public void add(Figura figura){

        if (cont < figuras.length){
            figuras[cont++] = figura;

        } else {
            System.out.println("No hay espacio");
        }
    }

    public void imprimir(){
        for (int i = 0; i < cont; i++) {
            figuras[i].imprimir();
        }
    }
}
