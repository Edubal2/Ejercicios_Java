import java.util.Scanner;

public class Ejer2_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las coordenadas del rectangulo primero la esquina superior derecha despues la esquina inferior izquierda: ");

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        sc.nextLine();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int r = 2 * (x1 - x2) + 2 * (y1 - y2);

        System.out.println("El perimetro del rectangulo es: " + r);
    }
}
