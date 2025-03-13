import java.util.Scanner;

public class Ejer9_20 {
    public static float area(float a, float b) {
        return a * b;
    }
    public static float perimetro(float a, float b) {
        return (2*a) + (2*b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el alto y ancho del rectangulo: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        System.out.println("El area es: " + area(a, b) + " u");
        System.out.print("El perimetro es: " + perimetro(a, b) + " u");
    }
}
