import java.util.Scanner;

public class Ejer4_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un nunmero y te mostrare esa cantidad de #: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("#");
        }
    }
}
