import java.util.Scanner;

public class Ejer2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduze el numero de insectos que se han traido en orden: ");

        int I = sc.nextInt();
        sc.nextLine();
        int A = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.nextLine();
        int M2 = sc.nextInt();
        int S2 = sc.nextInt();
        sc.nextLine();
        int M4 = sc.nextInt();
        int S4 = sc.nextInt();


        int T = (I * 6) + (A * 8) + (C * 10) +( M2 * 2 * S2) + ( M4 * 4 * S4);

        System.out.println("El numero total de patas es: " + T);
    }
}
