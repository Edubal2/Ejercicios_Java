import java.util.Scanner;

public class Ejer2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el numero de estanterias, estantes, librosn por estqantes y libros totales: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(p * q * r >= n);
    }
}
